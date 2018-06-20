package com.codeplanet.beans;

public class Account {
	private String accNo;
	private String accName;
	private String accType;
	private String accBank;
	
	public Account(String accNo,String accName,String accType,String accBank) {
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
		this.accBank = accBank;
	}
	public String toString() {
		return "["+accNo+", "+accName+", "+accType+", "+accBank+"]";
	}
}
