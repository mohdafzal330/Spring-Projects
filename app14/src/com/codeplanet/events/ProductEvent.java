package com.codeplanet.events;

import org.springframework.context.ApplicationEvent;

public class ProductEvent extends ApplicationEvent {
	private String messege = "";
	public ProductEvent(Object obj,String messege) {
		
		super(obj);
		
		this.messege = messege;
	}
	public void generateLogs() {
		System.out.print("Generated Event"+messege);
	}
}
