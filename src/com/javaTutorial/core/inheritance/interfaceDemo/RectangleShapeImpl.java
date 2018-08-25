package com.javaTutorial.core.inheritance.interfaceDemo;

public class RectangleShapeImpl implements IShape {
	
	
	@Override
	public void display() {
		System.out.println("Hello We are in class RectangleShapeImpl and display()...");
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Hello We are in class RectangleShapeImpl and claculateArea()...");
		
	}


}
