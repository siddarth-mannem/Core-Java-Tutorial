package com.javaTutorial.interviewQs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Google Interview Questions
 * Search first index which starts with a name given from sorted Arrays and 
 * find the total element that starts with given name.
 * 
 * Example:
 * 		Input -> ["a", "aa", "aba", "abb", "abc", "abz", "bc", "tt", "xy"]
 * 		OutPut --> [2, 4] where 2 -> and 4 -> is total number of elements in an Array that starts with given name. 
 * @author Siddarth
 *
 */
public class GoogleTest122018 {

	public static void main(String[] args) {
		List<String> namesList = new ArrayList<>();
		namesList.add("abc");
		namesList.add("aba");
		namesList.add("abb");
		namesList.add("a");
		namesList.add("aa");
		namesList.add("aaa");
		namesList.add("dgfg");
		namesList.add("aaaaa");
		namesList.add("abz");
		namesList.add("b");
		namesList.add("ka");
		namesList.add("kbi");
		namesList.add("kai");
		namesList.add("xyz");
		namesList.add("xxyyy");
		namesList.add("yyyyyy");
		namesList.add("lvoe");
		
		Collections.sort(namesList);
		for(String s: namesList) {
			System.out.println(s);
		}
		String s = "kb";	
		System.out.println("---------------------------");
		String[] namesArray = new String[namesList.size()];
		//System.out.println(findFirstElement(namesList.toArray(namesArray), s));
		System.out.println(findElementBinary(namesList.toArray(namesArray), s));
		
	}

	public static int findElementBinary(String[] namesArray, String name) {
		
		int firstIndex = 0;
		int lastIndex = namesArray.length - 1;
		int middleIndex = 0;
		int totalCount = 0;
		int resultIndex = 0;
		while(firstIndex <= lastIndex) {
			totalCount++;
			middleIndex = (firstIndex + lastIndex) / 2;
			System.out.print("Searching from [" + firstIndex + ", " + middleIndex + "] --> " );
			if(namesArray[middleIndex].startsWith(name)) {
				if(namesArray[firstIndex].startsWith(name)) {
					resultIndex = firstIndex;
					System.out.print("FOUND");
					break;
				} else {
					firstIndex++;
					lastIndex = middleIndex;
					System.out.print("NOT FOUND");
				}
			} else {
				System.out.print("NOT FOUND");
				if(namesArray[middleIndex].compareTo(name) > 0) {
					lastIndex = middleIndex - 1;
				} else {
					firstIndex = middleIndex + 1;
				}
			}
			System.out.println(" ");
		}
		
		System.out.println("\nTotal Loops: "+ totalCount);
		return resultIndex;
	}

	public static int findFirstElement(String[] namesArray, String name) {

		int[] resultArray = new int[2];
		int count = 0;
		int totalCount =0;
		for(int i=0; i<namesArray.length; i++ ) {

			if(namesArray[i].startsWith(name)) {
				if(count == 0)
					resultArray[0] = i;
				count++;
				resultArray[1] = count;
			} else if(namesArray[i].compareTo(name) > 0) {
				break;
			}
			
			totalCount++;
		}
		System.out.println("Total Loops: "+ totalCount);
		return resultArray[0];

	}
}
