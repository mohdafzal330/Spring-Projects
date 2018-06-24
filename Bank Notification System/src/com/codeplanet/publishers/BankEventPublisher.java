package com.codeplanet.publishers;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.codeplanet.events.BankEvents;

public class BankEventPublisher implements ApplicationEventPublisherAware{
	private ApplicationEventPublisher publisher = null;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;		
	}
	
	public void publishBankEvent(String messege) {
		BankEvents bcEvent = new BankEvents(this, messege);
		publisher.publishEvent(bcEvent);
	}

	
}
