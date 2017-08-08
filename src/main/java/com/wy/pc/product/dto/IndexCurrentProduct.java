package com.wy.pc.product.dto;

import java.io.Serializable;

public class IndexCurrentProduct implements Serializable{

	private static final long serialVersionUID = -4775442415258139131L;
	
	private Integer productId;
    private String productNo;//产品编号
    private String productType;//产品类型
    private String annualIncomeText;//年化收益（显示给用户）@@@@@@@
    private double productRemainAmount;//产品剩余金额
    private double staInvestAmount;//起投金额
    private double buyCount;//购买次数
    private double currentMoney;//万元每日收益
    private String isYX;//是否当日可投
    
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getAnnualIncomeText() {
		return annualIncomeText;
	}
	public void setAnnualIncomeText(String annualIncomeText) {
		this.annualIncomeText = annualIncomeText;
	}
	public double getProductRemainAmount() {
		return productRemainAmount;
	}
	public void setProductRemainAmount(double productRemainAmount) {
		this.productRemainAmount = productRemainAmount;
	}
	public double getStaInvestAmount() {
		return staInvestAmount;
	}
	public void setStaInvestAmount(double staInvestAmount) {
		this.staInvestAmount = staInvestAmount;
	}
	public double getBuyCount() {
		return buyCount;
	}
	public void setBuyCount(double buyCount) {
		this.buyCount = buyCount;
	}
	public double getCurrentMoney() {
		return currentMoney;
	}
	public void setCurrentMoney(double currentMoney) {
		this.currentMoney = currentMoney;
	}
	public String getIsYX() {
		return isYX;
	}
	public void setIsYX(String isYX) {
		this.isYX = isYX;
	}
}
