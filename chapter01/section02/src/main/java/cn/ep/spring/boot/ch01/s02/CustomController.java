package cn.ep.spring.boot.ch01.s02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/foo")
    public String foo() {
        return foo;
    }

}
