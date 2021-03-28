package com.xworkz.map;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		String contextConfig = "spring.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(contextConfig);
		Employee employeeMap = applicationContext.getBean(Employee.class);
		HashMap<String, String> states = employeeMap.getStates();
		for (String str : states.keySet()) {
			System.out.println("Key is: " + str + ", "+"Value is: " + states.get(str));
		}
	}

}
