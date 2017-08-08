package com.wy.product.dto;

import java.io.Serializable;
import java.util.List;

import com.wy.common.model.GeneralResult;
import com.wy.user.dto.Coupon;

/**
 * Created by liuyw on 2015/12/11.
 */
public class OrderResult extends GeneralResult implements Serializable {
	private static final long serialVersionUID = -3589113370809171414L;
	private String sign;// 签名
	private String plain;//
	private String url;//
	private double birdCoin;
	private List<Coupon> coupons;
	private String productExpireDate;
	private double revenue;
	private String productType;

	private String orderNo;

	private String dtUrl;

	public static final int PAY_TYPE_DEFAULT = 0;
	public static final int PAY_TYPE_NO_PWD = 1;
	private int payType = PAY_TYPE_DEFAULT;

	private Double orderAmount;

	private boolean hasGoldenEgg;

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getPlain() {
		return plain;
	}

	public void setPlain(String plain) {
		this.plain = plain;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public double getBirdCoin() {
		return birdCoin;
	}

	public void setBirdCoin(double birdCoin) {
		this.birdCoin = birdCoin;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getProductExpireDate() {
		return productExpireDate;
	}

	public void setProductExpireDate(String productExpireDate) {
		this.productExpireDate = productExpireDate;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getPayType() {
		return payType;
	}

	public void setPayType(int payType) {
		this.payType = payType;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public boolean isHasGoldenEgg() {
		return hasGoldenEgg;
	}

	public void setHasGoldenEgg(boolean hasGoldenEgg) {
		this.hasGoldenEgg = hasGoldenEgg;
	}

	public String getDtUrl() {
		return dtUrl;
	}

	public void setDtUrl(String dtUrl) {
		this.dtUrl = dtUrl;
	}

}
