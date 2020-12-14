package com.cp.springcoreapp.dao;

import org.springframework.stereotype.Repository;

import com.cp.springcoreapp.bean.Employee;

@Repository
public class EmployeeDao {
	
    public Employee createNewEmployee()
    {
        Employee e = new Employee();
        e.setId(1);
        e.setFirstName("Rohit");
        e.setLastName("Sharma");

        return e;
    }

}
