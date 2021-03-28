package com.xworkz.company;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		String contextConfig = "spring.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(contextConfig);
		Company company = applicationContext.getBean(Company.class);
		List<Employee> employeesList = company.getEmployees();
		for (Employee emp : employeesList) {
			System.out.println("Employee name: " + emp.getName());
			System.out.println("Employee id: " + emp.getId());
		}
	}

}
