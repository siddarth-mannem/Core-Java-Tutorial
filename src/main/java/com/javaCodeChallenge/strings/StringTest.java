package com.javaCodeChallenge.strings;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		
		String inputStmt = "Bob hit a ball, the hit BALL flew999.far after it was hit. the inception.";
		System.out.println(inputStmt.length());
		System.out.println(inputStmt.lastIndexOf("the", 59));
		//System.out.println(inputStmt.replaceFirst("the", "ooo"));
		
		String[] splitStrings = inputStmt.split(" ");
		Arrays.stream(splitStrings).forEach(System.out::println);
		System.out.println("------------------");
		System.out.println(inputStmt.substring(0, 1));
		
	}

}
