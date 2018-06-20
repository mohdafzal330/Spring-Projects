package com.codeplanet.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeplanet.beans.AbjalFamilyData;

public class Test {
	public static void main(String[] abjal) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/codeplanet/config/config.xml");
		AbjalFamilyData data = (AbjalFamilyData)context.getBean("abjal");
		data.displayData();
	}
}
