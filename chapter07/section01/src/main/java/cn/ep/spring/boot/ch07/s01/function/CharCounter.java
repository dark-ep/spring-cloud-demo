package cn.ep.spring.boot.ch07.s01.function;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CharCounter implements Function<String, Integer> {

    @Override
    public Integer apply(String word) {
        return word.length();
    }
}
