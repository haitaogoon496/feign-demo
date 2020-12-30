package com.spring.cloud.feigndemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserClientFallbackConfiguration {

    @Bean
    public UserClientFallback userClientFallback() {
        return new UserClientFallback();
    }
}
