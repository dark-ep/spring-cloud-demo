package cn.ep.spring.boot.ch07.s01.function;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@Component
public class Exclaimer implements Function<Flux<String>, Flux<String>> {

    @Override
    public Flux<String> apply(Flux<String> words) {
        return words.map(word -> word + "!!!");
    }
}
