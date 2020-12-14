package com.cp.springcoreapp.conf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cp.springcoreapp.bean.Employee;



public class configMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(empconfig.class);
			Employee info = context.getBean(Employee.class);
			String fname=info.getFirstName();
			System.out.println("EMployee info using config:");
			System.out.println(info.getFirstName());
			System.out.println(info.getLastName());
			System.out.println(info.getId());




	}

}
