package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

//        MemberDTO member = new MemberDTO();

        // ID(이름)으로 값 꺼내오기
        MemberDTO member = (MemberDTO) context.getBean("member");
// object 타입으로 형성되어서 dto 불러줘야함

        // 타입으로 꺼내보기
        /*
        * 타입으로 꺼내올 때는, MemberDTO 타입으로 등록된 빈이 하나가 아닐 수 있기 때문에
        * 모호성 에러가 생길 수 있다.
         */
        MemberDTO member2 =context.getBean(MemberDTO.class);


        // 타입과 id(이름)으로 값 꺼내오기
        MemberDTO member3 =context.getBean("member",MemberDTO.class);

        System.out.println(member);


    }
}
