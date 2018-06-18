package com.codeplanet.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeplanet.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		System.out.println("Initializing Order");
		System.out.println("===================================");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/codeplanet/config/config.xml");
		HelloBean bean = (HelloBean)context.getBean("helloBean");
		System.out.println("Destruction Order");
		System.out.println();
		System.out.println("====================================");
		context.registerShutdownHook();
	}

}
