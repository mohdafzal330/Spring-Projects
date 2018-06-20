package com.codeplanet.beans;

public class StudentBean {
	private String sname;
	private String saddr;
	private String scity;
	private String sstate;
	private String scountry;
	
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
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public String getSstate() {
		return sstate;
	}
	public void setSstate(String sstate) {
		this.sstate = sstate;
	}
	public String getScountry() {
		return scountry;
	}
	public void setScountry(String scountry) {
		this.scountry = scountry;
	}
	public String toString() {
		System.out.println("Student Name      : "+sname);
		System.out.println("Student Addr      : "+saddr);
		System.out.println("Student City      : "+scity);
		System.out.println("Student State     : "+sstate);
		System.out.println("Student Country   : "+scountry);
		return "";
	}
	
}
