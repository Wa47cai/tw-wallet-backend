package com.thoughtworks.wallet.healthyVerifier;

import org.springframework.beans.factory.annotation.Value;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Value("${quorum.health-verification-claim.contract-address}")
@Retention(RetentionPolicy.RUNTIME)
public @interface HealthVerificationClaimContractAddress {
}