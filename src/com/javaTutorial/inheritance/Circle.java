package com.javaTutorial.inheritance;

public class Circle extends Shape {
	
	private double radius;
	private final double pi = 3.14;
	
	public Circle(double radius) {
		
		this.radius = radius;
		
	}
	
	@Override
	public void calculateArea() {
		
		System.out.println("In Circle calcualteARea...");
		
		double area = pi * ( Math.pow(radius, 2) ) ;
		System.out.println("total Area of Circle is: " + area);
	}

}
