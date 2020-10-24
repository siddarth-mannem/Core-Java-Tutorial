package com.javaTutorial.funcProgram.streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Functional Programming -- Streams API
 * 
 * 
 * 
 * @author siddharth
 * @Created Apr 21, 2020
 *
 */
public class FPNumberTest {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Sid", "Paul", "Puppy", "CHUPPY");
		List<Integer> numbers = Arrays.asList(4,6,8,13,3,15, 15);//java.util.List<String>.of("Sid", "Paul", "Puppy", "chuppy");
		//List<Integer> numbers2 = List.of(4,6,8,13,3,15);
		//Print odd numbers
		numbers.stream()
			.filter(number -> number%2 ==1)
			.forEach(number -> System.out.println(number));
		
		// Calculate total sum of numbers
		int sum = numbers.stream()
			.reduce( 
					0, Integer::sum
				);
		// Sum of odd numbers only
		sum = numbers.stream()
					//.filter(number -> number%2 ==1)
					.reduce(0, (num1, nm2) -> 
						{
						System.out.println(num1 + " - " + nm2);
						return num1 + nm2;  
					});
		System.out.println(sum);
		
		// avg of number
		numbers.stream().mapToInt(x -> x).average().ifPresent(avg -> System.out.println("Avg: " + avg)); //OR below code
		//System.out.println("intStreams Average: " + intStreams.distinct().forEach(System.out::println));
		double avg = numbers.stream().mapToInt(x -> x).average().getAsDouble();
		System.out.println("Avenrage: " + avg);

		// Distinct numbers
		System.out.println("Distinct Numbers are: ");
		IntStream intStreams = numbers.stream().mapToInt(x -> x);
		intStreams.distinct().forEach(System.out::println); // Print Distinct Numbers
		
		// Print Sum of numbers
		//IntStream intStreams = numbers.stream().mapToInt(x -> x);
		System.out.println("Sum of numbers: " + numbers.stream().mapToInt(x -> x).sum()); // Print Sum
		
		// Print sorted Order
		System.out.println("Sorted Order: ");
		IntStream intStreams2 = numbers.stream().mapToInt(x -> x);
		intStreams2.sorted().forEach(System.out::println); // Print sorted order
		
		// Distinct Sorted and calculate Squares of each numbers in list and print it
		System.out.println("Squares of all numbers: ");
		numbers.stream().distinct().sorted().map(x -> x * x).forEach(System.out::println);
		 
		// Map to lower case
		System.out.println("Map names list to lowercase: ");
		names.stream().forEach(name -> System.out.println(name.toUpperCase())); // OR use map shown below
		names.stream().map(name -> name.toLowerCase()).forEach(System.out::println);
		System.out.println("Sorting names*** ");
		names.stream().sorted().forEach(System.out::println);
		
		
		//System.out.println(doubleAverage);
		
		
	}	
}
