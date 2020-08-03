package com.spring.project.commom;

import lombok.Data;

@Data
public class RespEntity<T> {
    private int status;
    private String msg;
    private String tips;
    private T data;

    public RespEntity(int status, String msg, String tips, T data) {
        this.status = status;
        this.msg = msg;
        this.tips = tips;
        this.data = data;
    }
    public RespEntity(RespCode respCode, T data) {
        this.status = respCode.status;
        this.data = data;
        this.msg = respCode.msg;
        this.tips = respCode.tips;
    }

    public static <T> RespEntity<T> success(T data) {
        return success(RespCode.SUCCESS, data);
    }

    public static <T> RespEntity<T> success(RespCode respCode, T data) {
        return new RespEntity<T>(respCode, data);
    }

    public static <T> RespEntity<T> error(RespCode respCode) {
        return new RespEntity<T>(respCode, null);
    }

    public static <T> RespEntity<T> error() {
        return error(RespCode.ERROR);
    }
}
