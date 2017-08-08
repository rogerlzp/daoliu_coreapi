package com.wy.user.dto;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by znz on 2016/01/03.
 */
public class CouponDetail implements Serializable {
	private static final long serialVersionUID = -3354188270302103192L;

	private Integer id;
	private String userId;
	private String couponId;
	private String couponName;
	private double amount;
	private String desc;
	private String status;
	private String couponType;
	@JSONField(format = "yyyy-MM-dd")
	private Date couponDate;
	private Integer duration;//单个标的持续时间要求
	private double limitAmount;
	@JSONField(format = "yyyy-MM-dd")
	private Integer validDateCount;
	@JSONField(format = "yyyy-MM-dd")
	private Date getDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCouponId() {
		return couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCouponType() {
		return couponType;
	}
	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}
	public Date getCouponDate() {
		return couponDate;
	}
	public void setCouponDate(Date couponDate) {
		this.couponDate = couponDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public double getLimitAmount() {
		return limitAmount;
	}
	public void setLimitAmount(double limitAmount) {
		this.limitAmount = limitAmount;
	}
	public Integer getValidDateCount() {
		return validDateCount;
	}
	public void setValidDateCount(Integer validDateCount) {
		this.validDateCount = validDateCount;
	}
	public Date getGetDate() {
		return getDate;
	}
	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}
	
}
