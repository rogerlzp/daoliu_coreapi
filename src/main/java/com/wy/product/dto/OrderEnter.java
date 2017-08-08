package com.wy.product.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyw on 2015/12/11.
 */
public class OrderEnter extends GeneralEnter implements Serializable {

	private static final long serialVersionUID = -3305506019033138329L;
	private int productId;
	private String productNo;// 产品编号
	private Double orderAmount;// 订单金额
	private String orderType;// 订单类型
	private Date orderDate;// 订单时间
	private long cashbackCoupon;// 返现券编号
	private Long userCouponId;// 用户返现去关联表（TT_USER_COUPON）ID
	private Double birdCoin = 0D;// 鸟币

	private String metaHtml;// 联动传过来的全部数据
	private String sourceV;// 来源

	private double paidAmount;

	private Double couponDenomination = 0d;

	private int isSignNoPwdPay = 1;

	public Long getUserCouponId() {
		return userCouponId;
	}

	public void setUserCouponId(Long userCouponId) {
		this.userCouponId = userCouponId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getMetaHtml() {
		return metaHtml;
	}

	public void setMetaHtml(String metaHtml) {
		this.metaHtml = metaHtml;
	}

	public String getSourceV() {
		return sourceV;
	}

	public void setSourceV(String sourceV) {
		this.sourceV = sourceV;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
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

	public long getCashbackCoupon() {
		return cashbackCoupon;
	}

	public void setCashbackCoupon(long cashbackCoupon) {
		this.cashbackCoupon = cashbackCoupon;
	}

	public Double getBirdCoin() {
		return birdCoin;
	}

	public void setBirdCoin(Double birdCoin) {
		this.birdCoin = birdCoin;
	}

	public double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public Double getCouponDenomination() {
		return couponDenomination;
	}

	public void setCouponDenomination(Double couponDenomination) {
		this.couponDenomination = couponDenomination;
	}

	public int getIsSignNoPwdPay() {
		return isSignNoPwdPay;
	}

	public void setIsSignNoPwdPay(int isSignNoPwdPay) {
		this.isSignNoPwdPay = isSignNoPwdPay;
	}

	@Override
	public String toString() {
		return "OrderEnter [productId=" + productId + ", productNo=" + productNo + ", orderAmount=" + orderAmount + ", orderType="
				+ orderType + ", orderDate=" + orderDate + ", cashbackCoupon=" + cashbackCoupon + ", userCouponId=" + userCouponId
				+ ", birdCoin=" + birdCoin + ", metaHtml=" + metaHtml + ", sourceV=" + sourceV + ", paidAmount=" + paidAmount
				+ ", couponDenomination=" + couponDenomination + "]";
	}

}
