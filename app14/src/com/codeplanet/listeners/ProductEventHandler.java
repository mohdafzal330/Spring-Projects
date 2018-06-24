package com.codeplanet.listeners;

import org.springframework.context.ApplicationListener;

import com.codeplanet.events.ProductEvent;

public class ProductEventHandler implements ApplicationListener<ProductEvent> {
	
	@Override
	public void onApplicationEvent(ProductEvent arg0) {
		
		arg0.generateLogs();
		
	}
	
}
