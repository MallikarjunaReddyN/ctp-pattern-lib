package com.malli;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.Map;
import java.util.regex.Pattern;

@RefreshScope
@ConfigurationProperties(prefix = "ctp")
public record CtpVersionMap(Map<String, Pattern> version) {
}
