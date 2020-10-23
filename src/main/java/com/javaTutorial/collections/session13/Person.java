package com.javaTutorial.collections.session13;

import java.util.List;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	private Integer ssn;
	private Integer taxId;
	private String passportNum;
	private Address address;
	private Phone phone;
	private List<Phone> personPhones;
	
	/**
	 * @return the personPhones
	 */
	public List<Phone> getPersonPhones() {
		return personPhones;
	}

	/**
	 * @param personPhones the personPhones to set
	 */
	public void setPersonPhones(List<Phone> personPhones) {
		this.personPhones = personPhones;
	}

	public Person(String firstName, String lastName, int age, Integer ssn, Integer taxId, String passportNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ssn = ssn;
		this.taxId = taxId;
		this.passportNum = passportNum;
	}
	
	public Person() {
		
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


	/**
	 * @return the ssn
	 */
	public Integer getSsn() {
		return ssn;
	}


	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}


	/**
	 * @return the taxId
	 */
	public Integer getTaxId() {
		return taxId;
	}


	/**
	 * @param taxId the taxId to set
	 */
	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}


	/**
	 * @return the passportNum
	 */
	public String getPassportNum() {
		return passportNum;
	}


	/**
	 * @param passportNum the passportNum to set
	 */
	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public Phone getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(Phone phone) {
		this.phone = phone;
	}


	public void getDetails() {
		System.out.println("In PErson class and in getDEtails() method.");
	}

}
