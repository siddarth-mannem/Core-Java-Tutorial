package com.javaTutorial.coreJava;

public class IfElseTest {

	public static void main(String[] args) {

		int march_Salary = 5000;
		int april_Salary = 6000;
		int may_Salary = 4000;
		
		if ( march_Salary > april_Salary    ) { // 5000 > 6000 --> false
			
			System.out.println("Yes You've more money in March");
			
		} else if ( march_Salary > may_Salary) { // 5000 > 4000 --> true
			
			System.out.println("You've got more money in March compared to May");
						
		} else { // No Condition. Comes in to this loop if rest of all above if loops failed..
			System.out.println("You've for more money in April");	
		}
		
		///---------------------/---------------------/---------------------
		
		if (march_Salary >= 2000) {
			System.out.println("Yes you've go the minum wage...");
			
		}
		
		String note = "";
		
		
		// REgular If loop
		// Add some message to note(Object) if month salary is greater than 5000
		if ( march_Salary > 5000) {
			note = "Yes you got more than $5000 in month of march";				
		}
		
		// Ternary Operations. Short cut for if condition
		
		//        5000
		note = march_Salary >= 5000 ? "Yes more than $5000 in month of march" : "NOOOO";
		//			true						   						A  :	B
		
		System.out.println(note);
		
		char n = march_Salary <= 5000 ? 'A' : 'Z';
		
		System.out.println(n);
		
	}

}
