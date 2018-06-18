package com.codeplanet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codeplanet.beans.HelloBean;

@Configuration
public class BeanConfig {
	@Bean(initMethod="customInit", destroyMethod="customDestroy")
	public HelloBean helloBean() {
		//System.out.println("Spring Test");
		return new HelloBean();
	}
}
