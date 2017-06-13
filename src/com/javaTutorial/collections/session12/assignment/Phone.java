package com.assignments.session12;

public class Phone {
	
	private long number;
	private String maker;
	private String model;
	private int areaCode;
	private String type;
	private boolean vr;
	private double size;
	
	public Phone(long number, String maker, String model, int areaCode, String type, boolean vr, double size) {
		this.number = number;
		this.maker = maker;
		this.model = model;
		this.areaCode = areaCode;
		this.type = type;
		this.vr = vr;
		this.size = size;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isVr() {
		return vr;
	}

	public void setVr(boolean vr) {
		this.vr = vr;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	
	
	
}
