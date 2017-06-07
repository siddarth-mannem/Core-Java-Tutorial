package com.javaTutorial.classesAndObjects;

public class ClassesAndObjectsTest {

	public static void main(String[] args) {
		
		Phone phone1 = new Phone(); // hashCode# 451
		phone1.number = 2163333333L;
				
		phone1.maker = "Apple";
		phone1.size = 6.7;
		//phone1.model = "iPhone7";
		phone1.setModel("iPhone77777777");

		System.out.println(phone1.getModel());
		System.out.println(phone1.getMaker());
		System.out.println(phone1.getNumber());
		System.out.println(phone1.getSize());
		
		// new Phone(); Create memory in Heap with empty data and with some addresss values called hashCode.
		
		System.out.println("---------------------------------------");
		Phone phone2 = new Phone(); // hashCode# 452
		phone2.number = 2485294862L;
		phone2.maker = "Samsung";
		phone2.size = 7.5;
		//phone2.model = "Galazy8";
		phone2.setModel("Galaxy88888888");
		System.out.println(phone2.getModel());
		System.out.println(phone2.getMaker());
		System.out.println(phone2.getNumber());
		System.out.println(phone2.getSize());
		
		Phone phone3 = new Phone(); // hashCode# 453
		Phone phone4 = new Phone(); // hashCode# 454
		
		Book book1 = new Book();
		
		Phone phone5; // phone5 null
		phone5 = new Phone();
	}

}
