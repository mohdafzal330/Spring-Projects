package com.codeplanet.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository("emp")
public class Employee {
	
	@Autowired
	private Student st;	
	public void business() {
		System.out.println("Employee Details");

		System.out.println(st.getSname()+" "+st.getSaddr());
	}
	
	
}
