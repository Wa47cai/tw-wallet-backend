package com.thoughtworks.wallet.common.exception;

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
    FILE_READ_ERROR(INTERNAL_SERVER_ERROR, 500_00, "文件读取错误");

    @NonNull
    private HttpStatus status;

    private int errCode;

    @NonNull
    private String message;
}

