package com.wy.user.dto;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Ciro on 2015/12/11.
 */
public class Coupon implements Serializable {
	private static final long serialVersionUID = 420482948145092798L;
	/**
	 * @Fields serialVersionUID : TODO
	 */
	private Integer id;
	private String userCouponId;
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

	private Integer cashbackCouponId;//
	private String cashbackCouponName;//
	private String denomination;//
	private String activityType;//
	private String remark;//
	//private String status;//
	private String type;//
	//	private Integer duration;//单个标的持续时间要求
//	private double limitAmount;//
	private String startDate;
	private String endDate;
	private String createBy;

	private String couponTypeDes;

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Integer getValidDate() {
		return validDate;
	}

	public void setValidDate(Integer validDate) {
		this.validDate = validDate;
	}

	private Integer validDate;//
	@JSONField(format = "yyyy-MM-dd")
	private Date createDate;
	@JSONField(format = "yyyy-MM-dd")
	private Date updateDate;//


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUserCouponId() {
		return userCouponId;
	}

	public void setUserCouponId(String userCouponId) {
		this.userCouponId = userCouponId;
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

	public String getCouponTypeDes() {
		return couponTypeDes;
	}

	public void setCouponTypeDes(String couponTypeDes) {
		this.couponTypeDes = couponTypeDes;
	}
}