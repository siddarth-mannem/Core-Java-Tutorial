package com.javaTutorial.funcProgram.compareObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class FPCompareTest {

	public static void main(String[] args) {

		Random rand = new Random();

		//Creating Students Data
		List<Student> studentsList = new ArrayList<>();
		List<Student> studentsList2 = new ArrayList<>();
		List<Student> studentsList3 = new ArrayList<>();
		Map<String, Student> studentsMap = new HashMap<>();
		
		Student studentToAdd;
		for(int i=1; i <=10; i++) {
			int age = rand.nextInt(50) + 1;
			//System.out.println(age);
			studentToAdd = new Student("firtName-"+i, "lastName-"+i, age, 22222222 + i,
					5555555+i, "HYU3534"+i, 6.0 + i, 170 + i);
			studentsList.add(studentToAdd);
			studentsMap.put(studentToAdd.getFirstName(), studentToAdd);
		}

		// It will print what data we created
		System.out.println("Before Sorting by age...");
		for(Student st : studentsList) {
			System.out.println("Age: " + st.getAge());
		}
		studentsList2.addAll(studentsList);
		studentsList3.addAll(studentsList);
		
		Comparator<Student> sortingByAge = (Student s1, Student s2) -> {
			return s1.getAge()-s2.getAge();
		};
		
		Comparator<Student> sortingByName = (Student s1, Student s2) -> {
			return s1.getFirstName().compareTo(s2.getFirstName());
		};
		
		studentsList.sort((Student s1, Student s2) -> (s1.getFirstName().compareTo(s2.getFirstName())));
		//studentsList.sort(sortingByAge);
		System.out.println("Comparing by Names: ");
		
		//studentsList.sort(sortingByName);
		studentsList.forEach(System.out::println);
		
		// OR still want to reduce lines ?
		System.out.println("Another way ---- ");
		studentsList2.sort((Student s1, Student s2) -> (s2.getAge() - s1.getAge()));
		studentsList2.forEach(System.out::println);
		
		// Using Comparable Interface
		//System.out.println("Using Comparable ***** ");
		//Collections.sort(studentsList3);
		//studentsList3.forEach(System.out::println);
		
		// Print Map
		studentsMap.forEach((k, v) -> System.out.println(k + " -- " + v));
		// Modify Map based on some condition
		//Student keyStudent = studentsMap.computeIfPresent("firtName-2", (key, value) -> {value.setAge(1000); return value;});
		//System.out.println(keyStudent);
		
	}

}
