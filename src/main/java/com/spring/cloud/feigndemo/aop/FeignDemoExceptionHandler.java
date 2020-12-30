package com.spring.cloud.feigndemo.aop;

import com.spring.cloud.feigndemo.exception.NotLogInException;
import com.spring.cloud.feigndemo.resp.ResultBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class FeignDemoExceptionHandler {


    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public ResultBody exceptionHandler(Exception e){
        log.error(e.getMessage(), e);
        return ResultBody.error(e.getMessage());
    }


    @ExceptionHandler(value = NotLogInException.class)
    @ResponseBody
    public ResultBody exceptionHandler(NotLogInException e){
        log.error(e.getMsg(), e);
        return ResultBody.error(e.getMsg());
    }
}
