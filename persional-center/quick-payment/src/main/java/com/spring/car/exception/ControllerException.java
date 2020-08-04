package com.spring.car.exception;

import com.spring.car.common.RespCode;

public class ControllerException extends RuntimeException{
    private String msg;
    private int status;
    public ControllerException(RespCode respCode) {
        super(respCode.getMsg());
        this.status = respCode.getStatus();
    }
}
