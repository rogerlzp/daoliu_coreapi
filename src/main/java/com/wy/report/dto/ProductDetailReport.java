package com.wy.report.dto;

import java.util.Date;

import com.wy.common.constants.ProductStatusEnum;

public class ProductDetailReport {
	
	private String productName;
	//标的编号
	private String productNo;
	//发布时间
	private String publishedDate;
	//募集结束时间
	private String raiseDate;
	//起息日期
	private Date staRateDate;
	//投资期限(天)
	private String productDeadLine;
	//标的金额（万）
	private Double productAmount;
	//年化收益率
	private String annualIncomeText;
	//产品剩余可投金额 
	private Double productRemainAmount;
	//标的状态 -1：草稿、0：开标、1：投标中、2：还款中、3：已还款、4：结束（前提条件：余额为0） 
	private String productStatus;
	//折算天
	private Integer convertDay;
	//满标日期
	private String overBidDate;
	//结息时间
	private String auctionDate;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getRaiseDate() {
		return raiseDate;
	}
	public void setRaiseDate(String raiseDate) {
		this.raiseDate = raiseDate;
	}
	public Date getStaRateDate() {
		return staRateDate;
	}
	public void setStaRateDate(Date staRateDate) {
		this.staRateDate = staRateDate;
	}
	public String getProductDeadLine() {
		return productDeadLine;
	}
	public void setProductDeadLine(String productDeadLine) {
		this.productDeadLine = productDeadLine;
	}
	public Double getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(Double productAmount) {
		this.productAmount = productAmount;
	}
	public String getAnnualIncomeText() {
		return annualIncomeText;
	}
	public void setAnnualIncomeText(String annualIncomeText) {
		this.annualIncomeText = annualIncomeText;
	}
	public Double getProductRemainAmount() {
		return productRemainAmount;
	}
	public void setProductRemainAmount(Double productRemainAmount) {
		this.productRemainAmount = productRemainAmount;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		if (ProductStatusEnum.PRODUCT_STATUS_CG.getEnName().equalsIgnoreCase(productStatus)) {
			productStatus = ProductStatusEnum.PRODUCT_STATUS_CG.getZhName();
		} else if (ProductStatusEnum.PRODUCT_STATUS_KB.getEnName().equalsIgnoreCase(productStatus)) {
			productStatus = ProductStatusEnum.PRODUCT_STATUS_KB.getZhName();
		} else if (ProductStatusEnum.PRODUCT_STATUS_TBZ.getEnName().equalsIgnoreCase(productStatus)) {
			productStatus = ProductStatusEnum.PRODUCT_STATUS_TBZ.getZhName();
		} else if (ProductStatusEnum.PRODUCT_STATUS_HKZ.getEnName().equalsIgnoreCase(productStatus)) {
			productStatus = ProductStatusEnum.PRODUCT_STATUS_HKZ.getZhName();
		} else if (ProductStatusEnum.PRODUCT_STATUS_YHK.getEnName().equalsIgnoreCase(productStatus)) {
			productStatus = ProductStatusEnum.PRODUCT_STATUS_YHK.getZhName();
		} else if (ProductStatusEnum.PRODUCT_STATUS_JS.getEnName().equalsIgnoreCase(productStatus)) {
			productStatus = ProductStatusEnum.PRODUCT_STATUS_JS.getZhName();
		} else if (ProductStatusEnum.PRODUCT_STATUS_LB.getEnName().equalsIgnoreCase(productStatus)) {
			productStatus = ProductStatusEnum.PRODUCT_STATUS_LB.getZhName();
		}
		this.productStatus = productStatus;
	}
	public Integer getConvertDay() {
		return convertDay;
	}
	public void setConvertDay(Integer convertDay) {
		this.convertDay = convertDay;
	}

	public String getOverBidDate() {
		return overBidDate;
	}

	public void setOverBidDate(String overBidDate) {
		this.overBidDate = overBidDate;
	}

	public String getAuctionDate() {
		return auctionDate;
	}

	public void setAuctionDate(String auctionDate) {
		this.auctionDate = auctionDate;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
}
