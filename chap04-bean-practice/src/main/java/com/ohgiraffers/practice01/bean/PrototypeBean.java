package com.ohgiraffers.practice01.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PrototypeBean {

    private String message;

    public PrototypeBean(String message) {
        this.message = message;
    }

    @Bean
    public String getMessage() {
        return message;
    }
}
