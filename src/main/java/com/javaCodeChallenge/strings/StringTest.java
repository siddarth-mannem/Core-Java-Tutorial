package com.javaCodeChallenge.strings;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class StringTest {

	public static void main(String[] args) throws ParseException {
		
		String inputStmt = "Bob hit a ball, the hit BALL flew999.far after it was hit. the inception.";
		System.out.println(inputStmt.length());
		System.out.println(inputStmt.lastIndexOf("the", 59));
		//System.out.println(inputStmt.replaceFirst("the", "ooo"));
		
		String[] splitStrings = inputStmt.split(" ");
		Arrays.stream(splitStrings).forEach(System.out::println);
		System.out.println("------------------");
		System.out.println(inputStmt.substring(0, 1));
		
		String str = "Hello world  Siddarth";
		System.out.println("Str before last space ->  " + str.substring(0,
				str.lastIndexOf(" ", str.length()-1)
				));
		System.out.println("missing substring " + str.substring(str.indexOf("Siddarth")));
		System.out.println("str1 replace siddarth with 29 -> " + str.replace(str.substring(str.indexOf("Siddarth")), "29.01"));
		String str2 = "1/3/2012 16:00:00	26.96";
		
		//String str2 = str; 
		System.out.println(" and lastIndex of ( ) :" + str2.lastIndexOf("\t", str2.length()-1));
		String str2DoubleVal = str2.substring(
				str2.lastIndexOf("\t", str2.length()-1),
				str2.length()
		);
		
		System.out.println("str2DoubleVal : " + str2DoubleVal);
		double value = Double.valueOf(str2DoubleVal);
		System.out.println("Str After last space -> " + str2DoubleVal);
		double beforeAvg = (value -1) + value;
		System.out.println("Avg: " + 
				Math.round(
							( 1.0 * beforeAvg) / 2 * 10.0
						) / 10.0
		);
		
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String dt = "10/23/2020 16:00:00  ";
		Date date = sd.parse(dt);
		Timestamp timeStamp = new Timestamp(date.getTime());
		System.out.println("Time: " + timeStamp);
		
		System.out.println(27.01 - 1);
		System.out.println("-------------");
		List<String> strs = new ArrayList<>();
		strs.add("Sid");
		strs.add("Vishnu");
		System.out.println(strs);
		String s = strs.get(0);
		s = "GGG";
		for (int i = 0; i < strs.size(); i++) {
			if(i == 1) {
				strs.set(i, strs.get(i) + " --- ");
				continue;
			}
		}
		System.out.println(strs);
		
		
		System.out.println("---------------------------------------");
		
//		String logs = "88 99 200";
//		String[] numbers = logs.split("\\s+");
//		for(String num : numbers) {
//			System.out.println(num);
//		}
		String regex = "\\s+$";
		String str3 = "Hello  - - world  - - Siddarth";
		String ans = str3.substring(0 , str3.indexOf("- -"));
		System.out.println(ans + "$");
		System.out.println(ans.replaceAll(regex, "") + "$");
		System.out.println(ans);
	}

}
