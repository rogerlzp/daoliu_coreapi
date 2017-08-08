package com.wy.pc.product.dto;

import java.io.Serializable;

public class PcCurrentInOutDetail implements Serializable{

	private static final long serialVersionUID = -1544250056308599148L;
	
	private String orderNo;//订单编号
	private double amount;//金额
	private String orderDate;//处理时间
	private String status;//状态
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
