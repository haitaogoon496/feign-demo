package com.spring.cloud.feigndemo.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotLogInException extends RuntimeException {

    private String code;
    private String msg;

    public NotLogInException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
