package com.javaTutorial.collections.session14;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Student student1 = (Student) o1;
		Student student2 = (Student) o2;
		
		if (student1.getAge() > student2.getAge()) {
			return 1;
		} else if(student1.getAge() < student2.getAge()) {
			return -1;
		} else {
			return 0;
		}
		
	}
	
}
