package com.ohgiraffers.section01.socpe.subsection01.singleton;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;

@ToString
public class ContextConfiguration {

    @Bean
    public Product carpBread(){
        return new Bread("붕어빵", 1000, LocalDate.now());
    }

    @Bean
    public Product milk(){

        return new Beverage("딸기우유",1500,500);
    }

    @Bean
    public Product water(){
        return new Beverage("지리산암반수", 3000,500);

    }

    @Bean
//    @Scope("singleton")
    public ShoppingCart cart(){
        return new ShoppingCart();
    }

}
