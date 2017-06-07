package com.javaTutorial.coreJava;

public class StringTest {
	
	static String LegengNAmes = ""; 

	public static void main(String[] args) {

		String name = "John";
		
		String s1 = "Hello";	// memory location address Hashcode#123
		String s2 = "Hello";	//	Hashcode#123
		String s3 = "Bye";		// hashCode#124
		String s4 = new String("Hello");	// hashCode#125
		String s5 = "hello";	//	hashcode#126
		
		System.out.println(s1 == s2);  // Compare hashcode 123 == 123 // true
		System.out.println(s1 ==s4);	// Comapres hashcode 123 ==125 // false
		System.out.println(s1.equals(s4)); // Cpmapres value/content in a memory // Hello equals Hello // true
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println(s1.equals(s3));
		
		
		String note = "Hello World !!!";
		
		note.length(); //
		
		
		String names = "Erik, Gandhi, Hitler";
		
		// Erick and stores in some object and then 
		//Gandhi and soters in soe object 
		//  Hitler and Stores the values
		String[] namesArray = names.split(",");
		//System.out.println(namesArray);
		// ["Erick", "Gandhi", "Hilter"]
		
		
		/*StringBuilder sb = new StringBuilder("");		
		sb.append("Gandhi");
		sb.append(" is a Philantrhopihist");		
		System.out.println("String Buffer " + sb.toString());
		
		String evilName = "Adolph";
		System.out.println("Before Adding Two Strings : " + evilName);		
		evilName = evilName + " Hitler";		
		System.out.println("After Adding two strings : " + evilName);*/
		
		int sum = addingTwoNumbers(32, 1);
		
		System.out.println("Total Sum is: " + sum);
		
	} // Close bracket for main()/
	
	
	private static void addnums() {
		
		System.out.println(LegengNAmes);
		
		int sumInMethod1 = 2 + 3;
		System.out.println(sumInMethod1);
		
	}
	
	
	// Adding two numbers. Assistant1
	private static int addingTwoNumbers(int num1, int num2) {

		int sum = num1 + num2;
		System.out.println(sum);
		
		return sum;
		
	}
	
	// Method OverLaoding. Adding two numbers. Assistant2
	private static void addingTwoNumbers(int num1, int num2, int num3) {

		int sum = num1 + num2 + num3;
		System.out.println(sum);
	}
		
	
	
	private static int addNums2() {
		int sum = 2 + 3;
		System.out.println(sum);
		return 3;
		
	}
	
	// Adding two numbers. Assistant
	private static int addingTwoNumbers2(int num1, int num2) {

		int sum = num1 + num2;
		
		String name = "Gandhi"; 
		
		return sum;
		
	}
	
	
	private static boolean sendEmail() {
		
		return true;
		
	}

}
