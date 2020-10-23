package com.javaTutorial.coreJava;

public class HelloTest {

	static final double pi = 3.14;
	final String company = "United Helath Care";
	
	public static void main(String[] args) {
		
		int x = 1;
		int y = 18;
		int z = x/y; // 10/3
		
		int z2 = y % x; // 10/3
		
		System.out.println(z);
		System.out.println(z2);
		
		/*
		 * 		3) 10 (3
		   		   9
		          ---
		           1
		 */
		
	//						  15	+    3	  -     0    18	 
//							  |			 |	    (1 % 18)  |
		double finalValue = (3 * 5) + (6 / 2) - 1 % (3 * 6);
		System.out.println(finalValue);
		
		
		int i = 5;
		int j = 5;
		
		boolean k = i >= j; // 5 > 5 --> false; 5 = 5 --true
		
		System.out.println(k);
		
		
		i = i + j;
		System.out.println(i);
		
		
		
		int abc = 666;
		
		//Pre Incremental
		int finalAbc = ++abc;
		/*abc = abc + 1;
		int finalAbc = abc;*/
		
		//Pre Decrement
		int bbb = 666;
		int finalBbb = --bbb;
		
		System.out.println(finalAbc);
		
		System.out.println(finalBbb);
		
		
		//Post Increment
		int ccc = 666;
		//int finalCcc = ccc++;
		
		int finalCcc = ccc;		
		ccc = ccc + 1;
		
		System.out.println(finalCcc);
		
		//Post Decremet
		
		int ddd = 666;
		int finalDdd = ddd--;
		
		System.out.println(finalDdd);
		
		System.out.println(ddd);
		
		
		
		
		
		
		
		
	}

}
