package com.client.comfigtion;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "com.lcg.test")
@Data
@Component
@RefreshScope
public class MyConfiguation {

    private String username;

    private String password;

}
