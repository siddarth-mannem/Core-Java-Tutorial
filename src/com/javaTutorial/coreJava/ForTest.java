package com.javaTutorial.coreJava;

public class ForTest {

	public static void main(String[] args) {
		
		
		int numberOfPersons = 10;
		
		// If developer DOESN't know hte size of an array
		for (int i =1; i <= numberOfPersons; i++) {
			
			if (i == 3) {
				System.out.println("You are breaking the loop at " + i);
				// Some logic
				continue;
			}
			// Whats happens if i=3 
			System.out.println(i);
			System.out.println("Hello World");			
			
		}		

		int j = 1;
		// Only if size is expected
		while(j <= 10) {
			System.out.println("In while Loop and J vlaue is: " + j);
			j++;
		}
		
	}


}
