package com.cp.springcoreapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.springcoreapp.bean.Employee;
import com.cp.springcoreapp.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao empDao;   
    
	public Employee createNewEmployee()
    {
        return empDao.createNewEmployee();
    }

}
