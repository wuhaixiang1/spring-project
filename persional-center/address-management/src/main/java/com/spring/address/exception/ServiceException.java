package com.spring.address.exception;

import com.spring.address.common.RespCode;
import lombok.Data;

@Data
public class ServiceException extends RuntimeException{
    private String msg;
    private int status;
    private RespCode respCode;
    public ServiceException(RespCode respCode) {
        super(respCode.getMsg());
        this.status = respCode.getStatus();
        this.respCode = respCode;
    }
}
