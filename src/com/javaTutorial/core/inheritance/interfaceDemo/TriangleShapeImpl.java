package com.javaTutorial.core.inheritance.interfaceDemo;

public class TriangleShapeImpl implements IShape {

	@Override
	public void display() {
		System.out.println("Hello We are in class TriangleShapeImpl and display()...");

	}

	@Override
	public void calculateArea() {
		System.out.println("Hello We are in class TriangleShapeImpl and calculateArea()...");

	}

}
