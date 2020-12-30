package com.spring.cloud.feigndemo.client;

import com.spring.cloud.feigndemo.configuration.UserClientFallback;
import com.spring.cloud.feigndemo.configuration.UserClientFallbackConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "demo-provider",configuration = UserClientFallbackConfiguration.class,fallback = UserClientFallback.class)
public interface UserClient {

    @RequestMapping(value = "/user/getUserName?name=feign",method = RequestMethod.GET)
    String getUserName();
}
