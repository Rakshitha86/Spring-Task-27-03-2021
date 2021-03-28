package com.xworkz.set;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		String contextConfig = "spring.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(contextConfig);
		Company company = applicationContext.getBean(Company.class);
		Set<Employee> employeesList = company.getEmployees();
		for (Employee emp : employeesList) {
			System.out.println("Employee name is: " + emp.getName());
			System.out.println("Employee salary is: " + emp.getSalary());
		}
	}

}
