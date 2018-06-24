package com.codeplanet.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ContextRefreshedEventImpl implements ApplicationListener<ContextRefreshedEvent> {
	public void onApplicationEvent(ContextRefreshedEvent e) {
		System.out.println("Context Refreshed");
	}
}
