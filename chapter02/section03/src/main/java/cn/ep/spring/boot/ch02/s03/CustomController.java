package cn.ep.spring.boot.ch02.s03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "admin") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

}
