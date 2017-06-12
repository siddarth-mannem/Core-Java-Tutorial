package com.javaTutorial.collections.session14.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.javaTutorial.collections.session14.Student;
import com.javaTutorial.collections.session14.StudentAgeComparator;

public class CustomerComparatorTest {

	public static void main(String[] args) {
		
		
   Random comage = new Random();
		
		
		List<Customer> customersList = new ArrayList<>();
		Customer customerToAdd;
		for(int i=1; i <=10; i++) {
			int age = comage.nextInt(50) + 1;
			
			customerToAdd = new Customer("sowjanya"+i, "adapa"+i, age, 22222222 + i,
										5555555+i, "HYU3534"+i, 6.0 + i, 170 + i);
			studentsList.add(studentToAdd);
		}
		
		// It will print what data we created
		System.out.println("Before Sorting by age...");
		for(Student st : studentsList) {
			System.out.println("Age: " + st.getAge());
		}
		
		Collections.sort(studentsList, new StudentAgeComparator());

		System.out.println("---------------------------After Sotring by Age...\n");
		for(Student st : studentsList) {
			System.out.println("Age: " + st.getAge());
		}
		
	}

}
