package com.javaCodeChallenge.strings;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 
 * 767. Reorganize String
 * 
 * Ref: https://leetcode.com/problems/reorganize-string/
 * 
 * Explanation: https://www.youtube.com/watch?v=zaM_GLLvysw
 * 
 * @author siddharth
 * @Created Oct 23, 2020
 *
 */
public class StringReOrganize {

	public static void main(String[] args) {
		
		String s = "aab";

		System.out.println(reOrganizeString(s));
	}
	
	public static String reOrganizeString(String str) {
        
		StringBuilder sb = new StringBuilder("");
		
		Map<Character, Integer> charsCountMap = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			charsCountMap.put(c, charsCountMap.getOrDefault(c, 0) + 1);
		}
		
		Comparator<Character> charCompare = (Character c1, Character c2) -> {
			return charsCountMap.get(c2) - charsCountMap.get(c1);
		};
		
		PriorityQueue<Character> charMaxHeap = new PriorityQueue<>(charCompare);
		charMaxHeap.addAll(charsCountMap.keySet());
		
		while(charMaxHeap.size() > 1) {
			Character currentChar = charMaxHeap.remove();
			Character nextChar = charMaxHeap.remove();
			sb.append(currentChar).append(nextChar);
			charsCountMap.put(currentChar, charsCountMap.get(currentChar) -1 );
			charsCountMap.put(nextChar, charsCountMap.get(nextChar) -1 );
			if(charsCountMap.get(currentChar) > 0) {
				charMaxHeap.add(currentChar);
			}
			
			if(charsCountMap.get(nextChar) > 0) {
				 charMaxHeap.add(nextChar);
			}
		}
		
		if(!charMaxHeap.isEmpty()) {
			char c = charMaxHeap.remove();
			if(charsCountMap.get(c) > 1) {
				return "";
			}
			sb.append(c);
		}
		
		return sb.toString(); 
    }

}
