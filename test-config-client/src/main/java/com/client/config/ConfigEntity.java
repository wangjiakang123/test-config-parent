package com.client.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "com.lcg")
@RefreshScope
public class ConfigEntity {

    private String username;

    private String password;

}
