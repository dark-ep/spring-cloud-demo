package cn.ep.spring.boot.ch01.s03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigZKApplication {

    // # /config/config-zk/server/port=8882
    public static void main(String[] args) {
        SpringApplication.run(ConfigZKApplication.class, args);
    }

}
