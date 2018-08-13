package cn.ep.spring.boot.ch03.s03;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "service-hi")
public interface CustomService {

    @GetMapping(value = "/hi")
    String hiService(@RequestParam(value = "name", defaultValue = "admin") String name);

}
