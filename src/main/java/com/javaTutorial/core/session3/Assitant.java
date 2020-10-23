package com.javaTutorial.core.session3;

public class Assitant {
	
	int x = 10;
	
	public void sendEmail() {
		
		System.out.println("Sending email.....");
		System.out.println("Email Sent to siddahrthmannem@gmail.com");
	}
	
	public void sendEmail(String toEmailAddress) {
		
		System.out.println("Sending email to " + toEmailAddress);
		System.out.println("Email sent to " + toEmailAddress);
		
	}
	
	public String sendEmailWithConfirmation() {
		System.out.println("In sendEmailWithConfirm Sending email... ");
		System.out.println("In sendEmailWithConfirm Email sent to Employees.");
		
		System.out.println("value of x int method3 : " + x);
		return "Yes Sir!! Email sent to All employees!!!";
	}
	
	public String sendEmailWithConfirmation(String toEmailAddress) {
		
		x = 2;
		System.out.println("value of x in method4 : " + x );
		System.out.println("In sendEmailWithConfirm Sending email to " + toEmailAddress);
		System.out.println("In sendEmailWithConfirm Email sent to " + toEmailAddress);
		
		return "Yes Sir!! Email sent to" + toEmailAddress;
		
	}
	

}
