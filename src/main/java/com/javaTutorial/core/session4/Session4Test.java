package com.javaTutorial.core.session4;

import java.util.Scanner;

public class Session4Test {

	static String allNames = "aaaa,bbb,ccc";
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String name = "avinash"; // 
		String name2 = "harsha";
		String name3 = "harsha";
		//new String("stgsdfh");
		String name4 = new String("harsha");
		name.hashCode();
		
		System.out.println(allNames);
		System.out.println(name2 + ":" + name2.hashCode() + " and " + name4.hashCode());
		
		//name2 = name2.concat("sssssss"); // name2 + "sssssss";
		System.out.println(name2.concat("sssssss") + ":" + name2.concat("sssssss").hashCode());
		
		sendEmail();
		
		System.out.println("do yu want to contonue ? Y or N ? ");
	
		
	}
	
	private static void repeatPrm(Scanner sssss) {
		
		// Scanner scan = new Scanner(System.in);
		

		
	}
	
	private static void sendEmail() {
		System.out.println(allNames);
		String content = "Please accept payrol of $50.00";
	}

}
