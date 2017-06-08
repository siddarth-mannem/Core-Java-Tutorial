package com.javaTutorial.collections.session11;

import java.util.ArrayList;
import java.util.LinkedList;

import com.javaTutorial.classesAndObjects.Book;
import com.javaTutorial.classesAndObjects.Phone;

public class ArrayListSampleTest {

	public static void main(String[] args) {

		/*ArrayList<Phone> phonesList = new ArrayList<>();
		
		Phone phone1 = new Phone("Iphone3", 6.3, "Apple", 1.00, 32524546, true);
		Phone phone2 = new Phone("Glaaxy", 6.3, "Samsung", 1.00, 567457, false);
		
		phonesList.add(phone1);
		phonesList.add(phone2);*/
		
		Phone phone1 = new Phone("Iphone3", 6.3, "Apple", 1.00, 32524546, true);
		Phone phone2 = new Phone("Glaaxy", 6.3, "Samsung", 1.00, 567457, false);
		
		LinkedList<Phone> phonesList = new LinkedList<>();
		
		phonesList.add(phone2);
		phonesList.add(phone1);
		
				
	}

}
