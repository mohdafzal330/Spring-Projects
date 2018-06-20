package com.codeplanet.beans;

public class Provider {
	private Student st;
	private Employee emp;
	
	public Provider(Student st,Employee emp) {
		this.st = st;
		this.emp = emp;
	}
	
	public void displayData() {

		System.out.println("Employee Details");
		System.out.println("=====================================");
		System.out.println("Employee Name     : "+emp.getEname());
		System.out.println("Employee Salary   : "+emp.getEsal());
		System.out.println("Employee Address  : "+emp.getEaddr());
		System.out.println();
		System.out.println("Student Details");
		System.out.println("=====================================");
		System.out.println("Student Name      : "+st.getSname());
		System.out.println("Student Adsress   : "+st.getSaddr());
		System.out.println("Student College   : "+st.getSclg());
	}
}
