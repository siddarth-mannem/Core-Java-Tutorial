package com.javaTutorial.classesAndObjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File(args[0]);
		
		Scanner fileScanner = new Scanner(file);
				
		while(fileScanner.hasNextLine()){
			String line = fileScanner.nextLine();
			if(!line.equalsIgnoreCase("")){
				int lineLength = line.length();
				int minPeriod = lineLength;
				String testString = line.substring(0,minPeriod/2);
				while(testString.length() >= 1){
					int testStringLength = testString.length();
					String restOfString = line.substring(testStringLength, testStringLength + testStringLength);
					if(testString.equalsIgnoreCase(restOfString)){
						minPeriod = testStringLength;
					}
					testString = testString.substring(0, testStringLength - 1);
				}
				System.out.println(minPeriod);
			}
		}
		
		fileScanner.close();
	}

}
