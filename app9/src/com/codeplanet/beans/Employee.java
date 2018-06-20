package com.codeplanet.beans;

public class Employee {
	private String ename;
	private String esal;
	private String eaddr;
	private String ecity;
	private String estate;
	private StudentBean st;
	public Employee(String ename,String esal,String eaddr,String ecity,String estate,StudentBean st) {
		this.ename = ename;
		this.esal = esal;
		this.eaddr = eaddr;
		this.ecity = ecity;
		this.estate = estate;
		this.st = st;
	}
	public void displayDetails() {
		System.out.println("Employee Details");
		System.out.println("====================================");
		System.out.println("Employee Name          : "+ename);
		System.out.println("Employee Salary        : "+esal);
		System.out.println("Employee Address       : "+eaddr);
		System.out.println("Employee City          : "+ecity);
		System.out.println("Employee State         : "+estate);
		System.out.println();
		System.out.println("Student Details");
		System.out.println("======================================");
		System.out.println(st);
	}
}
