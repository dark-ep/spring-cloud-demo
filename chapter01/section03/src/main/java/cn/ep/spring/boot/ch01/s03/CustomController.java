package cn.ep.spring.boot.ch01.s03;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomController {

    // # /config/config-zk/foo=foo2
    @Value("${foo}")
    private String foo;
    @Autowired
    private CustomConfig customConfig;

    @RequestMapping(value = "/foo")
    public String foo() {
        return foo;
    }

    @RequestMapping(value = "/config")
    public String config() {
        return customConfig.getKey();
    }

}
