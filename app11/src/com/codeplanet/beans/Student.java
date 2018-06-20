package com.codeplanet.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String sid;
	private String sname;
	private String saddr;
	private Course course;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
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
	public Course getCourse() {
		return course;
	}
	@Autowired(required=true)
	//@Required
	@Qualifier("core_java")
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public void displayDetails() {
		System.out.println("Student Details");
		System.out.println("================================");
		System.out.println("Student ID         : "+sid);
		System.out.println("Student Name       : "+sname);
		System.out.println("Student Address    : "+saddr);
		System.out.println();
		System.out.println("Course Details");
		System.out.println("================================");
		System.out.println("Course ID         : "+course.getCid());
		System.out.println("Course Name       : "+course.getCname());
		System.out.println("Course Cost       : "+course.getCcost());
		
	}
}
