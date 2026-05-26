package com.brainworks.SpringProjectUsingCoreJavaKnowledge;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MyApplication application = new MyApplication();
		application.saveData();
		application.divideData();

	}
}
