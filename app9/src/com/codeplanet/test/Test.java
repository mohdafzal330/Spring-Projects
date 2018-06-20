package com.codeplanet.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeplanet.beans.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/codeplanet/config/config.xml");
		Employee emp = (Employee)context.getBean("employee");
		emp.displayDetails();
	}
}
