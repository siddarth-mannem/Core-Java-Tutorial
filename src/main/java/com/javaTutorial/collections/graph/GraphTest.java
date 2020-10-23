package com.javaTutorial.collections.graph;

public class GraphTest {

	public static void main(String[] args) {

		String name = "Hello Siddhu  ";
		
//		int startIndexOfLastWord2 = name.lastIndexOf("d", 10);
//		
//		System.out.println(startIndexOfLastWord2);
		
		int startIndexOfLastWord = name.lastIndexOf(" ", 11);
		
		System.out.println(startIndexOfLastWord);
		
		System.out.println("-" + name.substring(startIndexOfLastWord + 1, 11+1) + "-");
		System.out.println(name);
		System.out.println(name.charAt(13));
		
		String copyOfOrig = name.substring(0, 14);
		System.out.println("--------------------------" + copyOfOrig + "-");
		String word  = null;
		int k = copyOfOrig.length() -1;
        while(k>=0 && copyOfOrig.charAt(k) == ' ') {
            k = k-1;
        }
        int startIndexOfLastWord3 = copyOfOrig.lastIndexOf(" ", k);

        word = copyOfOrig.substring(startIndexOfLastWord3 + 1, k+1);
        copyOfOrig = copyOfOrig.substring(0, k - word.length());
        
		System.out.println("*" + word + "*" + word.length() + " name Length: " + name.length());
		System.out.println("-" + name.substring(0, k - word.length()) + "-");
		name = name.substring(0, k - word.length());
		System.out.println("*" + name + "*");
		
	}
	
	public static String readCharsFromWord(String subString, int i) {
		
        if(i>=0 && subString.charAt(i) == ' ') {
            return readCharsFromWord(subString, i-1);
        } 
        
        int startIndexOfLastWord = subString.lastIndexOf(" ", i);
        
        return subString.substring(startIndexOfLastWord + 1, i+1);
    }

}
