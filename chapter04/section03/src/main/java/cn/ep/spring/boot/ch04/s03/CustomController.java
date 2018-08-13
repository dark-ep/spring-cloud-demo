package cn.ep.spring.boot.ch04.s03;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(@RequestParam(value = "name", defaultValue = "admin") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }

}
