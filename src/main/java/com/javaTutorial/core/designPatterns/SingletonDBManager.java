package com.javaTutorial.core.designPatterns;

public class SingletonDBManager {
	
	private static SingletonDB dbConnection = null;;
	
	private SingletonDBManager() {
		
	}
	
	static {
		System.out.println("In static ***");
	}
	public static SingletonDB getInstance() {
		
		if(dbConnection == null) {
			dbConnection = new SingletonDB();
		}
		
		return dbConnection;
				
	}
}
