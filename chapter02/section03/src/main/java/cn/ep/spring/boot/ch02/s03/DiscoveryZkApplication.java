package cn.ep.spring.boot.ch02.s03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DiscoveryZkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryZkApplication.class, args);
    }

}
