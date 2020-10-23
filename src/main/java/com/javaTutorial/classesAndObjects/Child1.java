package com.javaTutorial.classesAndObjects;

public class Child1 extends Parent1 {

	public Child1() {
		super();
		System.out.println("In Child1 contructor..." + name);
	}
	
	@Override
	public void run() {
		System.out.println("In Child1 run method...");
	}
}
