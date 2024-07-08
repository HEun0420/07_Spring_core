package com.ohgiraffers.section03;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;

@Configuration
@PropertySource("section03/properties/product-info.properties")
public class ContextConfiguration {

    /*
    * 치환자(place-holder) 문법을 이용하여
    * properties에 저장된 key를 입력하면 value에 해당하는 값을 꺼내온다.
    *
    * 주의! 공백을 사용하면 값을 읽어지 못한다.
    *
    * : 을 사랑하면 값을 읽어오지 못하는 경우 사용할 대체값을 작성할 수 있다.
     */

    @Value("${bread.carpbread.name:팥붕어빵}")
    private String crapBreadName;

//    // 값은 여러번 불러와서 사용 가능하다.
//    @Value("${bread.carpbread.name:슈크림붕어빵}")
//    private String crapBreadName2;


    @Value("${bread.carpbread.price:0}")
    private int crapBreadPrice;

    @Bean
    public Product carpBread() {
        return new Bread(crapBreadName,crapBreadPrice, LocalDate.now());
    }

    @Value("${bread.milk.name:그냥 우유}")
    private String milkName;

    @Value("${bread.milk.price:0}")
    private int milkPrice;

    @Value("${bread.milk.capacity:0}")
    private int milkCapacity;

    @Bean
    public Product milk(){
        return new Beverage(milkName,milkPrice,milkCapacity);
    }

    @Bean
    public Product water(@Value("${beverage.water.name:0}")String waterName,
                         @Value("${beverage.water.price:0}")int waterPrice,
                         @Value("${bread.milk.capacity:0}")int waterCapacity){
        return new Beverage(waterName,waterPrice,waterCapacity);
    }

    @Bean
    @Scope("prototype")
    public ShoppingCart cart() {
        return new ShoppingCart();
    }



}
