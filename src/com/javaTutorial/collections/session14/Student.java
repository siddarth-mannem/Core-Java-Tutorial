 vcdpackage com.javaTutorial.collections.session14;

import java.util.List;

public class Student extends Object {
	
	private String firstName;
	private String lastName;
	private int age;
	private Integer ssn;
	private Integer taxId;
	private String passportNum;
	private Double height;
	private Double weight;

	public Student(String firstName, String lastName, int age, Integer ssn, 
					Integer taxId, String passportNum, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ssn = ssn;
		this.taxId = taxId;
		this.passportNum = passportNum;
		this.height = height;
		this.weight = weight;
		
	}
	
	public Student() {
		
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
	public Double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public void getDetails() {
		System.out.println("In PErson class and in getDEtails() method.");
	}

}
