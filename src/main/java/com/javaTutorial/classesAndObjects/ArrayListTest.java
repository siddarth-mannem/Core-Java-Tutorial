package com.javaTutorial.classesAndObjects;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		//ArrayList<String> friends = new ArrayList<>();
		ArrayList<String> friends = new ArrayList<>();
		// xyz() exists in ARraylist 
		friends.add("Tony STark");   // 0
		friends.add("Steve Rogers"); // 1 // 2
		friends.add("Hulk");  		// 2  // 3
		friends.add(1, "scarlet Johanson"); // after this // 1
		
		// OLd way.
		for(int i =0; i< friends.size(); i++) {
			System.out.println("Old For Loop: " + friends.get(i) );
		}
		System.out.println("----------------------------------------");
		
		// new For loop
		for(String str : friends) {
			System.out.println("New For Loop" + str);
		}
		
/*		String[] friends2 = new String[10];
		friends2[0] = "TOny STark";
		
		for(int i =0; i< friends2.length; i++) {
			String str = friends2[i];
			System.out.println(str);
		}*/
		
		
		ArrayList<Phone> phonesList = new ArrayList<>();
		Phone phone1 = new Phone();
		phone1.setMaker("Apple");
		phone1.setModel("IPhone7");
		phone1.setNumber(98674958L);
		phone1.setSize(23.454);
		phone1.setVr(true);
		
		Phone phone2 = new Phone();
		phone2.setMaker("Samsung");
		phone2.setModel("Gallaxy6");
		phone2.setNumber(98674958L);
		phone2.setSize(345.454);
		phone2.setVr(false);
		
		phonesList.add(phone1);
		phonesList.add(phone2);	
		
		
		for(int i=0; i< phonesList.size(); i++) {
			
			Phone phone = phonesList.get(i);
			
			System.out.println("Maker: " + phone.getMaker());
			System.out.println("Model: " + phone.getModel());
			System.out.println("Number Before Re assign: " + phone.getNumber());
			System.out.println("---------------------------");
		}
		
		for(Phone phone : phonesList) {
			
			System.out.println("Maker: " + phone.getMaker());
			System.out.println("Model: " + phone.getModel());
			System.out.println("Number Before Re assign: " + phone.getNumber());
			System.out.println("---------------------------");
		}
		
		ArrayList<Phone> phonesList_2 = phonesList;

		Phone phone3 = new Phone();
		phone3.setMaker("ZZZZZZZZZZZ");
		phone3.setModel("XXXXXXXXXX");
		phone3.setNumber(222222222L);
		phone3.setSize(111.1111);
		phone3.setVr(true);
		
		System.out.println("After modifed Phone2 values using phonesList_2");
		
		for(Phone phone : phonesList) {
			
			System.out.println("Maker: " + phone.getMaker());
			System.out.println("Model: " + phone.getModel());
			System.out.println("Number Before Re assign: " + phone.getNumber());
			System.out.println("---------------------------");
		}
		
		Integer studentId = 456;
		
		int stdId = studentId;
		
		ArrayList<Integer> types = new ArrayList<>();
		
	}

}
