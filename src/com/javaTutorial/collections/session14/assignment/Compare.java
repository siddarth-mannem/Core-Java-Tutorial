package com.javaTutorial.collections.session14.assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Compare {
	
		public static void main(String[] args) {
			 
			 	
			 	
			 		List<Customer> customerl = new ArrayList<>();
			 	
			 		Random rand = new Random();
					
					//Creating Students Data
					Customer newcustomer;
					for(int i=1; i <=10; i++) {
						Double height = rand.nextDouble() + 1;
						//System.out.println(age);
						newcustomer = new Customer("firtName-"+i, "lastName-"+i, height, 31212331 +i);
						customerl.add(newcustomer);
					}
			 		
			 		
			 		System.out.println("Before Sorting by height...");
			 		for(Customer cs : customerl) {
			 			System.out.println("height: " + cs.getHeight());
			 		}
			 		
			 		Collections.sort(customerl, new HeightCompare());
			 
			 		System.out.println("---------------------------After Sotring by height...\n");
			 		for(Customer st : customerl) {
			 			System.out.println("Height: " + st.getHeight());
			 		}
			 		
			 	}

}
