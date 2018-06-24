package com.codeplanet.listeners;

import org.springframework.context.ApplicationListener;

import com.codeplanet.events.BankEvents;

public class BankEventsHandler implements ApplicationListener<BankEvents>{

	@Override
	public void onApplicationEvent(BankEvents bcEvents) {
		bcEvents.generateLogData();
		
	}
	
}
