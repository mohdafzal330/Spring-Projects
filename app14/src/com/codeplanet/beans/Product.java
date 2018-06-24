package com.codeplanet.beans;

import com.codeplanet.publisher.ProductEventPublisher;

public class Product {
	private ProductEventPublisher publisher = null;
	public void setPublisher(ProductEventPublisher publisher) {
		this.publisher = publisher;
	}
	public void purchased() {
		publisher.publishProductEvent(" Purchased");
		System.out.println(", Product Purchased");
	}
	public void shipped() {
		publisher.publishProductEvent(" Shipped");
		System.out.println(", Product Shipped");
	}
	public void delivered() {
		publisher.publishProductEvent(" Delivered");
		System.out.println(", Product Delivered");
	}
	public void returned() {
		publisher.publishProductEvent(" Returned");
		System.out.println(", Product Returned");
	}
}
