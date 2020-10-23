package com.javaCodeChallenge.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringTest1 {

	public static void main(String[] args) {
		
		
		String rg = "[a-zA-Z_0-9]+";
		Pattern pt = Pattern.compile(rg);
		
		String inputStmt = "Bob hit a ball, the hit BALL flew999.far after it was hit.";
		String updatedInputStmt = inputStmt.replaceAll("[^a-zA-Z0-9]", "-");
		System.out.println("updatedInputStmt: \n "+ updatedInputStmt);
		Matcher mt = pt.matcher(inputStmt);
		String[] banned =  new String[] {"hit"};
		Map<String, Integer> bannedWords = new HashMap<>();
		String[] wordsArray = updatedInputStmt.split("-"); //updatedInputStmt.split("\\s");
		Arrays.stream(wordsArray).forEach(System.out::println);
		
		System.out.println("*-------------*");
		//words.forEach(System.out::print);
		while(mt.find()) {
			System.out.println(mt.group());
		}
		System.out.println("----------");
		String txt = "geeksforgeekshellooo"; 
		  
        // Demonstrating ^ 
        String regex1 = "^geeks"; 
        Pattern pattern1 = Pattern.compile(regex1, Pattern.CASE_INSENSITIVE); 
        Matcher matcher1 = pattern1.matcher(txt); 
        while (matcher1.find()) 
        { 
        	System.out.println("group: "+matcher1.group());
            System.out.println("Start index: " + matcher1.start()); 
            System.out.println("End index: " + matcher1.end()); 
        } 
  
        // Demonstrating $ 
        String regex2 = "geeks$"; 
        Pattern pattern2 = Pattern.compile(regex2, Pattern.CASE_INSENSITIVE); 
        Matcher matcher2 = pattern2.matcher(txt); 
        while (matcher2.find()) 
        { 
        	System.out.println("\n" + matcher2.group());
            System.out.println("Start index: " + matcher2.start()); 
            System.out.println("End index: " + matcher2.end()); 
        }
        
        System.out.println("----------");
	}

}


