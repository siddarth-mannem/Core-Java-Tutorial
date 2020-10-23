package com.javaTutorial.coreJava;

public class OneDimnArrayTest {

	public static void main(String[] args) {

		// []
		
		int num1 =3;
		int[] nums = new int[10];
		
		nums[0] = 32;
		nums[9] = 10;
		//				 0, 1,  2,  3
		int[] numbers = {0, 0, 45, 18};
		System.out.println(numbers[3]);
		
		int[] numbers2 = new int[5];
		numbers2[0] = 329;
		numbers2[1] = 1;
		numbers2[2] = 345;
		numbers2[3] = 0;
		numbers2[4] = 7567;	
		
		printArraysValues(numbers2);
		
	}
	
	//Assistant
	private static void printArraysValues(int[] numbers) {
		
		// Printing array values using for loop
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		
		for (int i=0; i < numbers.length; i++) {
			
			System.out.println( "Values are: " + numbers[i] );
		}
		
	}

}
