package com.wy.product.dto;

import java.io.Serializable;

/**
 * Created by liuyw on 2015/12/2.
 */
public class ProductDetailCms implements Serializable {

    private static final long serialVersionUID = -6123339805099057207L;
    
    private int id;
    private String productNo;//产品编号
    private String productTitle;//产品简介
    private String productRemark;//产品说明
    private String productProtect;//产品协议
    private String supportType;//保障方式
    private String investDeadLine;//投资期限
    private String accountDate;//到账时间
    private String coveredArea;//建筑面积
    private String markedValue;//市场价值
    private String position;//所处位置
    private String rightProperty;//产权性质
    private String borrowerName;//借款人姓名
    private String borrowerSex;//借款人性别
    private String borrowerMarriage;//借款人婚姻
    private String riskControlProject;//风控审核项目
    private String scopeOfBid;//标的范围
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getProductTitle() {
		return productTitle;
	}
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}
	public String getProductRemark() {
		return productRemark;
	}
	public void setProductRemark(String productRemark) {
		this.productRemark = productRemark;
	}
	public String getProductProtect() {
		return productProtect;
	}
	public void setProductProtect(String productProtect) {
		this.productProtect = productProtect;
	}
	public String getSupportType() {
		return supportType;
	}
	public void setSupportType(String supportType) {
		this.supportType = supportType;
	}
	public String getInvestDeadLine() {
		return investDeadLine;
	}
	public void setInvestDeadLine(String investDeadLine) {
		this.investDeadLine = investDeadLine;
	}
	public String getAccountDate() {
		return accountDate;
	}
	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}
	public String getCoveredArea() {
		return coveredArea;
	}
	public void setCoveredArea(String coveredArea) {
		this.coveredArea = coveredArea;
	}
	public String getMarkedValue() {
		return markedValue;
	}
	public void setMarkedValue(String markedValue) {
		this.markedValue = markedValue;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getRightProperty() {
		return rightProperty;
	}
	public void setRightProperty(String rightProperty) {
		this.rightProperty = rightProperty;
	}
	public String getBorrowerName() {
		return borrowerName;
	}
	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}
	public String getBorrowerSex() {
		return borrowerSex;
	}
	public void setBorrowerSex(String borrowerSex) {
		this.borrowerSex = borrowerSex;
	}
	public String getBorrowerMarriage() {
		return borrowerMarriage;
	}
	public void setBorrowerMarriage(String borrowerMarriage) {
		this.borrowerMarriage = borrowerMarriage;
	}
	public String getRiskControlProject() {
		return riskControlProject;
	}
	public void setRiskControlProject(String riskControlProject) {
		this.riskControlProject = riskControlProject;
	}
	public String getScopeOfBid() {
		return scopeOfBid;
	}
	public void setScopeOfBid(String scopeOfBid) {
		this.scopeOfBid = scopeOfBid;
	}
}
