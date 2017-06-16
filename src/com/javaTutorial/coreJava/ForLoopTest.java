package com.javaTutorial.coreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ForLoopTest {

	public static void main(String[] args) {
		
		
		for(int i=9;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		Calendar cal = Calendar.getInstance();
	    Date date = cal.getTime();
	    System.out.println("Date: " + date.toString());

	    String strDateFormat = "HH:mm a";
	    SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
	    System.out.println(sdf.format(date));
	    
		
	}

}
