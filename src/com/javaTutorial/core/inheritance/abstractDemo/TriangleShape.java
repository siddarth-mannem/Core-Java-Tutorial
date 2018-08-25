package com.javaTutorial.core.inheritance.abstractDemo;

public class TriangleShape extends Shape {
	
	public void display() {
		System.out.println("Hello We are in class TriangleShape display....");
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Hello We are in class TriangleShape calculateArea....");
	}

}
