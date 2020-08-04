package com.spring.address.exception;

import com.spring.address.common.RespCode;

public class ControllerException extends RuntimeException{
    private String msg;
    private int status;
    public ControllerException(RespCode respCode) {
        super(respCode.getMsg());
        this.status = respCode.getStatus();
    }
}
