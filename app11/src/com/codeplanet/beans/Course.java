package com.codeplanet.beans;

public class Course {
	private String cid;
	private String cname;
	private String ccost;
	public String getCname() {
		return cname;
	}
	
	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcost() {
		return ccost;
	}
	public void setCcost(String ccost) {
		this.ccost = ccost;
	}
	
	
}