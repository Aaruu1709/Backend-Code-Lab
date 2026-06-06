package com.aaruu.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.aaruu.datajpa.service.ProductService;

@SpringBootApplication
public class Springbootdatajpa7Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springbootdatajpa7Application.class, args);
		ProductService service = context.getBean(ProductService.class);
//		service.saveData();
		service.findProductByName("Laptop");
	}

}
