package com.codeplanet.beans;

public class EmployeeBean {
	private String eid;
	private String ename;
	private String esal;
	private String eaddr;
	public EmployeeBean(String eid,String ename,String esal,String eaddr) {
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		this.eaddr=eaddr;
	}
	public void displayDetails() {
		System.out.println("Employee Details");
		System.out.println("=====================");
		System.out.println("Employee ID :"+eid);
		System.out.println("Employee Name :"+ename);
		System.out.println("Employee Salary :"+esal);
		System.out.println("Employee Address :"+eaddr);
	}
	
}
