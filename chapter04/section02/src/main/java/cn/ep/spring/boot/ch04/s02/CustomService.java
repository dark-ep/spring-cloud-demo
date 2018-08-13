package cn.ep.spring.boot.ch04.s02;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "service-hi", fallback = CustomServiceHystric.class)
public interface CustomService {

    @GetMapping(value = "/hi")
    String hiService(@RequestParam(value = "name", defaultValue = "admin") String name);

}
