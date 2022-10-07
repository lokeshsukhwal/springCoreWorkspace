package com.app.lokesh;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.app.lokesh")
public class AppConfig {
	@Bean
	public MyRepository m1() {
		MyRepository m1 = new MyRepository();
		m1.setCode("CODE_ONE");
		return m1;
	}
	
	@Bean
	/* Container choice solution one auto selection */
//	@Primary 
	public MyRepository m2() {
		MyRepository m2 = new MyRepository();
		m2.setCode("CODE_TWO");
		return m2;
	}

}
