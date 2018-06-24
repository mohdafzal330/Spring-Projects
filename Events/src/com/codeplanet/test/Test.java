package com.codeplanet.test;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeplanet.config.BeanConfig;
import com.codeplanet.listeners.ContextRefreshedEventImpl;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		context.start();
		
		context.stop();
		context.close();
	}
}
