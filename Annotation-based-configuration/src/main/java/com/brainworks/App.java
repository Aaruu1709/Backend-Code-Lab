package com.brainworks;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//        System.out.println( "Hello World!" );
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);// becaouse
																												// of
																												// this
																												// line
		// So even if @Configuration is removed, Spring still reads the class and
		// processes @Bean methods.
		Employee e = (Employee) context.getBean("empData");
		System.out.println(e.getEmpName() + " " + e.getEmpDesignation() + " " + e.getEmpSalary());

		System.out.println("--------------------------------------------------------");

		MyOffice o = (MyOffice) context.getBean("officeData");
		System.out.println(o.getOfficeId() + " " + o.getOfficeName());
	}
}
