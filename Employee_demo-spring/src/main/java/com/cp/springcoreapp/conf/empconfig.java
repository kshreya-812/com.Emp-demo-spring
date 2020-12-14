package com.cp.springcoreapp.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.cp.springcoreapp.bean.Employee;

@Configurable
public class empconfig {

	@Bean
	public Employee getemp() {
		Employee emp=new Employee();
		emp.setFirstName("Binod");
		emp.setId(12);
		emp.setLastName("vivan");
		return emp;
		
	}
}
