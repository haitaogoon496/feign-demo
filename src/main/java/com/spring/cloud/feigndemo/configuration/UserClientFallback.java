package com.spring.cloud.feigndemo.configuration;

import com.spring.cloud.feigndemo.client.UserClient;

public class UserClientFallback implements UserClient {
    @Override
    public String getUserName() {
        return "服务开小车了,请稍后重试";
    }
}
