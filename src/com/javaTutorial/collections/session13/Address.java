package com.javaTutorial.collections.session13;

public class Address {
	
	private Integer addr_id;
	private String addr_line1;
	private String addr_line2;
	private String city;
	private String state;
	private Integer zip;
	
	public Address(Integer addr_id, String addr_line1, String addr_line2, String city, String state, Integer zip) {
		super();
		this.addr_id = addr_id;
		this.addr_line1 = addr_line1;
		this.addr_line2 = addr_line2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	/**
	 * @return the addr_id
	 */
	public Integer getAddr_id() {
		return addr_id;
	}
	/**
	 * @param addr_id the addr_id to set
	 */
	public void setAddr_id(Integer addr_id) {
		this.addr_id = addr_id;
	}
	/**
	 * @return the addr_line1
	 */
	public String getAddr_line1() {
		return addr_line1;
	}
	/**
	 * @param addr_line1 the addr_line1 to set
	 */
	public void setAddr_line1(String addr_line1) {
		this.addr_line1 = addr_line1;
	}
	/**
	 * @return the addr_line2
	 */
	public String getAddr_line2() {
		return addr_line2;
	}
	/**
	 * @param addr_line2 the addr_line2 to set
	 */
	public void setAddr_line2(String addr_line2) {
		this.addr_line2 = addr_line2;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zip
	 */
	public Integer getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(Integer zip) {
		this.zip = zip;
	}
	
	
	

}
