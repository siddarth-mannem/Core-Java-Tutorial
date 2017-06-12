package com.javaTutorial.collections.session14.assignment;

import java.util.Comparator;

public class HeightComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Customer customer1 = (Customer) o1;
		Customer customer2 = (Customer) o2;
		
		if(customer1.getHeight() > customer2.getHeight()){
			return 1;
		}
		else if(customer1.getHeight()<customer2.getHeight()){
			return -1;
		} else{
			return 0;
		}
		
	}
	
	

}
