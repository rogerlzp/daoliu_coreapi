package com.wy.user.dto;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class CouponList implements Serializable{

	private static final long serialVersionUID = 5161937959114604410L;
	private Integer cashbackCouponId;//
	private String cashbackCouponName;//
	private String denomination;//
	private String activityType;//
	private String remark;//
	private String status;//
	private String type;//
	private Integer duration;//单个标的持续时间要求
	private double limitAmount;//
	@JSONField(format = "yyyy-MM-dd")
	private Date startDate;
	@JSONField(format = "yyyy-MM-dd")
	private Date endDate;
	private Integer validDate;//
	@JSONField(format = "yyyy-MM-dd")
	private Date createDate;
	@JSONField(format = "yyyy-MM-dd")
	private Date updateDate;//
	private String createBy;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Integer getValidDate() {
		return validDate;
	}

	public void setValidDate(Integer validDate) {
		this.validDate = validDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
}
