package com.aaruu.pagination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.aaruu.pagination.service.EmployeeService;

@SpringBootApplication
public class PaginationDemo1Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext	context =SpringApplication.run(PaginationDemo1Application.class, args);
 EmployeeService emp= 	context.getBean(EmployeeService.class);
		
		emp.
	}

}
