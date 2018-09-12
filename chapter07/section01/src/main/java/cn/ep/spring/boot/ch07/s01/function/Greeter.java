package cn.ep.spring.boot.ch07.s01.function;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class Greeter implements Function<String, String> {

    @Override
    public String apply(String name) {
        return "Hello " + name;
    }
}
