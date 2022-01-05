package com.javaCodeChallenge.arrays;

import java.util.Arrays;

public class SortArrays {

	public static void main(String[] args) {

		int[] nums = {52,45,32,64,12,87,78,98,23,7};
		sort2(nums);
		System.out.println(Arrays.toString((nums)));

	}

	private static void sort(int[] intArray) {

		System.out.println(Arrays.toString(intArray));
		int temp = 0;
		int count = 0;
		for (int i = 0; i <intArray.length; i++) {    
			System.out.print("i: " + i + " | intArray[]: " + intArray[i] );
			for (int j = i+1; j <intArray.length; j++) {   
				count++;
				if(intArray[i] >intArray[j]) {      //swap elements if not in order
					temp = intArray[i];
					intArray[i] = intArray[j];    
					intArray[j] = temp;
					
				}
			}
			System.out.println(" | " + Arrays.toString(intArray));
		}
		
		System.out.println("Total Count: " + count);
	}

	private static void sort2(int[] intArray) {

		// {52,45,32,64,12,87,78,98,23,7}
		int count = 0;
		System.out.println(Arrays.toString(intArray));
		for (int i = 1; i <intArray.length; i++) {
			System.out.print("i: " + i + " | intArray[]: " + intArray[i] );
			for(int k=i; k>0; k-- ) {
				count++;
				if(intArray[k] < intArray[k-1]) {
					int tmp = intArray[k-1];
					intArray[k-1] = intArray[k];
					intArray[k] = tmp;
					
				}
			}
			System.out.println(" | " + Arrays.toString(intArray));
		} 
		
		System.out.println("Total Count: " + count);
	}

}
