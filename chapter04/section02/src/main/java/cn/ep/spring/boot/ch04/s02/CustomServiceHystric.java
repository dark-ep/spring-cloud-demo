package cn.ep.spring.boot.ch04.s02;

import org.springframework.stereotype.Component;

@Component
public class CustomServiceHystric implements CustomService {

    @Override
    public String hiService(String name) {
        return "sorry " + name;
    }
}
