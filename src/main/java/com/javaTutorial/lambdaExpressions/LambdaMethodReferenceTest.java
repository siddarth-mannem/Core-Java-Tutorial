package com.javaTutorial.lambdaExpressions;

@FunctionalInterface 
interface Calculator {
	void tax(int number1, int number2);

	default void federalTax(int number1, int number2) {
		System.out.println("In Calculator default method federalTax()");
	}

	default void stateTax(Class<? extends Calculator> className, int number1, int number2) {
		System.out.println("In Calculator default method stateTax(): " + className.getSimpleName());
	}
}

class TaxCalculator {

	public TaxCalculator() {
		System.out.println("Method Referece Constructor. TaxCalculator : ");
	}
	
	public TaxCalculator(int num1, int num2) {
		System.out.println("Method Referece Constructor. TaxCalculator : " +  num1 + " + " + num2);
	}

	static void homeLoan(int num1, int num2) {
		System.out.println("In TAxCalculator homeLoan : " + num1 + " + " + num2 + " = " + (num1 + num2));
	}

	void carLoan(int num1, int num2) {
		System.out.println("In TAxCalculator carLoan : " + num1 + " + " + num2 + " = " + (num1 + num2));
	}
	void personalLoan(int num1, int num2) {
		System.out.println("In TAxCalculator personalLoan : " + num1 + " + " + num2 + " = " + (num1 + num2));
	}
}

// Functional interface 
@FunctionalInterface
interface Messenger {
	Message getMessage(String msg);
}

class Message {
	public Message(String msg) {
		System.out.println("Method Referece Constructor. The Message is : " + msg);
	}
}

public class LambdaMethodReferenceTest {

	
	public static void main(String[] args) {
		// Static reference
		Calculator c1 = TaxCalculator::homeLoan;
		c1.tax(2, 3);
		
		// instance method
		TaxCalculator taxC = new TaxCalculator();
		Calculator c2 = taxC::carLoan;
		c2.tax(7, 8);
		
		// constructor
		Calculator c3 = TaxCalculator::new;
		c3.tax(1, 2);
		
		
	}
	
//	public static void main(String[] args) {
//
//		//  1. Reference to Static method
//		Calculator calc = TaxCalculator::homeLoan;
//		calc.tax(2,  4);
//
//		// 2. Reference to a Non-Static method or instance method
//		TaxCalculator taxCalc = new TaxCalculator();
//		Calculator calcCar = taxCalc::carLoan;
//		calcCar.tax(5, 7);
//		Calculator calcPersonal = taxCalc::personalLoan;
//		calcPersonal.tax(10, 15);
//		calcCar.federalTax(5,  7);
//		calcPersonal.stateTax(calcPersonal.getClass(), 10,  15);
//		
//		// 3. Reference to a constructor
//		Messenger msgr = Message::new;
//		msgr.getMessage("Hello Lamda");
//		Calculator calConst = TaxCalculator::new;
//		calConst.tax(15,  30);
//
//	}

}
