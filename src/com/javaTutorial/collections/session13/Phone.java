package com.javaTutorial.collections.session13;

public class Phone {

	String model;
	double size;
	double weight;
	String maker;
	long number;
	boolean vr; //  Check if Phone has Virtual reality feature build in it. 
	String[] simCards;
	
	public Phone(String model, double size, double weight, String maker, long number, boolean vr, String[] simCards) {
		super();
		this.model = model;
		this.size = size;
		this.weight = weight;
		this.maker = maker;
		this.number = number;
		this.vr = vr;
		this.simCards = simCards;
	}

	//Defualt Constructor
	public Phone() {
		System.out.println("Hello We are in the Phone COnstructor");
	}
	
	//Customer constructor
	public Phone(String model, double size, String maker, double weight, long number, boolean vr) {
		
		System.out.println("In Phone custom Constructor");
		
		this.model = model;
		this.size = size;
		this.maker = maker;
		this.weight = weight;
		this.number = number;
		this.vr = vr;
		
	}
	
	
	/**
	 * @return the simCards
	 */
	public String[] getSimCards() {
		return simCards;
	}
	/**
	 * @param simCards the simCards to set
	 */
	public void setSimCards(String[] simCards) {
		this.simCards = simCards;
	}
	
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		this.size = size;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * @return the maker
	 */
	public String getMaker() {
		return maker;
	}
	/**
	 * @param maker the maker to set
	 */
	public void setMaker(String maker) {
		this.maker = maker;
	}
	/**
	 * @return the number
	 */
	public long getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(long number) {
		this.number = number;
	}
	/**
	 * @return the vr
	 */
	public boolean isVr() {
		return vr;
	}
	/**
	 * @param vr the vr to set
	 */
	public void setVr(boolean vr) {
		this.vr = vr;
	}

	
	public void call() {
		System.out.println("You phone makes cellular calls");
	}
	public void sendSms() {
		System.out.println("Your phone can send SMS");
	}
	public void takePictures() {
		System.out.println("Your phone can take good pictures");
	}
}
