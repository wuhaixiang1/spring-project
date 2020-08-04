package com.spring.car.handler;

import com.spring.car.common.RespEntity;
import com.spring.car.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalHandlerException {
    @ExceptionHandler(Exception.class)
    public RespEntity<Object> exception(Exception e) {
        if (e instanceof ServiceException) {
            ServiceException e2 = (ServiceException) e;
            log.error(e.getMessage());
            return  RespEntity.error(e2.getRespCode());
        }
        return RespEntity.error();
    }

}
