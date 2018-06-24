package com.codeplanet.config;

import org.springframework.context.annotation.Bean;

import com.codeplanet.listeners.ContextCloseEventImpl;
import com.codeplanet.listeners.ContextRefreshedEventImpl;
import com.codeplanet.listeners.ContextStartEventImpl;
import com.codeplanet.listeners.ContextStopEventImpl;

public class BeanConfig {
	@Bean
	public ContextStartEventImpl start() {
		return new ContextStartEventImpl();
	}
	
	@Bean
	public ContextRefreshedEventImpl refresh() {
		return new ContextRefreshedEventImpl();
	}
	@Bean
	public ContextStopEventImpl stop() {
		return new ContextStopEventImpl();
	}
	@Bean
	public ContextCloseEventImpl close() {
		return new ContextCloseEventImpl();
	}
}
