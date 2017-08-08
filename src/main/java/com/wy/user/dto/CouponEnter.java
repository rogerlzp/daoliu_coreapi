package com.wy.user.dto;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.wy.common.model.GeneralEnter;

public class CouponEnter  extends GeneralEnter implements Serializable {
	/**
	 */
	private static final long serialVersionUID = -5234940643698752168L;
	private long userId;
	private String couponId;
	private String couponName;
	private double amount;
	private String desc;
	private String status;
	private String couponType;
	private Date couponDate;


	private Integer cashbackCouponId;//
	private String cashbackCouponName;//
	private String denomination;//
	private String activityType;//
	private String remark;//
	//private String status;//
	private String type;//
	private Integer duration;//单个标的持续时间要求
	private double limitAmount;//
	private String startDate;
	private String endDate;
	private Integer validDate;//
	private String createDate;
	private String updateDate;//
	private String createBy;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
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

	public Integer getCashbackCouponId() {
		return cashbackCouponId;
	}

	public void setCashbackCouponId(Integer cashbackCouponId) {
		this.cashbackCouponId = cashbackCouponId;
	}

	public String getCashbackCouponName() {
		return cashbackCouponName;
	}

	public void setCashbackCouponName(String cashbackCouponName) {
		this.cashbackCouponName = cashbackCouponName;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Integer getValidDate() {
		return validDate;
	}

	public void setValidDate(Integer validDate) {
		this.validDate = validDate;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
}
