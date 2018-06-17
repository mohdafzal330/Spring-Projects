package com.codeplanet.test;
import com.codeplanet.config.BeanConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codeplanet.beans.HelloBean;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		HelloBean bean = (HelloBean)context.getBean("helloBean");
		System.out.println(bean.sayHello());
	}

}
