package com.javaTutorial.lambdaExpressions;

/**
 * Preparation for CSAA interview on 04/21
 * 
 * 
 * 
 * @author siddharth
 * @Created Apr 21, 2020
 *
 */

@FunctionalInterface
interface Cab {
	void bookaCab(int x);
}

@FunctionalInterface
interface Principal {
	String getName(String name);
}

public class LambdaExpsnTest {
	
	//static String name = "Sid";
	static String instantVar = "10";
	static int instantStaticVar = 40;
	public static void main(String[] args) {
		
		LambdaExpsnTest test = new LambdaExpsnTest();
		test.createCab();
		
//		Cab cab = () -> {
//			int localVar = 50;
//			System.out.println("Uber booked a cab!!!" + " & instantStaticVar-" + instantStaticVar + " & localVar-" + localVar);
//		};
//		cab.bookaCab();
		
		Principal p = (name) ->  {
			System.out.println("Entered Name: " + name);
			return name;
		};
		p.getName("Sid");
	}
	
	void createCab() {
		Cab cab = (int x) -> {
			int localVar = 50;
			System.out.println("Uber booked a cab!!!" + " InstanceVar - " + instantVar + " & instantStaticVar-" + instantStaticVar + " & localVar-" + localVar);
		};
		cab.bookaCab(2);
	}
	
}
