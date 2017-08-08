package com.wy.product.dto;

import java.io.Serializable;
import java.util.List;

public class OrderEarningsList implements Serializable{
	
	private static final long serialVersionUID = -4872145338407915370L;
	
	private List<OrderEarnings> orderEarningsList;

	public List<OrderEarnings> getOrderEarningsList() {
		return orderEarningsList;
	}

	public void setOrderEarningsList(List<OrderEarnings> orderEarningsList) {
		this.orderEarningsList = orderEarningsList;
	}
	
	
}
