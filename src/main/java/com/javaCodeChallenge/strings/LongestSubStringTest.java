package com.javaCodeChallenge.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Q: Longest Substring Without Repeating Characters
 * 
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * @author siddharth
 * @Created Oct 21, 2020
 *
 */
public class LongestSubStringTest {

	public static void main(String[] args) {
		//String name = "eeydgwdykpv";
		//String name = "ggububgvfk";
		//String name = "bbbbb";
		//String name = "tmmzuxt";
		String name = "abcabcbb";
		//String name = "bbbbb";
		//String name = "pwwkew";
		//String name = "dvdf"; // vdf
		//String name = "nfpdmpi";
		//int longestStringLength = evaluateString(name);
		int longestStringLength = lengthOfLongestSubstring(name);
		System.out.println(longestStringLength);
		
	}
	
	/**
	 * The best solution
	 * 
	 * @param s
	 * @return
	 */
	public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while(b_pointer < s.length()){
        	char c1 = s.charAt(b_pointer);
            if(!set.contains(c1)){
                set.add(c1);
                b_pointer++;
                max = Math.max(max, set.size());
            } else{
            	char c2 = s.charAt(a_pointer);
                set.remove(c2);
                a_pointer++;
            }
        }
        return max;
    }
	
	public static int evaluateString(String s) {
		
		
		if(s == null) {
			return 0;
		} else if(s.trim().isEmpty()) {

			if(s.contains(" ")) {
				return 1;
			} else {
				return 0;
			}
		}
		int longStringLength = 0;
		
		HashMap<Character, Integer> charPositionMap = new HashMap<>();
		List<Character> charsList = new ArrayList<>();
		
		for (int i = 0; i < s.length(); i++) {

			Character c = s.charAt(i);
			if(!charPositionMap.containsKey(c)) {
				charsList.add(c);
				charPositionMap = updateCharsPositionMap(charsList);
				longStringLength = (charsList.size() > longStringLength) ? charsList.size() : longStringLength;
				
			} else {
				// Step-1 --> find index value of this current Char from charPositionMap.
				int lastRepeatableCharIndex = charPositionMap.get(c);
				// Step-2 --> Find word from repeatable Char to end of the list.
				String word = findWordFromList(charsList, lastRepeatableCharIndex);
				
				// Step-2 --> Reset charsList and re-insert chars from String word by skipping first char because first char is same as current loop Char.
				charsList = updateCharsList(word);
				// Step-3 --> Add this current Char in to charsList.
				if(!(charsList.size() == 1 && charsList.get(0) == c)) {
					charsList.add(c);
				}		
				// Step-4 --> Update HashMap with the same Char but with latest Index Integer Value.
				//charPositionMap.put(c, word.length() - 1);
				charPositionMap = updateCharsPositionMap(charsList);
				// Step-5 --> Update longStringLength if the identified word length is greater than current value of longStringLength.
				longStringLength = (word.length() > longStringLength) ? word.length() : longStringLength;
			}
		}
		
		return longStringLength;
	}
	
	public static String findWordFromList(List<Character> charsList, int startIndex) {

		StringBuilder sb = new StringBuilder();
		for (int i=0; i< charsList.size(); i++) {
			if(i >= startIndex) {
				sb.append(charsList.get(i));
			} else {
				continue;
			}
		}

		return sb.toString();
	}

	public static String convertCharsListToString(List<Character> charsList, Character c) {

		StringBuilder sb = new StringBuilder();
		for (Character ch : charsList) { 
			sb.append(ch); 
		}

		String word = sb.toString();

		return word;
	}


	public static List<Character> updateCharsList2(String repeatableWord) {

		List<Character> charsList = new ArrayList<>();

		for (int i = 0; i < repeatableWord.length(); i++) { 
			if(i == 0) {
				continue;
			}
			charsList.add(repeatableWord.charAt(i));
		}
		
		return charsList;
		
	}
	
	public static List<Character> updateCharsList(String repeatableWord) {

		List<Character> charsList = new ArrayList<>();
		if(repeatableWord.length() == 1) {
			charsList.add(repeatableWord.charAt(0));
			return charsList;
		}
		for (int i = 0; i < repeatableWord.length(); i++) { 
			if(i == 0) {
				continue;
			}
			charsList.add(repeatableWord.charAt(i));
		}
		
		return charsList;
		
	}
	
	public static HashMap<Character, Integer> updateCharsPositionMap(List<Character> charsList) {

		HashMap<Character, Integer> charPositionMap = new HashMap<>();
		for (int i = 0; i < charsList.size(); i++) { 
			charPositionMap.put(charsList.get(i), i);
		}
		return charPositionMap;
	}
	
	static public String intermediatePalindrome(String s, int left, int right) {
		if (left > right) return null;
		while (left >= 0 && right < s.length()
				&& s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}

	// O(n^2)
	public static String longestPalindromeString(String s) {
		if (s == null) return null;
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length() - 1; i++) {
			//odd cases like 121
			String palindrome = intermediatePalindrome(s, i, i);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
			//even cases like 1221
			palindrome = intermediatePalindrome(s, i, i + 1);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
		}
		return longest;
	}
	
	
	
	
    public String findTheLongestPalindrome(String str){
        if (str == null) {
            return null;
        }
        String longestPalindrome = String.valueOf(str.charAt(0));
        for (int i = 0; i < str.length() - 1; i++) {
            String returnedPalindrome = findLongestPalindromeWithSpecifiedParameter(str, i, i);
            if (returnedPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = returnedPalindrome;
            }
            returnedPalindrome = findLongestPalindromeWithSpecifiedParameter(str, i, i + 1);
            if (returnedPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = returnedPalindrome;
            }
        }
        return longestPalindrome;
    }

    public String findLongestPalindromeWithSpecifiedParameter(String str, int left, int right) {
        if (left > right)
            return null;

        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }


}
