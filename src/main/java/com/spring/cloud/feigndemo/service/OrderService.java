package com.spring.cloud.feigndemo.service;


import com.spring.cloud.feigndemo.client.UserClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderService {

    @Resource
    private UserClient userClient;


    public String getUserName() {
        return userClient.getUserName();
    }
}
