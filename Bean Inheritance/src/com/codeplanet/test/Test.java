package com.codeplanet.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.codeplanet.beans.Bean2;
import com.codeplanet.beans.Bean3;

public class Test {
	public static void main(String[] afzal) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/codeplanet/config/config.xml");
		/*Bean1 bean1 = (Bean1)context.getBean("bean1");
		System.out.println(bean1.bean1());*/
		Bean2 bean2 = (Bean2)context.getBean("bean2");
		System.out.println(bean2.bean2());
		Bean3 bean3 = (Bean3)context.getBean("bean3");
		System.out.println(bean3.bean3());
	}
}
