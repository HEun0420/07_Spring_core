package com.ohgiraffers.section03.annotationconfig.subsection01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context=
                new AnnotationConfigApplicationContext(ContextConfiguration.class);


    /*
    * getBeanDefinitionName : 스프링 컨테이너에서 생성된 beand들의 이름을 배열로 변환한다.
     */

        String[] beanNames = context.getBeanDefinitionNames();
        for(String beanName: beanNames){
            System.out.println(beanName);
        }

    }

}
