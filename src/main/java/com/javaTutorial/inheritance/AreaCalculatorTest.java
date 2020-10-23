package com.javaTutorial.inheritance;

public class AreaCalculatorTest {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(2.0, 2.0);
		r.calculateArea();
		//r.permiter();
		
		
		Circle c = new Circle(2.0);
		c.calculateArea();
		
		
		System.out.println("--------------------");
		// Polymorphism
		Shape rec = new Rectangle(3.0, 3.0);
		rec.calculateArea();
		
		Shape s2 = new Shape(123) {
			
			@Override
			public double calcilatePerimeter() {
				
				System.out.println("Hello we are in Shape overrided class : " + getLength());
				return 0;
			}
		};
		
		Shape circle = new Shape(3) {

			@Override
			public double calcilatePerimeter() {
				double perimeter = 2 * pi * getLength();
				return perimeter;
			}
			@Override
			public void calculateArea() {
				
				System.out.println("In Circle calcualteARea...");
				
				//double area = pi * ( Math.pow(radius, 2) ) ;
				//System.out.println("total Area of Circle is: " + area);
			}
			
		};
		
		s2.calcilatePerimeter();
		
		Shape r2 = new Circle(2.3);
		
		r2.calcilatePerimeter();
		
		
	}

}
