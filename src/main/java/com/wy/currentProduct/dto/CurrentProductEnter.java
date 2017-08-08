package com.wy.currentProduct.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralEnter;

/**
 *
 */
public class CurrentProductEnter extends GeneralEnter implements Serializable{

	private static final long serialVersionUID = -7632726226631889587L;
	private long userId;
	private Integer currentProductId;
	private String productNo;//产品编号
	private double totalAmount;//总额
	private String dayLimitAmount;//每日限额
	private String annualIncome;//年化利率
    private String annualIncomeText;//年化利率
    private String status;//状态
	private String createDate;//创建时间
	private String updateDate;//更新时间
	private String productStatus;//标的发布状态 
    
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	} 
	public Integer getCurrentProductId() {
		return currentProductId;
	}
	public void setCurrentProductId(Integer currentProductId) {
		this.currentProductId = currentProductId;
	}
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getDayLimitAmount() {
		return dayLimitAmount;
	}
	public void setDayLimitAmount(String dayLimitAmount) {
		this.dayLimitAmount = dayLimitAmount;
	}
	public String getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getAnnualIncomeText() {
		return annualIncomeText;
	}
	public void setAnnualIncomeText(String annualIncomeText) {
		this.annualIncomeText = annualIncomeText;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	
}
