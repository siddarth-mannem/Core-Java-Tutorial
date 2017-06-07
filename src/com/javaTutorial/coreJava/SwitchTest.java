package com.javaTutorial.coreJava;

public class SwitchTest {

	public static void main(String[] args) {

		String day = "Wednesday";
		
		//if () {
		//
		//  }
		
		switch (day) {

				case "Monday": {
					System.out.println("Hello this is monday");
					break;
				}
				case "Tuesday": {
					System.out.println("Hello this is Tuesdesday");
					break;
				}
				case "Wednesday": {
					System.out.println("Hello this is Wednesday");
					break;
				}
				case "Thursday": {
					System.out.println("Hello this is Thursday");
					break;
				}
				case "Friday": {
					System.out.println("Hello this is FRiday");
					break;
				}
				case "Satruday": {
					System.out.println("Hello this is Satruday");
					break;
				}
				case "Sunday": {
					System.out.println("Hello this is Sunday");
					break;
				}
				default : {
					System.out.println("NOT a valid day.....");
					break;
				}
		}
	}

}
