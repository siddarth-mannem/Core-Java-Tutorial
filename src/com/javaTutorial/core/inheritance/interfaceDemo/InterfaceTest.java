package com.javaTutorial.core.inheritance.interfaceDemo;

public class InterfaceTest {

	
	public static void main(String[] args) {

		IShape rectangle = new RectangleShapeImpl();
		rectangle.calculateArea(); //Hello We are in class RectangleShape and claculateArea()...
		rectangle.display(); //Hello we are in rectangleShape class and Display()...
		
		IShape triangle = new TriangleShapeImpl();
		//Hello We are in class TriangleShape and claculateArea()...
		triangle.calculateArea(); // hiding implementation logic defined in TriangleShape
		triangle.display(); //Hello We are in Shape class....
	}
}
