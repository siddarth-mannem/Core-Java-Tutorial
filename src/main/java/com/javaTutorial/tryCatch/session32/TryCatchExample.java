package com.javaTutorial.tryCatch.session32;

import org.apache.commons.lang3.StringUtils;

public class TryCatchExample {

	public static void main(String[] args) {

		int sum = 0;
		try {
			
			sum = totalValue(null, "1");

		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("In System the error");
		}
		
	}
	
	private static int totalValue(String s1, String s2) throws Exception {
		
		if(s1 == null) {
			
			throw new Exception("String s1 is Null.. Plese check");
			
		} if(StringUtils.isAlphanumeric(s1)) {
			throw new NumberFormatException("String s1 is not a number");
		}
		
		int totalSum = Integer.valueOf(s1) + Integer.valueOf(s2);
		return 0;
		
	}

}
