package com.codeplanet.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeplanet.beans.HelloBean;
import com.codeplanet.config.BeanConfig;

public class Test {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		HelloBean bean = (HelloBean)context.getBean("helloBean");

		context.registerShutdownHook();
	}

}
