package com.thoughtworks.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    QUORUM_CONNECTION_ERROR(INTERNAL_SERVER_ERROR, 500_00, "Quorum 连接错误"),
    INVALID_ADDRESS(BAD_REQUEST, 400_00, "用户地址格式有误"),
    SEND_TRANSACTION_ERROR(INTERNAL_SERVER_ERROR, 500_00, "交易发送失败"),
    FILE_READ_ERROR(INTERNAL_SERVER_ERROR, 500_00, "文件读取错误"),
    HEALTH_VERIFICATION_NOT_FOUND(BAD_REQUEST, 400_00, "该用户暂无健康认证信息"),
    HEALTH_VERIFICATION_CREATE_FAILED(BAD_REQUEST, 500_00, "用户健康认证信息上链失败"),
    HEALTH_VERIFICATION_ALREADY_EXIST(BAD_REQUEST, 400_00, "该用户已创建健康认证信息"),
    INSERT_INTO_DATABASE_ERROR(BAD_REQUEST, 400_00, "健康认证信息入库错误"),
    INVALID_HEALTHY_STATUS(BAD_REQUEST, 400_00, "健康状态填写有误，只可为'healthy'和'unhealthy'。");

    @NonNull
    private HttpStatus status;

    private int errCode;

    @NonNull
    private String message;
}

