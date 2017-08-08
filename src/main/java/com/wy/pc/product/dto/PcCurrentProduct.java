package com.wy.pc.product.dto;

import java.io.Serializable;

public class PcCurrentProduct implements Serializable{

	private static final long serialVersionUID = 5441324597579656033L;
	
	private Integer productId;
    private String productNo;//产品编号
    private double totalAmount;//总金额
    private double dayLimitAmount;//每日投资上限
    private String annualIncomeText;//年化收益（显示给用户）@@@@@@@
    private double annualIncome;//年化收益
    private double num;//次数
    private String productStatus;//产品状态
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
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getDayLimitAmount() {
		return dayLimitAmount;
	}
	public void setDayLimitAmount(double dayLimitAmount) {
		this.dayLimitAmount = dayLimitAmount;
	}
	public String getAnnualIncomeText() {
		return annualIncomeText;
	}
	public void setAnnualIncomeText(String annualIncomeText) {
		this.annualIncomeText = annualIncomeText;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public double getNum() {
		return num;
	}
	public void setNum(double num) {
		this.num = num;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
}
