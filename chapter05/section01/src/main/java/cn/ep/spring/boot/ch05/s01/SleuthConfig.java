package cn.ep.spring.boot.ch05.s01;

import brave.sampler.Sampler;
import org.springframework.context.annotation.*;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SleuthConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Sampler sampler() {
        return Sampler.NEVER_SAMPLE;
    }

}
