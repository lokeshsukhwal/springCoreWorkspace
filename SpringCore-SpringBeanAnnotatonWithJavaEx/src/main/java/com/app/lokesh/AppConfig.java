package com.app.lokesh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@ComponentScan(basePackages = "com.app.lokesh")
@Configuration
public class AppConfig {
	@Bean
	@Scope("prototype")
	public Token token() {
		Token token = new Token();
		return new Token();
	}
}
