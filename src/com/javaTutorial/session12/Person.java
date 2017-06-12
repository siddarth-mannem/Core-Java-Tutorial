package com.javaTutorial.session12;

import java.util.Date;
import java.util.List;

public class Person {
	private String firstName;
	private String lastName;
	private String dob;
	private long ssn;
	private long taxId;
	private String passportNum;
	private Address address;
	private Phone phone;
	private List<Order> order;
	
	
	
	public Person(String firstName, String lastName, String dob, long ssn, long taxId, String passportNum,
			Address address1, Phone phone, List<Order> order) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.ssn = ssn;
		this.taxId = taxId;
		this.passportNum = passportNum;
		this.address = address1;
		this.phone = phone;
		this.order = order;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getSsn() {
		return ssn;
	}
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	public long getTaxId() {
		return taxId;
	}
	public void setTaxId(long taxId) {
		this.taxId = taxId;
	}
	public String getPassportNum() {
		return passportNum;
	}
	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address1) {
		this.address = address1;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public List<Order> getOrder() {
		return order;
	}
	public void setOrder(List<Order> order) {
		this.order = order;
	}
	
	

}
