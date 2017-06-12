package com.assignments.session12;


public class Order {
	
	private long orderId;
    private String itemName;
    private long trackingNumber;
    private double price;
    private String orderStatus;
    private String orderedDate;
    private String deliveredDate;
    
	public Order(long orderId, String itemName, long trackingNumber, double price, String orderStatus, String orderedDate,
			String deliveredDate) {
		this.orderId = orderId;
		this.itemName = itemName;
		this.trackingNumber = trackingNumber;
		this.price = price;
		this.orderStatus = orderStatus;
		this.orderedDate = orderedDate;
		this.deliveredDate = deliveredDate;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public long getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(long trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(String orderedDate) {
		this.orderedDate = orderedDate;
	}

	public String getDeliveredDate() {
		return deliveredDate;
	}

	public void setDeliveredDate(String deliveredDate) {
		this.deliveredDate = deliveredDate;
	}
    
    
}
