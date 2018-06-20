package com.codeplanet.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeplanet.beans.Provider;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/codeplanet/config/config.xml");
		Provider pdr = (Provider)context.getBean("provider");
		pdr.displayData();
		System.out.println("Application Ended Successfully");
	}

}
