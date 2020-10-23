package com.javaTutorial.core.session2;

public class Session2Test {
	
	public static void main(String[] args) {
		
		long creditCardNum = 8934436398018989L; //28 bytes
		int age = 30; //1 bytes
		
		// Dest			//Source
		age = (int) creditCardNum; // 1 bytes
		System.out.println("Age1 : " + age);
		
		int age2 = 25;
		long creditCardNum2 = (long) age2; // 4359109078931515L;
		System.out.println("Credit2 : " + creditCardNum2);
		
		String  name = "Java";
		
		char letter = 'A';
		
		int x = letter;
		
		boolean isValid = true; // 101101;
		float f = letter;
		
		long kVal = 4398579243453246L;
		int rValue = (int) kVal;
		
		long sValue = rValue;
		
		System.out.println("rValue: **** " + rValue);
		x = (int) 134985.2;
				
		System.out.println(f);
		
		/**
		 
		3) 10 (3 --> Division
		   9
		  ___
		   1 --> Modulus
		   
		*/
		
		int res = 10%3;
		System.out.println("Result Of Modulus -- " + res );
		
		float result = 3 * 41 + 7 / 3 - 2 % 1; // (3 * 41) +  (7 / 3) -  (2 % 1)
												//  (123	+   2)	-	  0
												// 125 + 0
		
		System.out.println("Math Operators : " + result);
		
		
		// 2.2 Relational Operators
		char c2 = 'A'; // 65
		int x2 = 49;
		double y = 49.0;
		// >= and <=
		boolean finalDecision = c2 > x2;
		System.out.println("Relational Op Result: " + finalDecision);
		if( finalDecision ) {
			System.out.println("In If loop and values is : " + finalDecision);
		}
		
		// 2.3 Assignment Operators
		int numOne = 5;
		int numTwo = 4;
		//int addNums = numOne + numTwo;
		// D		// S
		int i = (numTwo += numOne);
		System.out.println("Assignment OPerators: " + numOne);
		System.out.println("Assignment OPerators: " + i);
		
		// 2.4 Increment and Decrement operators
		int year = 2050;
		int year2 = 3060;
		int newYear = year++;
		int newYear2 = year2++;
		System.out.println("Increment and Decrement Operator : " + newYear2);
		System.out.println("Increment and Decrement Operator : " + year2++);

		
		// Logical OPerator
		int bornYear = 1899;
			boolean dcFan = true;
			String country = "canadian";
			boolean marvelFan = false;
			// return true if he's a DC fan and who born before 1900 and if he's an American or Canadian
			
										   // false			// true				// false
			//boolean isdcFanInNewYear = (year >= year2) && ( (newYear2 >= newYear) || (numTwo == numOne) );
			
			boolean isAuthDCFan = dcFan && bornYear < 1900 && (country == "America" || country == "canadian");
			// --> &&(AND) ,  ||(OR)
			System.out.println("Logical OPeratros : " + isAuthDCFan );
		
	}
}
