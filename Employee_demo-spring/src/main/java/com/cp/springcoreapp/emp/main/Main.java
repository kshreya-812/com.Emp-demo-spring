package com.cp.springcoreapp.emp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cp.springcoreapp.controller.EmployeeController;


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
		EmployeeController controller = context.getBean(EmployeeController.class);
		controller.createNewEmployee();
	}

}
