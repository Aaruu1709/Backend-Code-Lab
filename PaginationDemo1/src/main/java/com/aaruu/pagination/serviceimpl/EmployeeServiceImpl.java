package com.aaruu.pagination.serviceimpl;

import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.aaruu.pagination.entity.Employee;
import com.aaruu.pagination.repository.EmployeeRepo;
import com.aaruu.pagination.service.EmployeeService;

@Service
public interface EmployeeServiceImpl extends EmployeeService{
	
	@Autowired
	 EmployeeRepo employeeRepo;
	
	List<Employee> empList=Arrays.asList(new Employee("aaruu", "Aaruu@gmail.com", "pune", 800000.00),
			new Employee("aaruu", "Aaruu@gmail.com", "pune", 800000.00),
			new Employee("saruu", "saruu@gmail.com", "shirur", 900000.00),
			new Employee("baruu", "Aaruu@gmail.com", "ranjangoan", 700000.00),
			new Employee("caruu", "Aaruu@gmail.com", "italy", 600000.00),
			new Employee("daruu", "Aaruu@gmail.com", "jermany", 800000.00),
			new Employee("earuu", "Aaruu@gmail.com", "vietnam", 400000.00),
			new Employee("faruu", "Aaruu@gmail.com", "iran", 300000.00),
			new Employee("garuu", "Aaruu@gmail.com", "irak", 200000.00),
			new Employee("zaruu", "Aaruu@gmail.com", "panama", 800000.00),
			new Employee("xaruu", "Aaruu@gmail.com", "dargiling", 6500000.00),
			new Employee("waruu", "Aaruu@gmail.com", "karnatka", 800000.00),
			new Employee("yaruu", "Aaruu@gmail.com", "dubai", 800000.00),
			new Employee("taruu", "Aaruu@gmail.com", "japan", 800000.00),
			new Employee("faruu", "Aaruu@gmail.com", "austreliya", 800000.00),
			new Employee("karuu", "Aaruu@gmail.com", "erope", 800000.00),
			new Employee("sauruu", "sauruu@gmail.com", "pune", 800000.00),
			new Employee("jaruu", "Aaruu@gmail.com", "pune", 800000.00),
			new Employee("llaruu", "Aaruu@gmail.com", "pune", 800000.00),
			new Employee("shaluu", "Aaruu@gmail.com", "pune", 800000.00)
			);

	
	
	employeeRepo.
		
}
