package com.spring.cloud.config.clientconfigdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client/")
public class ClientDemoController {

    @Value("${word:默认}")
    private String string;

    @Value("${profile}")
    private String profile;

    @GetMapping("index/{name}")
    public String index(@PathVariable("name") String name) {
        return name + " " + string + "-" + profile;
    }
}
