package com.thoughtworks.wallet.healthy.controller;

import com.thoughtworks.wallet.healthy.dto.ChangeHealthVerificationRequest;
import com.thoughtworks.wallet.healthy.dto.HealthVerificationRequest;
import com.thoughtworks.wallet.healthy.dto.HealthVerificationResponse;
import com.thoughtworks.wallet.healthy.dto.JwtResponse;
import com.thoughtworks.wallet.healthy.service.IHealthyClaimService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@Validated
@RequestMapping(value = "/v1/health-certifications")
@Api(tags = "健康认证服务")
public class HealthyVerifierController {

    private final IHealthyClaimService healthyVerifierService;

    public HealthyVerifierController(IHealthyClaimService healthyVerifierService) {
        this.healthyVerifierService = healthyVerifierService;
    }

    @PostMapping
    @ApiOperation(value = "添加健康认证")
    public JwtResponse createHealthVerification(@Valid @RequestBody HealthVerificationRequest healthVerification) {
        return healthyVerifierService.createHealthVerification(healthVerification);
    }

    @GetMapping("/{ownerId}")
    @ApiOperation(value = "根据 owner DID 获取 健康认证")
    public HealthVerificationResponse getHealthVerification(@PathVariable(value = "ownerId") String ownerId) {
        return healthyVerifierService.getHealthVerification(ownerId);
    }

    @PutMapping
    @ApiOperation(value = "修改健康认证")
    public HealthVerificationResponse changeHealthVerification(@Valid @RequestBody ChangeHealthVerificationRequest changeHealthVerificationRequest) {
        return healthyVerifierService.changeHealthVerification(changeHealthVerificationRequest);
    }
}