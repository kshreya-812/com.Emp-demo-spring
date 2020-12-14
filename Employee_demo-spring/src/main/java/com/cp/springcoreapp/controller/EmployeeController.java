package com.cp.springcoreapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cp.springcoreapp.bean.Employee;
import com.cp.springcoreapp.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;	

	public void createNewEmployee()
    {
       Employee newEmp = empService.createNewEmployee();
       System.out.println("New Employee Created");
       System.out.println("Emp Details");
       System.out.println("Emp First Name: "+newEmp.getFirstName());
       System.out.println("Emp Last Name: "+newEmp.getLastName());
    }

}
