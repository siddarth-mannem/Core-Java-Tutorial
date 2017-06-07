package com.javaTutorial.inheritance;

public class Manager extends Employee {
	
	private String department;
	
	public Manager() {
		System.out.println("Manager Constructor");
		
		super.occupation = "IT Manager";
		super.salary = 5654.00;
		super.firstName = "Lee";
		super.lastName = "Chad";
		super.age = 50;
		
		super.setAge(30);
		
		this.department = "IT";
		
	}
	
	public Manager(String department) {
		this.department = department;
		
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
