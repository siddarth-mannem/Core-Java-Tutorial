package com.javaTutorial.classesAndObjects;

public class ConstructorAndOverlaodingTest {

	public static void main(String[] args) {

		
		Phone phone = new Phone(); // default
		phone.setMaker("udzhgkuhg");
		phone.setModel("aaaaaaaaaaa");
		phone.setSize(6.7);
		
		//Create a new Custom Constructor
		Phone phone2 = new Phone("Iphone7", 6.7, "Apple", 2.0, 3463456L, true);
		
		System.out.println("-------------------------------------");
		System.out.println("Model Name: " + phone2.getModel());
		System.out.println("size of hte phone: " + phone2.getSize());
		System.out.println("Maker of the Phone: " + phone2.getMaker());
		System.out.println(phone2.getNumber());
		
			
	}

}
