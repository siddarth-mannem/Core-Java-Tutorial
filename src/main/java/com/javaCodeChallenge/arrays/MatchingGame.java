package com.javaCodeChallenge.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchingGame {

	public static void main(String[] args) {
		
		String[] animals = {"moose", "ostrich", "tiger", "elephant", "hens", "emu", "rhino", "snake"};
		
		StringBuilder sb = new StringBuilder();
		List<String> animalsList = Arrays.asList(animals);
		if(animalsList.size() == 1) {
			sb.append(animalsList.get(0) + " -> ");
		} else {
			sb.append(animalsList.get(3) + " -> ");
			 List<String> coveredAnimals = new ArrayList<String>();
			 coveredAnimals.add(animalsList.get(3));
			findAnimals(animalsList, coveredAnimals, animalsList.get(3), sb);
//			if(animalsList.size() != coveredAnimals.size()) {
//				for(String name: animalsList) {
//					if(!coveredAnimals.contains(name)) {
//						sb.append(name + " -> ");
//					}
//				}
//			}
		}
		
		System.out.println(sb.toString());
	}
	
	private static void findAnimals(List<String> animalsList, List<String> coveredList, String searchName, StringBuilder sb) {
		
		if(animalsList.size() == coveredList.size()) {
			return;
		}
 		for(int i = 0; i< animalsList.size(); i++) {
			
			String currentName = animalsList.get(i);
			
			if(!coveredList.contains(currentName)) {
				
				if(searchName.charAt(searchName.length() -1) == currentName.charAt(0)) {
					sb.append(currentName + " -> ");
					coveredList.add(currentName);
					findAnimals(animalsList, coveredList, currentName, sb);
					break;
				}
			}
			
		}		
	}

}
