package com.javaTutorial.abstractAndInterface;

public class AbstractTest {

	public static void main(String[] args) {

		Animal t = new Tiger();
		t.doThings();
		
		Animal c = new Cow();
		c.doThings();
		
		
		Cow cow = new Cow();
		cow.sound();
		
	}

}
