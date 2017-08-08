/**
 * 
 */
package com.wy.user.dto;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author wangdejun
 * 兑换码
 */
public class ExchangeCode implements Serializable{
	private static final long serialVersionUID = 5499193189131799677L;
	private int id;//编号
	private int userId;//用户编号
	private int cashbackCouponId;//券编号
	private String code;//兑换码
	private String isUse;//是否已兑 WD未兑 YD已兑
	private String status;//是否有效 YX有效 WX无效
	private String memo;//备注
	@JSONField(format = "yyyy-MM-dd")
	private Date createDate;//创建时间
	@JSONField(format = "yyyy-MM-dd")
	private Date updateDate;//兑换时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCashbackCouponId() {
		return cashbackCouponId;
	}
	public void setCashbackCouponId(int cashbackCouponId) {
		this.cashbackCouponId = cashbackCouponId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getIsUse() {
		return isUse;
	}
	public void setIsUse(String isUse) {
		this.isUse = isUse;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
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
	
}
