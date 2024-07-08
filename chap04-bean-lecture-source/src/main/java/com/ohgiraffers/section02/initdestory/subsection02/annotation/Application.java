package com.ohgiraffers.section02.initdestory.subsection02.annotation;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        Product carpBread = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
        cart1.addItem(carpBread);
        cart1.addItem(milk);

        System.out.println("cart1에 담긴 상품: " + cart1.getItems());

        ShoppingCart cart2 = context.getBean("cart" , ShoppingCart.class);
        cart2.addItem(water);

        System.out.println("cart2에 담긴 상품: " + cart2.getItems());


        // destory 메소드 작동을 확인하기 위해 강제로 context 종료
        // 실제로는 컨테이너가 종료될 때 bean이 소멸하거나,
        // 메모리에서 가비지 컬렉터가 해당 빈을 메모리에서 지울 때 동작하게 된다.
        ((AnnotationConfigApplicationContext)context).close();

    }
}
