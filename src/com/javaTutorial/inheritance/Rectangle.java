package com.javaTutorial.inheritance;

public class Rectangle extends Shape {
	
	private double length;
	private double breath;
	
	public Rectangle(double length, double breath) {
		
		this.length = length;
		this.breath = breath;
		
	}
	
	@Override
	public void calculateArea() {
		
		System.out.println("In Rectangle calcualteARea...");
		double area = length * breath;
		System.out.println("total Area of Rectangle is: " + area);
	}
	
	public void permiter() {
		System.out.println("Perimeter is : " + (length + breath));
	}

}
