package com.codeplanet.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ContextClosedEventImpl implements ApplicationListener<ContextClosedEvent> {
	public void onApplicationEvent(ContextClosedEvent e) {
		System.out.println("Application Context Closed");
	}
}
