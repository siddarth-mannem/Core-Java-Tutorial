package com.javaTutorial.inheritance;

public abstract class Shape {
	
	private int length;
	public final double pi = 3.14;
	
	public Shape() {
		System.out.println("In Shape");
	}
	public Shape(int length) {
		this.length = length;
	}
	
	public void calculateArea() {
		System.out.println("In Shape, calcualteARea()");
	}
	
	public abstract double calcilatePerimeter();
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

}
