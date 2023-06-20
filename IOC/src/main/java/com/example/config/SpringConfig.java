package com.example.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Configuration
@Component("com.example.config")
@Import({JdbcConfig.class})
public class SpringConfig {
}
