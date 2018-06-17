package com.codeplanet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.codeplanet.beans.HelloBean;

@Configuration
public class BeanConfig {
	@Bean
	public String BleanConfig() {
		System.out.println("BeanConfig Object Creating");
		return "";
	}
	@Bean
	public HelloBean helloBean() {
		return new HelloBean();
	}
}
