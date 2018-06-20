package com.codeplanet.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AbjalFamilyData {
	private String db_class;
	private String db_driver_url;
	private String db_username;
	private String db_pwd;
	Connection con;
	Statement st;
	public String getDb_class() {
		return db_class;
	}
	public void setDb_class(String db_class) {
		this.db_class = db_class;
	}
	public String getDb_driver_url() {
		return db_driver_url;
	}
	public void setDb_driver_url(String db_driver_url) {
		this.db_driver_url = db_driver_url;
	}
	public String getDb_username() {
		return db_username;
	}
	public void setDb_username(String db_username) {
		this.db_username = db_username;
	}
	public String getDb_pwd() {
		return db_pwd;
	}
	public void setDb_pwd(String db_pwd) {
		this.db_pwd = db_pwd;
	}
	public void init() {
		try {
			Class.forName(db_class);
			con = DriverManager.getConnection(db_driver_url,db_username,db_pwd);
			st = con.createStatement();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("Driver Class Name :"+db_class);
			System.out.println("Driver URL :"+db_driver_url);
			System.out.println("Database Username :"+db_username);
			System.out.println("Database Password :"+db_pwd);
		}
		
	}
	public void displayData() {
		try {
			ResultSet rs = st.executeQuery("select * from Abjal");
			System.out.println("Name\t\t"+"Name\t\t"+"Name\t\t"+"Name");
			System.out.println("=========================================================");
			while(rs.next()) {
				System.out.println(rs.getString("name")+"\t"+rs.getString("name")+"\t"+rs.getString("name")+"\t"+rs.getString("name"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
