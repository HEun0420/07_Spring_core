package com.ohgiraffers.section01.autowired.common;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// @Component의 세분화 어노테이션의 한 종류로 DAO 타입의 객체에 상용한다.

@Repository("bookDAO")
public class BookDAOlmpl implements BookDAO{

    private Map<Integer, BookDTO> booklist;


    public BookDAOlmpl() {
        booklist = new HashMap<>();

        booklist.put(1,new BookDTO
                (1,123456,"자바의정석","남궁성","도우출판", LocalDate.now()));
        booklist.put(2,new BookDTO(2,456789,"칭찬은 고래도 춤추게한다.","고래","고래출판", LocalDate.now()));

    }

    @Override
    public List<BookDTO> selectBookList() {
        return new ArrayList<>(booklist.values());
    }

    @Override
    public BookDTO selectOneBook(int sequence) {
       return booklist.get(sequence);
    }
}
