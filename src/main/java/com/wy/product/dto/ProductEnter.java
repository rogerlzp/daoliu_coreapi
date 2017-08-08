package com.wy.product.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralEnter;

/**
 *
 */
public class ProductEnter extends GeneralEnter implements Serializable{
	private static final long serialVersionUID = -8167338444742880889L;

	private Integer productId;//产品编号
	private String productStatus;//产品状态
	private String productTotalAmount;//产品总金额
	private String productName;//产品类型
	private String productRaiseEndDate;
	private String productType;//产品类型
	private String relatedBusiness;//业务公司
	    
	public String getRelatedBusiness() {
		return relatedBusiness;
	}
	public void setRelatedBusiness(String relatedBusiness) {
		this.relatedBusiness = relatedBusiness;
	}
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductRaiseEndDate() {
		return productRaiseEndDate;
	}

	public void setProductRaiseEndDate(String productRaiseEndDate) {
		this.productRaiseEndDate = productRaiseEndDate;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

}
