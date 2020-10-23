package com.javaTutorial.core.designPatterns;

public class SingletonTest {

	public static void main(String[] args) {

		SingletonDB dbConn = SingletonDBManager.getInstance();
		System.out.println("Hascode of 1 :" + dbConn.hashCode());
		dbConn.run(1);
		
		SingletonDB dbConn2 = SingletonDBManager.getInstance();
		System.out.println("Hascode of 2 :" + dbConn.hashCode());
		dbConn.run(2);
		
	}

}
