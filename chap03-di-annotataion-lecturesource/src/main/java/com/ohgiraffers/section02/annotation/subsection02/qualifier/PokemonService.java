package com.ohgiraffers.section02.annotation.subsection02.qualifier;


import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*
* @Qualifier
* - 야러 개의 빈 객체 중에서 특정 빈 객체를 이름으로 지정하는 어노테이션이다.
* - @Primary어노테이션과 @qualiter 어노테이션이 함께 쓰였을 때, @Qulifierrk dntjsgksek.
 */
@Service("pocemonServiceQualifier")
public class PokemonService {

    @Qualifier("pikachu")
    @Autowired
    private Pokemon pokemon;


    @Autowired
    public PokemonService(@Qualifier("pikachu") Pokemon pokemon){
        this.pokemon = pokemon;
    }

    public void pokemonAttack(){
        pokemon.attack();
    }
}
