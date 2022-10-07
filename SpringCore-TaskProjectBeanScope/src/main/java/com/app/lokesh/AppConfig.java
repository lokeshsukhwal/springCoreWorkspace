package com.app.lokesh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan(basePackages = "com.app.lokesh")
@Configuration
public class AppConfig {
	@Bean
	@Scope("singleton")
	public Token token() {
		Token token = new Token();
		token.setCode(50);
		return token;
	}

}
