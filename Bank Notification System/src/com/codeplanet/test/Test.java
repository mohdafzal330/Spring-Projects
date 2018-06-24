package com.codeplanet.test;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeplanet.beans.BankOperations;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/codeplanet/config/config.xml");
		BankOperations bank = (BankOperations)context.getBean("bankOperations");
		System.out.println("***********Bank Notification System ***********");
		
		while(true) {
			System.out.println();
			System.out.println("Please choose an operation from these Options....");
			System.out.println("1. Create Account");
			System.out.println("2. Withdrawl Money from Account");
			System.out.println("3. Deposit Monye in Account");
			System.out.println("4. Delete Account");
			System.out.println("5. Exit from Application");
			System.out.println();
			System.out.print("Your Choice : ");
			Scanner sc = new Scanner(System.in);
			int oprtn = sc.nextInt();
			switch(oprtn) {
			case 1:
				bank.accountcreated();
				break;
			case 2:
				bank.withdrawl();
				break;				
			case 3:
				bank.deposit();
				break;
			case 4:
				bank.accountdeleted();
				break;
			case 5:
				System.out.println("**************ThankQ for using our Bank Notification System Application***************");
				System.exit(0);
			default:
				System.out.print("Didn't match with any option, please choose a correct option");
				break;
			}
		}
		
		
		
		/*bank.accountcreated();
		
		
		*/
	}
}
