package com.javaTutorial.collections.session11;

public class Customer extends Object {
	
	protected String firstName;
	protected String lastName;
	protected int age;
	
	public Customer(String firstName, String lastName, int age) {
		//System.out.println("Customer Constructor");
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public void getDetails() {
		System.out.println("In PErson class and in getDEtails() method.");
	}
	
	@Override
	public boolean equals(Object obj) {
		
		int hashCodeValue = hashCode();
		if(hashCodeValue == obj.hashCode()) {
			return true;
		}
		return false;	
	}
	
	@Override
	public int hashCode() {
		int hashValue = this.firstName.hashCode() + this.lastName.hashCode() + this.age;
		
		return hashValue;
	}

}
