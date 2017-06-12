package com.javaTutorial.collections.session14.assignment;

import java.util.Comparator;

public class CustomerAgeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
	Customer customer1 = (Customer) o1;
	Customer customer2 = (Customer) o2;
	
	if(customer1.getAge() > customer2.getAge()){
		return 1;
	}
	else if(customer1.getAge() < customer2.getAge()){
		return -1;
	}
	else{
	return 0;
	}
	
	}
	
	
	
}
