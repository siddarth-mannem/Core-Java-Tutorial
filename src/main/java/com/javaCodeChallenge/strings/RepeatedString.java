package com.javaCodeChallenge.strings;

/**
 * Q: Repeated String Match
 * 
 * https://leetcode.com/problems/repeated-string-match/
 * 
 * @author siddharth
 * @Created Oct 22, 2020
 *
 */
public class RepeatedString {

	public static void main(String[] args) {
		
		//String a="abc", b="cabcabca"; 
		String a = "abcd", b = "cdabcdab";
		//String a = "a", b = "aa";
		
		System.out.println(mySolution( a,  b));
	}
	
	private static int mySolution(String a, String b) {
		StringBuilder sb = new StringBuilder(a);
		//System.out.println(a.indexOf(b));
		
		boolean isBSubStringOfA = false;
		int minRepeatCount = 1;
		
		while(!isBSubStringOfA && sb.length() <= 10000) {
			System.out.println(sb.indexOf(b));
			if(sb.indexOf(b) >= 0) {
				isBSubStringOfA = true;
				break;
			}
			minRepeatCount++;
			sb.append(a);
		}
		return minRepeatCount = isBSubStringOfA ? minRepeatCount : -1;
		
	}
	
	private static int bestSolution(String A, String B) {
		
		StringBuilder sb = new StringBuilder(A);
        int count = 1;
        while (sb.length() < B.length()) {
            sb.append(A);
            count++;
        }
        if (sb.indexOf(B) >= 0) {
            return count;
        }
        sb.append(A);
        return sb.indexOf(B) >= 0 ? count + 1 : -1;
	}
	

}
