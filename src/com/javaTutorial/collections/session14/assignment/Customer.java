package com.javaTutorial.collections.session14.assignment;



public class Customer {
	private String firstName;
	private String lastName;
	private Double height;
	private Double ssn;

	public Customer(String firstName, String lastName, double height, double ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
		this.ssn=ssn;
		
		
	}
	
	public Double getSsn() {
		return ssn;
	}

	public void setSsn(Double ssn) {
		this.ssn = ssn;
	}

	public Customer() {
		
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
	
	
	
	/**
	 * @return the height
	 */
	public Double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(Double height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	
	public void getDetails() {
		System.out.println("In PErson class and in getDEtails() method.");
}

}
