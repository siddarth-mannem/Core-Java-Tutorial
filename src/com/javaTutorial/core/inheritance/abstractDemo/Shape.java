package com.javaTutorial.core.inheritance.abstractDemo;

public abstract class Shape {

	
	public void display() {
		System.out.println("Hello We are in Shape class....");
	}
	
	/**
	 * Defining abstract methods.
	 * Unimplemented Methods
	 */
	public abstract void calculateArea();
}
