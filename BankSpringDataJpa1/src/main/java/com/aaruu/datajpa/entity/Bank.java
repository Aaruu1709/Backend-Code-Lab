package com.aaruu.datajpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//By default Hibernate follows naming strategy and converts entity class names from CamelCase to snake_case format. 
//If custom table name is required, we use @Table(name="table_name").
@Entity
@Table(name = "BankApplication2")
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String custName;
	private int custAccNo;
	private double totalAmount;

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(String custName, int custAccNo, double totalAmount) {
		super();
		this.custName = custName;
		this.custAccNo = custAccNo;
		this.totalAmount = totalAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getCustAccNo() {
		return custAccNo;
	}

	public void setCustAccNo(int custAccNo) {
		this.custAccNo = custAccNo;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {

		return "Bank [id=" + id + ", name=" + custName + ", accountNo=" + custName + ", balance=" + custName + "]";

	}

}
