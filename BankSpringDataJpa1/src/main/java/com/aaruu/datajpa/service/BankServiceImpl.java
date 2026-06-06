package com.aaruu.datajpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaruu.datajpa.entity.Bank;
import com.aaruu.datajpa.repo.BankRepo;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	BankRepo bankrepo;

	@Override
	public Bank saveCustomer(Bank bank) {

		Bank savedCustomer = bankrepo.save(bank);
		return savedCustomer;
	}

	@Override
	public Bank getCustById(Integer id) {

		Optional<Bank> custid = bankrepo.findById(id);
		return custid.get();
	}

	@Override
	public Bank updateBalance(Integer id, double totalAmount) {

		Optional<Bank> bank = bankrepo.findById(id);

		Bank customer = bank.get();
		customer.setTotalAmount(totalAmount);

		Bank updateCustomer = bankrepo.save(customer);

		return updateCustomer;
	}

	public Iterable listOfAllCustomers() {
		Iterable<Bank> allcust = (List<Bank>) bankrepo.findAll();
		return allcust;
	}

	public String deleteCutoById(Integer id) {
		bankrepo.deleteById(id);
		return "customer deleted";
	}

	public Boolean IsCustExists(Integer id) {

		return bankrepo.existsById(id);

	}

	public long countTotalCustomer() {

		long cust = bankrepo.count();
		return cust;
	}

}