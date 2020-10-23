package com.javaTutorial.abstractAndInterface;

public abstract class Animal {
	
	String name;
	
	//Implemeted
	public void sound() {
		System.out.println("In Animal class and in sound() ");
	}
	
	public abstract void eats();
	
	// Abstract where we dont write logic
	public abstract void doThings();

}
