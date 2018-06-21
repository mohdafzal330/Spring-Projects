package com.codeplanet.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeplanet.beans.TestBean;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/codeplanet/config/config.xml");
		TestBean bean = (TestBean)context.getBean("test");
		bean.display();
		context.start();
		context.refresh();
		context.stop();
		context.close();
	}
}
