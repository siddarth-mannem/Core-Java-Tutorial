package com.javaTutorial.classesAndObjects;

public abstract class Parent1 {

	protected static String name;
	
	public Parent1() {
		System.out.println("Parent1 Contructor and name: " + name);
	}
	
	public static Parent1 createChild(String dynaName) {
		
		name = dynaName;
		return new Child1();
		
	}
	
	public abstract void run() throws NullPointerException ;
}
