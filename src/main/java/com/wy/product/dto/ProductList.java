package com.wy.product.dto;

import java.io.Serializable;

public class ProductList implements Serializable{

	private static final long serialVersionUID = -592569973476541059L;
	
	private String id;
    private String productNo;//产品编号
    private String productName;//产品名称
    private String productType;//产品类型
    private String productTitle;//产品简介
    private String productTag;//产品标签 @@@@@@@@@@@@
    private String productDeadline;//产品期限
    private String deadlineUnit;//产品期限单位
    private String productStatus;//产品状态 
    private String productTotalAmount;//产品总金额
    private String productReainAmount;//产品剩余金额
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getProductDeadline() {
		return productDeadline;
	}
	public void setProductDeadline(String productDeadline) {
		this.productDeadline = productDeadline;
	}
	public String getDeadlineUnit() {
		return deadlineUnit;
	}
	public void setDeadlineUnit(String deadlineUnit) {
		this.deadlineUnit = deadlineUnit;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public String getProductTotalAmount() {
		return productTotalAmount;
	}
	public void setProductTotalAmount(String productTotalAmount) {
		this.productTotalAmount = productTotalAmount;
	}
	public String getProductReainAmount() {
		return productReainAmount;
	}
	public void setProductReainAmount(String productReainAmount) {
		this.productReainAmount = productReainAmount;
	}
}
