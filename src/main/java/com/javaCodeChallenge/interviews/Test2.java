package com.javaCodeChallenge.interviews;

public class Test2 {

	public static void main(String[] args) {

		String str = "Siddhu";
		String str2 = "u";
		//System.out.println(str.substring(1));
		str2 = str2.substring(1);
		System.out.println("Str2 : " + str2 + " & Length: " + str2.length());
		
		int currentNum = 2;
		currentNum *= -1;
		System.out.println(currentNum);
		
		String x = "hello "; x += "world";
		System.out.println(x);
		
		
		
		//String xyz = "Hello World";
		String xyz = new String("Hello World3");
		String abc = "Hello World3";
		if(abc == xyz)
		    System.out.println("Refers to same string");
		else
		    System.out.println("Refers to different strings");
			System.out.println("Hashcode abc : " + abc.hashCode() + " xyz: " + xyz.hashCode());

		if(abc.equals(xyz))
		     System.out.println("Contents of both strings are same");
		else
		     System.out.println("Contents of strings are different");
		
	}

}
