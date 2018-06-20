package com.codeplanet.beans;

import java.util.*;

public class Employee {
	private String ename;
	private List<String> eBro;
	private Set<String> eSis;
	private Map<String,String> data;
	private Properties courses;
	private Account acc;
	public void getEmployeeDetails() {
		System.out.println("Employee Details");
		System.out.println("=======================================");
		System.out.println("Employee Name                  : "+ename);
		System.out.println("Employee Brothers              : "+eBro);
		System.out.println("Employee Sisters               : "+eSis);
		System.out.println("Employee Data                  : "+data);
		System.out.println("Employee Courses               : "+courses);
		System.out.println("Employee Account Details       : "+acc);
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<String> geteBro() {
		return eBro;
	}
	public void seteBro(List<String> eBro) {
		this.eBro = eBro;
	}
	public Set<String> geteSis() {
		return eSis;
	}
	public void seteSis(Set<String> eSis) {
		this.eSis = eSis;
	}
	public Map<String, String> getData() {
		return data;
	}
	public void setData(Map<String, String> data) {
		this.data = data;
	}
	public Properties getCourses() {
		return courses;
	}
	public void setCourses(Properties courses) {
		this.courses = courses;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	
}
