package com.wy.pc.product.dto;

import java.io.Serializable;


public class IndexProduct implements Serializable{

	private static final long serialVersionUID = 6166515532428076714L;
	
	private Integer productId;
    private String productNo;//产品编号
    private String productName;//产品名称
    private String productType;//产品类型
    private String productTitle;//产品简介
    private String productTag;//产品标签 @@@@@@@@@@@@
    private int convertDay;//折算天
    private String annualIncomeText;//年化收益（显示给用户）@@@@@@@
    private double annualIncome;//年化收益
    private double productTotalAmount;//产品总金额
    private double productRemainAmount;//产品剩余金额
    private double staInvestAmount;//起投金额 
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
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductTitle() {
		return productTitle;
	}
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}
	public String getProductTag() {
		return productTag;
	}
	public void setProductTag(String productTag) {
		this.productTag = productTag;
	}
	public int getConvertDay() {
		return convertDay;
	}
	public void setConvertDay(int convertDay) {
		this.convertDay = convertDay;
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
	public double getProductTotalAmount() {
		return productTotalAmount;
	}
	public void setProductTotalAmount(double productTotalAmount) {
		this.productTotalAmount = productTotalAmount;
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
