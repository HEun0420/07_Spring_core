package com.ohgiraffers.common;

import lombok.*;

@Getter
@Setter
@ToString
public class MemberDTO {

    private Long id;
    private String nickname;


    public MemberDTO(Long id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }
}
