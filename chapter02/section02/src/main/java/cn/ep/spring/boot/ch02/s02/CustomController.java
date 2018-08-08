package cn.ep.spring.boot.ch02.s02;

import org.springframework.web.bind.annotation.*;

@RestController
public class CustomController {

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "admin") String name) {
        return "hi " + name;
    }

}
