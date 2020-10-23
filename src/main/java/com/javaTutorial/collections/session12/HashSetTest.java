package com.javaTutorial.collections.session12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTest {

	public static void main(String[] args) {

		System.out.println(" -------------------------------ArrayList Example");

		ArrayList<String> namesArrayList = new ArrayList<>();
		
		namesArrayList.add("Adul Kalam");
		namesArrayList.add("Hitler");
		namesArrayList.add("Chris Pine");
		namesArrayList.add("Adul Kalam");
		
		for(String name: namesArrayList) {
			System.out.println(name);
		}
		
		System.out.println("-------------------------------Hash Set Example ");
		System.out.println("Works on concept called Hashing technology");
		
		HashSet<String> namesList = new HashSet<>();
		
		namesList.add("Adul Kalam");	// element0	// hashcode#5718
		namesList.add("Hitler");		// element1	// hashcode#5623
		namesList.add("Chris Pine");	// element2 // hashcode#3468
		namesList.add("Adul Kalam");	// hashcode#5718
		namesList.add("Bskuthsk");		// hashcode#8347
		
		for(String name: namesList) {
			System.out.println(name);
		}
		
		System.out.println("-------------------------------Tree Set Example ");
		
		TreeSet<String> namesTreeSet = new TreeSet<>();
		
		namesTreeSet.add("Adul Kalam");
		namesTreeSet.add("Hitler");
		namesTreeSet.add("Chris Pine");
		namesTreeSet.add("Adul Kalam");
		
		for(String name: namesTreeSet) {
			System.out.println(name);
		}
		
		
	}

}
