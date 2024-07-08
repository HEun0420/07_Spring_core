package com.ohgiraffers.practice01.bean;

import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ToString
public class SingletonBean {
    private String message;

    public SingletonBean(String message) {
        this.message = message;
    }


    @Bean
    public String getMessage() {
        return message;
    }
}
