package com.brainworks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Employee empData() {
		Employee emp = new Employee();
		emp.setEmpName("1");
		emp.setEmpName("aaruu");
		emp.setEmpDesignation(" backend developer");
		emp.setEmpSalary(9000000);

		return emp;
	}

	@Bean
	// @Bean(name="office")//by using this we can provide alternate name here if we
	// dont want method name as bean id
	// but we need to change in App.java class this names
	public MyOffice officeData() {
		MyOffice office = new MyOffice();
		office.setOfficeId(1);
		office.setOfficeName("MSRTC");
		return office;
	}

}
