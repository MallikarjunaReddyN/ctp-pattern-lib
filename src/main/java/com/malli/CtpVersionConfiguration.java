package com.malli;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@EnableConfigurationProperties(CtpVersionMap.class)
public class CtpVersionConfiguration {

    @Bean
    @RefreshScope
    public CtpVersionDetails ctpVersionDetails(CtpVersionMap ctpVersionMap) {
        return new CtpVersionDetails(ctpVersionMap);
    }
}
