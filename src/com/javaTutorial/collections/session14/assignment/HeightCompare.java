package com.javaTutorial.collections.session14.assignment;

import java.util.Comparator;

public class HeightCompare implements Comparator {
	public int compare(Object o1, Object o2) {
		 
 		Customer c1 = (Customer) o1;
 		Customer c2 = (Customer) o2;
 		
 		if (c1.getHeight() > c2.getHeight()) {
 			return 1;
 		}
 		
 		else if(c1.getHeight() < c2.getHeight()) {
 			return -1;
 		} 
 		
 		
 		else {
 			return 0;
 		}
 		
 	}

}
