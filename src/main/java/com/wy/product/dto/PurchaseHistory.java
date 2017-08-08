package com.wy.product.dto;

import java.io.Serializable;

public class PurchaseHistory implements Serializable{


	private static final long serialVersionUID = -4523211413817548803L;
	private String userName;
	private String orderAmount;
	private String orderDate;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
}
