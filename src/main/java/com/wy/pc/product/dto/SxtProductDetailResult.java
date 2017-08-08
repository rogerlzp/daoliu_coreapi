package com.wy.pc.product.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralResult;

public class SxtProductDetailResult extends GeneralResult implements Serializable{

	private static final long serialVersionUID = 7596674823357845487L;
	
	private Integer productId;
    private String productNo;//产品编号
    private String productType;//产品类型
    private String annualIncomeText;//年化收益（显示给用户）@@@@@@@
    private double productRemainAmount;//产品剩余金额
    private double staInvestAmount;//起投金额
    private double buyCount;//购买次数
    private double currentMoney;//万元每日收益
    private double progress;//进度
    private double totalAmount;//累计投资总额
    private double alreadyAmount;//累计获得收益
    
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
	public double getProgress() {
		return progress;
	}
	public void setProgress(double progress) {
		this.progress = progress;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getAlreadyAmount() {
		return alreadyAmount;
	}
	public void setAlreadyAmount(double alreadyAmount) {
		this.alreadyAmount = alreadyAmount;
	}
}
