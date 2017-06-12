package com.javaTutorial.collections.session14.assignment;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class CustomerComparatorTest {

	public static void main(String[] args) {
		

	List<Customer> customers = new ArrayList<>();
	
	Customer customer1 = new Customer("sowjanya","adapa", 5.4d, 150.00, 24, "female");
	
	Customer customer3 = new Customer("sandeep","oruganti", 5.9d , 195.00, 28, "Male");
	
	Customer customer2 = new Customer("sruthi","adapa", 5.7d , 180.00, 26, "female");
	
	
	
	
	customers.add(customer1);
	customers.add(customer3);
	customers.add(customer2);
	
	System.out.println("----Before sorting Age-----");
	
	for(int i=0;i<customers.size();i++){
		
		Customer customer=customers.get(i);
		
		System.out.println(customer.getFirstName() + " age is " + customer.getAge());
		
	}
	
	System.out.println("------After sorting Age-------");
	
	Collections.sort(customers, new AgeComparator());
	
for(int i=0;i<customers.size();i++){
		
		Customer customer=customers.get(i);
		
		System.out.println(customer.getFirstName() + " age is " + customer.getAge());
		
	}
	
System.out.println("----------Before Sorting Height------");
for(int i=0;i<customers.size();i++){
	
	Customer customer=customers.get(i);
	
	System.out.println(customer.getFirstName() + " height is " + customer.getHeight());
	
}

System.out.println("----------After Sorting Height--------");
    
     Collections.sort(customers, new HeightComparator());
     for(int i=0;i<customers.size();i++){
    		
    		Customer customer=customers.get(i);
    		
    		System.out.println(customer.getFirstName() + " height is " + customer.getHeight());
    		
    	}
		
     
     
	}
	
}	