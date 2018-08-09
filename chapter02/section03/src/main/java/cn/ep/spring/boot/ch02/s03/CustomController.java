package cn.ep.spring.boot.ch02.s03;

import org.springframework.beans.factory.annotation.*;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CustomController {

    @Value("${spring.application.name}")
    private String instanceName;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/services")
    public List<String> serviceUrl() {
        List<ServiceInstance> list = discoveryClient.getInstances(instanceName);
        List<String> services = new ArrayList<>();
        if (list != null && list.size() > 0) {
            list.forEach(serviceInstance -> services.add(serviceInstance.getUri().toString()));
        }
        return services;
    }

}
