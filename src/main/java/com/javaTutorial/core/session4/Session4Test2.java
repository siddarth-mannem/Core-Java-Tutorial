package com.javaTutorial.core.session4;

import java.util.Scanner;

/**
 * Topic: Scanner. How to give input from Console
 * 
 * 
 * @author Siddarth
 *
 */
public class Session4Test2 {

	static String allNames = "aaaa,bbb,ccc";
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter name: ");
		String name = scan.next();
		
		System.out.println("Entered name: " + name);
		
		System.out.println("PLease Enter roll no" );

		int roll = scan.nextInt();
		
		System.out.println("Entered rolno : " + roll);
		
	}

}
