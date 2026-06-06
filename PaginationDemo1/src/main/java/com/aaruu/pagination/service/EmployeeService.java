package com.aaruu.pagination.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aaruu.pagination.entity.Employee;

@Service
public interface EmployeeService {

	public List<Employee> saveEmployeeData();// getAllData

}
