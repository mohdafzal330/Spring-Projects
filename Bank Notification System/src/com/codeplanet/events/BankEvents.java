package com.codeplanet.events;

import org.springframework.context.ApplicationEvent;
import java.sql.*;
import java.util.Date;
public class BankEvents extends ApplicationEvent {
	
	String messege = "";
	public BankEvents(Object obj,String messege) {
		super(obj);
		this.messege = messege;
	}
	
	public void generateLogData() {
		messege = new Date().toString()+" "+messege;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Abjal");
			Statement st = con.createStatement();
			st.executeUpdate("insert into logs values('"+messege+"')");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("Generated for :"+messege);
	}
	
	
}
