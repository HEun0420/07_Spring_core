package com.ohgiraffers.section02.annotation.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


/*
* @Primary
* @Autowired 로 도일한 타입의 여러 bean을 찾게 되는 경우 자동으로 연결된 우선 시 할 타입 설정
* 동일한 타입의 클래스 중 한 개만 @Primary 어노테이션을 사용할 수 있다.
 */
@Primary
@Component
public class Squirtle implements Pokemon{
    @Override
    public void attack() {
        System.out.println("꼬부기 물대포 발싸💧🌊🌊");
    }
}
