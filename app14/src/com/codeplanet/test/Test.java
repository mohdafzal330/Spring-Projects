package com.codeplanet.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeplanet.beans.Product;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/codeplanet/config/config.xml");
		Product pd = (Product)context.getBean("product");
		pd.purchased();
		pd.shipped();
		pd.delivered();
		pd.returned();
		
	}
}
