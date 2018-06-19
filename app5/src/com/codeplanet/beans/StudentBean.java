package com.codeplanet.beans;

public class StudentBean {
	private int sid;
	private String sname;
	private String saddr;
	private Course c;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("=============================");
		System.out.println("Student Id: "+sid);
		System.out.println("Student name: "+sname);
		System.out.println("Student Address: "+saddr);
		System.out.println();
		System.out.println("Course Details");
		System.out.println("================================");
		System.out.println("Course ID: "+c.getCid());
		System.out.println("Course Name: "+c.getCname());
		System.out.println("Course Coust: "+c.getCcost());
	}
}
