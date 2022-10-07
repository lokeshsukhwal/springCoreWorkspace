package com.app.lokesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("before container creation");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("after container creation");
		
		System.out.println("printing the object from container");
		Token tokenOne = context.getBean("token", Token.class);
		System.out.println(tokenOne);
		
		Token tokenTwo = context.getBean("token", Token.class);
		System.out.println(tokenTwo);
	}
}
