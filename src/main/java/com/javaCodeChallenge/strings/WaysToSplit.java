package com.javaCodeChallenge.strings;

/**
 * Q: Number of Ways to Split a String
 * 
 * 
 * https://leetcode.com/problems/number-of-ways-to-split-a-string/
 * 
 * @author siddharth
 * @Created Oct 22, 2020
 *
 */
public class WaysToSplit {

	public static void main(String[] args) {
		
		String s = "10101";
		
		int count = 0;
		char[] ar = s.toCharArray();
		
		int total1s = 0;
		
		for(int i=0; i< ar.length; i++) {
			if(ar[i] == '1') {
				total1s++;
			}
		}
		
		for(int i=0; i< ar.length; i++) {
			
		}
	}

}
