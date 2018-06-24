package com.codeplanet.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.codeplanet.events.ProductEvent;

public class ProductEventPublisher implements ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher publisher = null;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	public void publishProductEvent(String messege) {
		
		ProductEvent prEvent = new ProductEvent(this,messege);
		
		publisher.publishEvent(prEvent);
		
	}
	
}
