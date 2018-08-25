package com.javaTutorial.core.inheritance.abstractDemo;

public class RectangleShape extends Shape {
	
	
	public void display() {
		System.out.println("Hello We are in class RectangleShape display....");
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Hello We are in class RectangleShape calculateArea....");
		
	}

}
