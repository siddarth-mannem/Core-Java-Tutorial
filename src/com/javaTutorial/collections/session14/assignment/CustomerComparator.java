package com.javaTutorial.collections.session14.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerComparator {

	public static void main(String[] args) {
		
		List<Customer> customersList = new ArrayList<>();
		
		//Customer1
		Customer customer1 = new Customer("Harish", "Kurma", 5.11d, 175.0d, 24, "Male");
		
		
		
		//Customer2
		Customer customer2 =  new Customer("Sowjanya", "Adapa", 5.4d, 150.0d, 23, "Female");
		
		//Customer3
		Customer customer3 =  new Customer("Bhaskar", "Kurma", 5.9d, 185.0d, 44, "Male");
		
		//Customer4
		Customer customer4 =  new Customer("Vasantha", "Kurma", 5.6d, 160.0d, 38, "Female");
		
		//Customer
		Customer customer5 =  new Customer("Niharika", "Kurma", 5.10d, 150.0d, 22, "Female");

				
		//Adding customers to list
		customersList.add(customer1);
		customersList.add(customer2);
		customersList.add(customer3);
		customersList.add(customer4);
		customersList.add(customer5);
		
		System.out.println("--------Before Sorting age----------");
		
		for(Customer customer : customersList ){
			System.out.println("Age of Customer "+customer.getFirstName()+" "+customer.getLastName()+" is "+customer.getAge());
		}
		
		System.out.println("--------After Sorting age---------");
		
		Collections.sort(customersList, new CustomerAgeComparator());
		
		for(Customer customer : customersList ){
			System.out.println("Age of Customer "+customer.getFirstName()+" "+customer.getLastName()+" is "+customer.getAge());
		}
		
	
	}

}
