package com.codeplanet.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextStopEventImpl implements ApplicationListener<ContextStoppedEvent> {
	
	public void onApplicationEvent(ContextStoppedEvent e) {
		System.out.println("Context Stopped");
	}
}
