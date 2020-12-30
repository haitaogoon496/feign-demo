package com.spring.cloud.feigndemo.controller;

import com.spring.cloud.feigndemo.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order/")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("getOrder")
    public String getOrder() {
        return orderService.getUserName();
    }
}
