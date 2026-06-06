package com.aaruu.datajpa.service;

import com.aaruu.datajpa.entity.Bank;

public interface BankService {

	Bank saveCustomer(Bank bank);

	Bank getCustById(Integer id);

	Bank updateBalance(Integer id, double totalAmount);

	Iterable<Bank> listOfAllCustomers();

	String deleteCutoById(Integer id);

	Boolean IsCustExists(Integer id);

	long countTotalCustomer();

}
