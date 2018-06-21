package com.codeplanet.beans;

public class TestBean {
	private String tname;
	private String tstatus;
	private String treason;
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTstatus() {
		return tstatus;
	}
	public void setTstatus(String tstatus) {
		this.tstatus = tstatus;
	}
	public String getTreason() {
		return treason;
	}
	public void setTreason(String treason) {
		this.treason = treason;
	}
	public void display() {
		System.out.println("Test Details");
		System.out.println("========================");
		System.out.println("Test Name         : "+tname);
		System.out.println("Test Status       : "+tstatus);
		System.out.println("Test Reason       : "+treason);
	}
	
}
