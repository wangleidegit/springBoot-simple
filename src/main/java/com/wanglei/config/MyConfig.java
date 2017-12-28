package com.wanglei.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 *
 */

@Configuration
public class MyConfig {

    @Value("${from}")
    private String from;

    public String getFrom() {
        return from;
    }
}
