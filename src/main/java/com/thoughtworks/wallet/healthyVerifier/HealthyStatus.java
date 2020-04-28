package com.thoughtworks.wallet.healthyVerifier;

import lombok.Getter;

public enum HealthyStatus {
    HEALTHY("healthy"),
    UNHEALTHY("unhealthy");

    @Getter
    private String status;

    HealthyStatus(String status) {
        this.status = status;
    }
}
