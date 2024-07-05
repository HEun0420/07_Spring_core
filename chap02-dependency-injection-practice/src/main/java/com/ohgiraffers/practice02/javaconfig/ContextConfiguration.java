package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

@Bean("member")
    public MemberDTO memberValue(){
    return new MemberDTO (1L,"봄이 올까요?");
}

@Bean("board")
    public BoardDTO boardGener(){

    BoardDTO board = new BoardDTO();
    board.setId(1L);
    board.setTitle("의존성 주입 연습");
    board.setContent("게시글 작성자 객체를 주입 받아볼게");
    board.setWriter(memberValue());

    return board;
}

}
