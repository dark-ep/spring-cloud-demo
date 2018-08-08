package cn.ep.spring.boot.ch01.s03;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope//刷新配置
@ConfigurationProperties(prefix = "config")
public class CustomConfig {

    // # /config/config-zk/config/key=value
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
