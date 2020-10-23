package com.javaCodeChallenge.strings;

/*
 * Q: Split a String in Balanced Strings
 * 
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */
public class StringSplitTest {

	public static void main(String[] args) {
		
		
		//String s = "RLRRLLRLRL";
		String s = "RLLLLRRRLR";
		//String[] splitStrings = s.split("RL");
		
		//Arrays.stream(splitStrings).forEach(System.out::println);
		
		int check = 0;
        int count = 0;
        
		char[] ar = s.toCharArray();
		
		for(int i = 0; i < ar.length; i++) {
            if(ar[i] == 'R') {
                check++;
            }else if(ar[i] == 'L'){
                check--;
            }
            if(check == 0) {
                count++;
            }
        }
		
		System.out.println(count);
		
	}

}
