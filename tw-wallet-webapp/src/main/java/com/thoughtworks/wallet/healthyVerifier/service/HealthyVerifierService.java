package com.thoughtworks.wallet.healthyVerifier.service;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.thoughtworks.common.util.JacksonUtil;
import com.thoughtworks.wallet.healthyVerifier.HealthVerificationRequest;
import com.thoughtworks.wallet.healthyVerifier.HealthVerificationResponse;
import com.thoughtworks.wallet.healthyVerifier.annotation.HealthVerificationClaimIssuerAddress;
import com.thoughtworks.wallet.healthyVerifier.exception.HealthVerificationAlreadyExistException;
import com.thoughtworks.wallet.healthyVerifier.exception.HealthVerificationNotFoundException;
import com.thoughtworks.wallet.healthyVerifier.exception.InsertIntoDatabaseErrorException;
import com.thoughtworks.wallet.healthyVerifier.model.HealthVerificationClaim;
import com.thoughtworks.wallet.healthyVerifier.model.HealthyCredential;
import com.thoughtworks.wallet.healthyVerifier.model.HealthyStatus;
import com.thoughtworks.wallet.healthyVerifier.model.HealthyStatusWrapper;
import com.thoughtworks.wallet.healthyVerifier.utils.ClaimIdUtil;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.JSON;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import static com.thoughtworks.wallet.gen.Tables.TBL_HEALTHY_VERIFICATION_CLAIM;

@Slf4j
@Service
public class HealthyVerifierService implements IHealthyVerifierService {
    private final DSLContext dslContext;
    private final ClaimIdUtil claimIdUtil;
    private final HealthyClaimContractService healthyClaimContractService;

    @HealthVerificationClaimIssuerAddress
    private String issuerAddress;

    public final static String DIDSchema = "DID:TW:";
    private final String VER = "0.1";
    final ImmutableList<String> context = ImmutableList.of("https://blockchain.thoughtworks.cn/credentials/v1/");
    final ImmutableList<String> credentialType = ImmutableList.of("HealthyCredential");

    private String issuerDid = DIDSchema + issuerAddress;

    // 假设 claim 30 天后过期
    final int expireHours = 30 * 24;

    public HealthyVerifierService(DSLContext dslContext, ClaimIdUtil claimIdUtil, HealthyClaimContractService healthyClaimContractService) {
        this.dslContext = dslContext;
        this.claimIdUtil = claimIdUtil;
        this.healthyClaimContractService = healthyClaimContractService;
    }

    @Override
    public HealthVerificationResponse createHealthVerification(HealthVerificationRequest healthVerification) {
        HealthVerificationClaim claim = generateHealthyVerificationClaim(healthVerification.getDid(), healthVerification.getPhone());

        final int insertedNumber;
        try {
            insertedNumber = dslContext
                .insertInto(TBL_HEALTHY_VERIFICATION_CLAIM)
                .set(TBL_HEALTHY_VERIFICATION_CLAIM.CONTEXT, claim.getContext().get(0))
                .set(TBL_HEALTHY_VERIFICATION_CLAIM.VER, claim.getVer())
                .set(TBL_HEALTHY_VERIFICATION_CLAIM.ID, claim.getId())
                .set(TBL_HEALTHY_VERIFICATION_CLAIM.ISS, claim.getIss())
                .set(TBL_HEALTHY_VERIFICATION_CLAIM.IAT, claim.getIat())
                .set(TBL_HEALTHY_VERIFICATION_CLAIM.EXP, claim.getExp())
                .set(TBL_HEALTHY_VERIFICATION_CLAIM.TYP, claim.getTyp().get(0))
                .set(TBL_HEALTHY_VERIFICATION_CLAIM.SUB, JSON.valueOf(JacksonUtil.beanToJSonStr(claim.getSub())))
                .execute();

        } catch (DataIntegrityViolationException e) {
            log.error("Healthy verification of owner:{} is already existed.", healthVerification.getDid());
            throw new HealthVerificationAlreadyExistException(healthVerification.getDid());
        }

        if (insertedNumber != 1) {
            log.error("Insert into database error: can not insert healthy verification of owner: {}.", healthVerification.getDid());
            throw new InsertIntoDatabaseErrorException(healthVerification.getDid());
        }

        healthyClaimContractService.createHealthVerification(issuerAddress, claim.getId(), healthVerification.getDid(), issuerDid);

        return HealthVerificationResponse.of(
            claim.getContext(),
            claim.getId(),
            claim.getVer(),
            claim.getIss(),
            claim.getIat(),
            claim.getExp(),
            claim.getTyp(),
            claim.getSub()
        );
    }

    @Override
    public HealthVerificationResponse getHealthVerification(String ownerId) {
        final HealthVerificationClaim claim =
            Optional.ofNullable(dslContext
                                    .selectFrom(TBL_HEALTHY_VERIFICATION_CLAIM)
                                    .where(TBL_HEALTHY_VERIFICATION_CLAIM.OWNER.equal(ownerId))
                                    .fetchOneInto(HealthVerificationClaim.class))
                    .orElseThrow(() -> new HealthVerificationNotFoundException(ownerId));

        return HealthVerificationResponse.of(
            claim.getContext(),
            claim.getId(),
            claim.getVer(),
            claim.getIss(),
            claim.getIat(),
            claim.getExp(),
            claim.getTyp(),
            claim.getSub()
        );
    }

    private HealthVerificationClaim generateHealthyVerificationClaim(String did, String phone) {
        final String claimId = claimIdUtil.generateClaimId(did, VER);

        final Instant instant = Instant.now();
        final long currentTime = instant.getEpochSecond();

        final Instant expireInstant = instant.plusMillis(TimeUnit.HOURS.toMillis(expireHours));
        final long expireTime = expireInstant.getEpochSecond();

        final HealthyStatusWrapper healthyStatus = generateHealthyStatus(phone);
        return HealthVerificationClaim.of(
            context,
            claimId,
            VER,
            issuerDid,
            currentTime,
            expireTime,
            credentialType,
            HealthyCredential.of(did, phone, healthyStatus));
    }

    private HealthyStatusWrapper generateHealthyStatus(String phone) {
        // TODO: mock healthy status: last number of phone is odd number, then it's UNHEALTHY, Otherwise its HEALTHY
        Map<Integer, String> healthyStatus = ImmutableMap.of(0, HealthyStatus.HEALTHY.getStatus(), 1, HealthyStatus.UNHEALTHY.getStatus());
        String lastChar = phone.substring(phone.length() - 1);
        final int lastNumber = Integer.parseInt(lastChar);
        int no = lastNumber % 2;
        return HealthyStatusWrapper.of(healthyStatus.get(no));
    }
}
