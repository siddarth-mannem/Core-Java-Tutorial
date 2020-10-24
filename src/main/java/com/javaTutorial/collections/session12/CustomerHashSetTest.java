package com.javaTutorial.collections.session12;

import java.util.HashSet;

import com.javaTutorial.collections.session11.Customer;

public class CustomerHashSetTest {

	public static void main(String[] args) {

		// Overridng equals and hascode method to remove duplicate objects in a set.
		HashSet<Customer> customers = new HashSet<>();
		
		Customer customer1 = new Customer("Agent", "Romenoff", 25);
		Customer customer2 = new Customer("Andre", "jolie", 40);
		Customer customer3 = new Customer("Hemsworth", "Patt", 37);
		Customer customer4 = new Customer("Chris", "Evans", 35); // chris hashcode#123
		
		Customer customer5 = new Customer("Chris", "Evans", 35); // chris hashcode#123
		
		System.out.println("customer1 hashcode: " + customer1.hashCode());
		System.out.println("customer2 hashcode: " + customer2.hashCode());
		System.out.println("customer3 hashcode: " + customer3.hashCode());
		System.out.println("customer4 hashcode: " + customer4.hashCode());
		System.out.println("customer5 hashcode: " + customer5.hashCode());
		
		System.out.println("Check if customer5 and customer2 hashcodes are same: " + 
						customer5.equals(customer2));
		
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		
		for( Customer c: customers ){
			System.out.println("FirstName: " + c.getFirstName());
		}
	}

}
