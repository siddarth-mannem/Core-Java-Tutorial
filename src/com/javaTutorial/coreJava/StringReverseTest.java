package com.javaTutorial.coreJava;

import java.util.Scanner;

public class StringReverseTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("We Are runnign in debug mode and please enter your name: ");
		String name = scanner.nextLine();
		
		char[] nameChars = name.toCharArray(); // ['h', 'e', 'l', l, o,  , T, o, n, y,  , S, t, a, r, k ]
												// ['k', 'r', 'a', ........., 'h'] Goal 
		
		char[] nameReverseChars = new char[nameChars.length];
		
		for(int i=0; i< nameChars.length; i++) {
			
			nameReverseChars[i] = nameChars[nameChars.length - i - 1]; // namesChars[14]
		}
		
		String finalReverseName = String.valueOf(nameReverseChars);
		System.out.println("Reverse Name: " + finalReverseName);
	}

}
