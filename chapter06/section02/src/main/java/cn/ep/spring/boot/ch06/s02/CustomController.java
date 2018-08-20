package cn.ep.spring.boot.ch06.s02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RefreshScope
public class CustomController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/foo")
    public String foo() {
        return foo;
    }

}
