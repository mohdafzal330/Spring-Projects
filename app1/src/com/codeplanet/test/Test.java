package com.codeplanet.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.codeplanet.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/codeplanet/config/configuration.xml");
		HelloBean bean1 = (HelloBean)context.getBean("helloBean1");
		
		System.out.println(bean1);
		HelloBean bean2 = (HelloBean)context.getBean("helloBean1");
		System.out.println(bean2);
		System.out.println();
		HelloBean bean3 = (HelloBean)context.getBean("helloBean2");
		
		System.out.println(bean3);
		HelloBean bean4 = (HelloBean)context.getBean("helloBean2");
		System.out.println(bean4);
	}

}
