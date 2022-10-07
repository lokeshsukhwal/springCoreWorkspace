package com.app.lokesh;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:app.properties")
@ComponentScan(basePackages = "com.app.lokesh")
@Component
public class AppConfig {

}
