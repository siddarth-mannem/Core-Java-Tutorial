package com.javaTutorial.collections.session11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.javaTutorial.inheritance.Rectangle;
import com.javaTutorial.inheritance.Shape;

public class HashMapTest {

	public static void main(String[] args) {
		
		//HashMap
		//HashMap<Integer, String> students = new HashMap<>();
		
		
		Shape rect = new Rectangle(2.0, 2.0);
		
			// KEY	  VALUE
		Map<Integer, String> studentsMap = new HashMap<>();
		
		studentsMap.put(1, "Tony");
		studentsMap.put(2, "Captain");
		studentsMap.put(3, "Natasha");
		studentsMap.put(4, "Banner");
		
		System.out.println("Value of 3: " + studentsMap.get(4));
		
		
		Map<String, Customer> customerMap = new HashMap<>();
		
		Customer customer1 = new Customer("Agent", "Romenoff", 25);
		Customer customer2 = new Customer("Chris", "Patt", 40);
		Customer customer3 = new Customer("Hemsworth", "Patt", 37);
		Customer customer4 = new Customer("Chris", "Evans", 35);
		
		customerMap.put(customer1.getLastName(), customer1);	// Romenoff, customer1
		customerMap.put(customer2.getLastName(), customer2);	// Patt, customer2
		customerMap.put(customer4.getLastName(), customer4);
		customerMap.put(null, customer3);
		
		customerMap.get(null);
		Customer customer = customerMap.get(customer2.getLastName());
		
		System.out.println(customer.getFirstName() + "| " + customer.getLastName() + " | " + customer.getAge());
		
		Customer unknonKeyCustomer = customerMap.get("suthkgbzsk");
		System.out.println("Unknown Key Custoemr values are:");
		
		if (unknonKeyCustomer != null ) {
			System.out.println(unknonKeyCustomer.getFirstName() + "| " + 
					unknonKeyCustomer.getLastName() + " | " + 
					unknonKeyCustomer.getAge());
		} else {
			System.out.println("Customer unknow key object: " + unknonKeyCustomer);
		}
		
		// If two keys are same
		customerMap.put(customer3.getLastName(), customer3);

		Customer duplicateCustomer = customerMap.get(customer3.getLastName());
		System.out.println("Duplicate Keys ex: ");
		System.out.println(duplicateCustomer.getFirstName() + "| " + 
				duplicateCustomer.getLastName() + " | " + 
				duplicateCustomer.getAge());
		
		ArrayList<Customer> customersList = new ArrayList<>();
		for(Customer cust: customersList) {
			System.out.println(cust.getFirstName());
		}
		
		System.out.println("Using For Loop ----------------------------------****");
		// Iterating hashMap in for loop
		for(Map.Entry<String, Customer> custMap : customerMap.entrySet()) {

			System.out.println("Key: " + custMap.getKey() + " and Value: " + custMap.getValue());

			Customer cust = custMap.getValue();
			System.out.println("In For loop and Firstname is: " + cust.getFirstName() + " and Age:" + cust.getAge());
		}
	}
}
