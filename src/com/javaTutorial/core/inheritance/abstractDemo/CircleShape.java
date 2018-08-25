package com.javaTutorial.core.inheritance.abstractDemo;

public class CircleShape extends Shape {

	private final double PIE;
	
	public CircleShape(double pie) {
		PIE = pie;
	}
	
	@Override
	public void calculateArea() {

		System.out.println("Hello We are in class CircleShape calculateArea.... " + PIE);
	}

}
