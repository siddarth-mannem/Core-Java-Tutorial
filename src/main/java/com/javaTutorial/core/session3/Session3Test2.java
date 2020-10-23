package com.javaTutorial.core.session3;

import java.util.Calendar;
import java.util.Date;

/**
 * this class is all about methods.
 * 
 * This class is a Boss
 * 
 * @author Siddarth
 *
 */
public class Session3Test2 {

	public static void main(String[] args) {

		
		
		Assitant assitant = new Assitant(); // cReate a new memory in Heap. Heap is like partition of your local hard drive
		
		System.out.println("Assitant address code or hashcode : " + assitant.hashCode());
		// Bos is requesting assitant
		assitant.sendEmail();
		
		assitant.sendEmail("harsha@gmail.com");

		String response1 = assitant.sendEmailWithConfirmation();
		System.out.println("Here is the response from assitant sendEmailWithConfirmation() : " + response1);
		
		String response2 = assitant.sendEmailWithConfirmation("vishnu@gmail.com");
		System.out.println("Here is the response from assitant sendEmailWithConfirmation(params) : " + response2);
		
	}

}