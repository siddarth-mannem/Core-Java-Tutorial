package com.javaTutorial.core.inheritance.interfaceDemo;

/**
 * Java 7
 * @author smanne02
 *
 */
public interface IShape extends IStructure {

	
	/**
	 * Defining abstract methods.
	 * Unimplemented Methods
	 */
	public abstract void calculateArea();
	
	public abstract void display();

	/***
	 * Works only for JAVA-8
	 */
	default public void newDefaultMethod() {
		
        System.out.println("New default method is added in interface");
    }
	
}
