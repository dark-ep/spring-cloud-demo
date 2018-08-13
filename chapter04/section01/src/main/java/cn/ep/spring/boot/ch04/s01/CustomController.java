package cn.ep.spring.boot.ch04.s01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomController {

    @Autowired
    private CustomService customService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "admin") String name) {
        return customService.hiService(name);
    }

}
