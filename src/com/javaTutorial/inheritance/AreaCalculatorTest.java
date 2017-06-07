package com.javaTutorial.inheritance;

public class AreaCalculatorTest {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(2.0, 2.0);
		r.calculateArea();
		r.permiter();
		
		
		Circle c = new Circle(2.0);
		c.calculateArea();
		
		
		System.out.println("--------------------");
		// Polymorphism
		Shape rec = new Rectangle(3.0, 3.0);
		rec.calculateArea();
		
	}

}
