package com.ohgiraffers.common;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper=true)

public class Bread extends Product{

    private LocalDate bakedDate; // 생산시간

    // 부모클래스까지 초기화 하는 생성자
    public Bread(String name, int price, LocalDate bakedDate) {
        super(name, price);     // 부모클래스의 생성자
        this.bakedDate = bakedDate;
    }


    //    @Override
//    public String toString() {
//        return "Bread [bakedDate=" + bakedDate + "]";
//    }

}
