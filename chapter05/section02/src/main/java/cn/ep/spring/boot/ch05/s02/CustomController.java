package cn.ep.spring.boot.ch05.s02;

import brave.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${server.port}")
    private String port;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Tracer tracer;

    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "admin") String name) {
        Span span = tracer.nextSpan().name("test").start();
        span.tag("service-name", "hi");
        logger.info("service hi");
        try {
            return restTemplate.getForObject("http://localhost:" + this.port + "/hi2?name=" + name, String.class);
        } finally {
            span.finish();
        }
    }

    @RequestMapping("/hi2")
    public String hi2(@RequestParam(value = "name", defaultValue = "admin") String name) {
        tracer.currentSpan().tag("service-name", "hi2");
        logger.info("service hi2");
        return "hi " + name + " ,i am from port:" + port;
    }

}
