package com.javaTutorial.collections.session11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.javaTutorial.classesAndObjects.Phone;

public  class ArrayListSampleTest {

	public static final List<Integer> numbers = Arrays.asList(new Integer[] {28,29,30,31,32});

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

		if(!numbers.contains(new Integer(3))) {
			System.out.println("Yes it ocntains **** ");
		}

		List<Object> numbersStrings = new ArrayList<Object>();
		numbersStrings.add("1");
		numbersStrings.add("2");
		numbersStrings.add("28");
		numbersStrings.add("29");
		numbersStrings.add("30");
		numbersStrings.add("31");
		numbersStrings.add("32");

		List<String> namesStringsArray = new ArrayList<String>();

		for(int i=0; i< numbersStrings.size(); i++) {
			namesStringsArray.add((String) numbersStrings.get(i));
		}

		List finalPrivilegesList = new ArrayList();
		for(Integer priv: numbers) {
			if(namesStringsArray.contains(priv.toString())) {
				finalPrivilegesList.add(priv.toString());
			}
		}

		for(Object finalPriv: finalPrivilegesList) {
			System.out.println(finalPriv);
		}

		/*		System.out.println("Before removing values:");
		for(Object o: numbersStrings) {
			System.out.println(o + "");
		}

		List<Object> eEnrolPrivileges = new ArrayList<Object>();
		for(Object o : numbersStrings) {
			String str = (String) o;
			if(numbers.contains(Integer.valueOf(str))) {
				//numbersStrings.remove(o);
				continue;
			} 
			eEnrolPrivileges.add(o);

		}
		for(Object o : eEnrolPrivileges) {
			numbersStrings.remove(o);
		}

		System.out.println("After removing values:");
		for(Object o: numbersStrings) {
			System.out.println(o + "");
		}*/


	}


}
