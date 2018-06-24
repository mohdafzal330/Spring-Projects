package com.codeplanet.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.codeplanet.publishers.BankEventPublisher;

public class BankOperations {
	
	BankEventPublisher publisher = null;
	
	public void setPublisher(BankEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	public void accountcreated() {
		publisher.publishBankEvent("Account created Successfully");
		System.out.println("Account created Successfully");
	}
	
	public void accountdeleted() {
		publisher.publishBankEvent("Account Deleted Successfully");
		System.out.println("Account Deleted Successfully");
	}
	
	public void withdrawl() {
		publisher.publishBankEvent("Cash Withdrawled Successfully");
		System.out.println("Cash Withdrawled Successfully");
	}
	
	public void deposit() {
		publisher.publishBankEvent("Cash Deposited Successfully");
		System.out.println("Cash Deposited Successfully");
	}
		
}
