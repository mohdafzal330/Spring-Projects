package com.codeplanet.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean implements InitializingBean, DisposableBean{
	public void customInit() {
		System.out.println("Custom Initilization method");
	}
	public void customDestroy() {
		System.out.println("Custom Destruction method");
	}
	public void afterPropertiesSet() {
		System.out.println("Initializing usin Callback");
	}
	public void destroy() {
		System.out.println("Destroy using Callback");
	}
	@PostConstruct
	public void init() {
		System.out.println("Annotation initialin=zing");
	}
	@PreDestroy
	public void destroyA(){
		System.out.println("Annotation Destruction");
	}
}
