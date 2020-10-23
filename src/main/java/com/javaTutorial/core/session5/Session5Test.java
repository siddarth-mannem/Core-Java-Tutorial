package com.javaTutorial.core.session5;

import java.util.Scanner;


/*
 * Topic: 7) Arrays
 * 
 * Classes in this package is all about Arrays concepts
 */
public class Session5Test {

	static String allNames = "aaaa,bbb,ccc";
	
	public static void main(String[] args) {
	
		char[] chars = new char[34];
		int[] nums = {1,2,3,4};
		System.out.println(nums[0]);
		int[] nums2 = nums;
		System.out.println(nums2[3]);
		nums2[3] = 23;
		System.out.println(nums[3]);
		
		String[] fruits = new String[3];//{"orange","apples","bananas"};
		
		fruits[0] = "Orange";
		fruits[1] = "Apples";
		fruits[2] = "Bananas";
		
		
		System.out.println("index 1 " + fruits[1]);
 		
/*		for(int i=0; i<fruits.length; i++) {
			System.out.println("Index : " + i + " and value: " + fruits[i]);
		}*/
		
		Customer[] customers = new Customer[2];
		
		Customer cust1 = new Customer();
		cust1.rolNo = 21;
		cust1.name = "avinash";
		cust1.salary = 4000.00;
		customers[0] = cust1;
		
		Customer cust2 = new Customer();
		cust2.name= "Vishnu";
		cust2.salary = 5000.00;
		cust2.rolNo = 22;
		
		customers[1] = cust2;
		
		for(int i=0; i<customers.length; i++) {
			Customer cust = customers[i];
			System.out.println("CUstomer : " + cust.rolNo + " and hascode :"  + cust.hashCode());
			System.out.println("Roll no: " + cust.rolNo + " and name: " + cust.name + " and salary: " + cust.salary);
			
		}
	}

}
