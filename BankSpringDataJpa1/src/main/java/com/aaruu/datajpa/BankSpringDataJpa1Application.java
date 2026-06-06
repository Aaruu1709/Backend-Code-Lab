package com.aaruu.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.aaruu.datajpa.service.BankService;

@SpringBootApplication
public class BankSpringDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext obj = SpringApplication.run(BankSpringDataJpa1Application.class, args);

		BankService customer = obj.getBean(BankService.class);

		// save cusstomer
//		Bank b = new Bank("surrbhii", 0034, 0034.00);
//		customer.saveCustomer(b);

		// get customer by id
//		Bank s = customer.getCustById(2);
//		System.out.println(s);

		// for updateBalance
//		Bank b = customer.updateBalance(2, 500000);
//		System.out.println(b);

		// list of all customers
//		Iterable<Bank> list = customer.listOfAllCustomers();
//		System.out.println("list of all customer:" + list);
//
//		list.forEach(d -> System.out.println(d.getCustName()));

		// is customer exists
		System.out.println(customer.IsCustExists(2));

		// total count

		System.out.println(customer.countTotalCustomer());
	}

}
