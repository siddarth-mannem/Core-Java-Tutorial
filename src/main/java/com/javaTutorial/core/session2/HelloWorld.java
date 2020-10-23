
package com.javaTutorial.core.session2;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello this is hte first program..." + args);
		List<String> namesList = new ArrayList<String>();
		
		namesList.add("Hello1");
		namesList.add("Hello2");
		namesList.add("Hello3");
		namesList.add("Hello4");
		namesList.add("Hello5");
		namesList.add("Hello6");
		
		for(int i=0; i<namesList.size(); i++) {
			System.out.println(namesList.get(i));

			if(namesList.get(i).equals("Hello3")) {
				System.out.println("Before Remove" + namesList.get(i));
				namesList.remove("Hello3");
			}
			System.out.println("After Remove: " + namesList.get(i));
		}
		
		
	}
	
}
