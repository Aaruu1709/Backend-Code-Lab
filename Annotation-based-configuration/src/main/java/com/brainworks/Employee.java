package com.brainworks;

public class Employee {

	private int empId;
	private String empName;
	private String empDesignation;
	private double empSalary;

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

}
