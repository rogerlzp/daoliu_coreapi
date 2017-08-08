package com.wy.product.dto;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyw on 2015/12/11.
 */
public class Order implements Serializable {

	private static final long serialVersionUID = -5625629499916988660L;
	private long id;
	private String orderNo;// 订单编号
	private String productId;// 产品编号
	private String userId;// 用户编号
	private String productName;// 产品名称
	private double orderAmount;// 订单金额
	private String orderType;// 订单类型
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date orderDate;// 订单时间
	private String cashbackCoupon;// 返现券编号
	private String orderBizStatus;// 活期订单状态 投标中：TBZ；持有中：CYZ；已还款：YHK
	private String orderStatus;// 订单状态 投标中：TBZ；持有中：CYZ；已还款：YHK
	private String orderError;// 订单问题原因
	private Double birdCoin;// 鸟币
	private String handleStatus;// 处理状态
	private short isFirstOrder = 0;
	private String tradeNo;
	private Double paidAmount;

	public String getHandleStatus() {
		return handleStatus;
	}

	public void setHandleStatus(String handleStatus) {
		this.handleStatus = handleStatus;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getCashbackCoupon() {
		return cashbackCoupon;
	}

	public void setCashbackCoupon(String cashbackCoupon) {
		this.cashbackCoupon = cashbackCoupon;
	}

	public String getOrderBizStatus() {
		return orderBizStatus;
	}

	public void setOrderBizStatus(String orderBizStatus) {
		this.orderBizStatus = orderBizStatus;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderError() {
		return orderError;
	}

	public void setOrderError(String orderError) {
		this.orderError = orderError;
	}

	public Double getBirdCoin() {
		return birdCoin;
	}

	public void setBirdCoin(Double birdCoin) {
		this.birdCoin = birdCoin;
	}

	public short getIsFirstOrder() {
		return isFirstOrder;
	}

	public void setIsFirstOrder(short isFirstOrder) {
		this.isFirstOrder = isFirstOrder;
	}

	public Double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(Double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderNo=" + orderNo + ", productId=" + productId + ", userId=" + userId + ", productName="
				+ productName + ", orderAmount=" + orderAmount + ", orderType=" + orderType + ", orderDate=" + orderDate
				+ ", cashbackCoupon=" + cashbackCoupon + ", orderBizStatus=" + orderBizStatus + ", orderStatus=" + orderStatus
				+ ", orderError=" + orderError + ", birdCoin=" + birdCoin + ", handleStatus=" + handleStatus + ", isFirstOrder="
				+ isFirstOrder + ", tradeNo=" + tradeNo + ", paidAmount=" + paidAmount + "]";
	}

}
