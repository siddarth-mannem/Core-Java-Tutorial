package com.javaTutorial.inheritance;

public class Employee extends Person {
	
	protected String occupation;
	protected double salary;
	
	public Employee() {
		System.out.println("Employee Constructor");
	}
	
	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}
	
	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		System.out.println("Complete name: " + printCompleteName());
		return salary;
	}
	
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public void getDetails() {
		System.out.println("In Employee class abd ub getDetails() method");
	}
	
	/**
	 * This method calcualtes or append firstname, middlenmae and lastname and resturns the final name
	 * @return
	 */
	protected String printCompleteName() {
		
		String completeFullName = this.firstName + " " + this.lastName;
		
		return completeFullName;
	}
	

}
