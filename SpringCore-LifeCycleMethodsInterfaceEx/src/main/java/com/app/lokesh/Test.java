package com.app.lokesh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		DataExport export = context.getBean("dataExport", DataExport.class);
		System.out.println(export);
		context.close();
	}
}
