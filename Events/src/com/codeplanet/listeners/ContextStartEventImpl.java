package com.codeplanet.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartEventImpl implements ApplicationListener<ContextStartedEvent> {
	public void onApplicationEvent(ContextStartedEvent e) {
		System.out.println("Context Started");
	}
	
}
