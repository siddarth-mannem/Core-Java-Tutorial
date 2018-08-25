package com.javaTutorial.core.inheritance.abstractDemo;

public class AbstractTest {

	
	public static void main(String[] args) {

		Shape rectangle = new RectangleShape();
		rectangle.calculateArea(); //Hello We are in class RectangleShape and claculateArea()...
		rectangle.display(); //Hello we are in rectangleShape class and Display()...
		//rectangle.calculateVolume();
		
		TriangleShape triangle = new TriangleShape();
		//Hello We are in class TriangleShape and claculateArea()...
		triangle.calculateArea(); // hiding implementation logic defined in TriangleShape
		triangle.display(); //Hello We are in Shape class....
		
		Shape circleShape = new CircleShape(3.14);
		circleShape.calculateArea();
		
	}
}
