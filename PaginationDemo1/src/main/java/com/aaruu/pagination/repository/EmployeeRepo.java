package com.aaruu.pagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aaruu.pagination.entity.Employee;

@Repository

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
