package com.ohgiraffers.practice01.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfiguration {

    public static Long SINGLETON_COUNT = 1L;
    public static Long PROTOTYPE_COUNT = 1L;


    @Bean
    @Scope("singleton")
    public SingletonBean singletonBean() {
        return new SingletonBean(SINGLETON_COUNT+"번째 메세지");
    }

    @Bean
    @Scope("prototype")
    public PrototypeBean prototypeBean() {
        return new PrototypeBean(PROTOTYPE_COUNT+"번째 메세지");
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public InitDestoryBean initDestoryBean (){
        return new InitDestoryBean();
    }

//    @Value("${bread.carpbread.name:팥붕어빵}")
//    private String ;

    /* 위의 정적 변수를 활용하여 빈 등록 코드 작성 */
}