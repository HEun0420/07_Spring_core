package com.ohgiraffers.practice03.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com/ohgiraffers/practice03/setter");

        MemberController memberController = context.getBean("controller", MemberController.class);

        System.out.println(memberController.selectMember());
    }
}
