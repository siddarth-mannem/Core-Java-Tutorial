package com.javaCodeChallenge.strings;

/**
 * Q: Reverse Words in a String
 * 
 * Ref: https://leetcode.com/problems/reverse-words-in-a-string/
 * 
 * @author siddharth
 * @Created Oct 21, 2020
 *
 */
public class ReverseWordsInAStringTest {

	public static void main(String[] args) {

		String statement1 = "  hello world  ";
		System.out.println(statement1);
		
		String statement2 = "a good   example";
		System.out.println(statement2);
		
		System.out.println("statement2 after revesing : ");
		System.out.println("*" + reverseWords(statement2) + "*");

	}

	public static String reverseWords(String s) {

		String copyOfOrig = s;
		String resultString = "";
		if(copyOfOrig == null) {
			return resultString;
		}
		int inputLength = copyOfOrig.length();

		for(int i=(inputLength - 1); i >= 0; i--) {

			if(Character.isWhitespace(copyOfOrig.charAt(i) )) {
				if(resultString == "") {
					continue;
				}
			}
			if(i >= 0) {
				int k = i;
				while(k>=0 && copyOfOrig.charAt(k) == ' ') {
					k = k-1;
				}
				int startIndexOfLastWord3 = copyOfOrig.lastIndexOf(" ", k);

				String word = copyOfOrig.substring(startIndexOfLastWord3 + 1, k+1);
				resultString = resultString + word + " ";
				if(k<0 || k - word.length()<=0) {
					resultString = resultString.substring(0, resultString.length()-1);
					break;
				}
				copyOfOrig = copyOfOrig.substring(0, k - word.length());
				i = copyOfOrig.length();
			}
		}
		
		return resultString;
	}

	public static String readCharsFromWord(String subString, int i) {

		if(i>=0 && subString.charAt(i) == ' ') {
			return readCharsFromWord(subString, i-1);
		} 

		int startIndexOfLastWord = subString.lastIndexOf(" ", i);

		return subString.substring(startIndexOfLastWord + 1, i+1);
	}

}
