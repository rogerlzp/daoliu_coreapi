package com.wy.pc.product.dto;

import java.io.Serializable;
import java.util.Date;

public class PcProductRedis implements Serializable{
	private static final long serialVersionUID = -5143755028142084980L;
	
	private int productId;
    private String productNo;//产品编号
    private String productName;//产品名称
    private String productType;//产品类型
    private String productTitle;//产品简介
    private String productTag;//产品标签 @@@@@@@@@@@@
    private int convertDay;//折算天
    private int productDeadline;//产品期限
    private String deadlineUnit;//产品期限单位
    private String annualIncomeText;//年化收益（显示给用户）@@@@@@@
    private double productRemainAmount;//产品剩余金额
    private double staInvestAmount;//起投金额
    private double singleLimitAmount;//单个产品投资上限金额
    private double buyCount;//购买次数
    private String detailsUrl;//项目详情
    private double progress;//进度
    private String productStatus;//产品状态
    private double productTotalAmount;//产品总金额
    private double annualIncome;//年化
    
    private Date createDate;//创建时间
    private Date staRateDate;//起息时间
    private Date raiseEndDate;//募集结束日期
    private String rateCalculateType;//起息方式
    private String repaymentType;//付款方式
    private int multipleRequire;//倍投
    private String relatedBusiness;//业务公司
    
    private long orderresult;//productStatus+(2089536514-createdate) 实现按照  产品状态升序 创建时间降序（不知道redis怎么多条件排序）
	//1+(2089536514-1458384514) = 1631152000 1+(2089536514-1458384554) = 1631151960
	//2+(2089536514-1458384514) = 2631152000 2+(2089536514-1458384554) = 2631151960
    
    
	public String getProductNo() {
		return productNo;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
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
	public int getProductDeadline() {
		return productDeadline;
	}
	public void setProductDeadline(int productDeadline) {
		this.productDeadline = productDeadline;
	}
	public String getDeadlineUnit() {
		return deadlineUnit;
	}
	public void setDeadlineUnit(String deadlineUnit) {
		this.deadlineUnit = deadlineUnit;
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
	public double getSingleLimitAmount() {
		return singleLimitAmount;
	}
	public void setSingleLimitAmount(double singleLimitAmount) {
		this.singleLimitAmount = singleLimitAmount;
	}
	public double getBuyCount() {
		return buyCount;
	}
	public void setBuyCount(double buyCount) {
		this.buyCount = buyCount;
	}
	public String getDetailsUrl() {
		return detailsUrl;
	}
	public void setDetailsUrl(String detailsUrl) {
		this.detailsUrl = detailsUrl;
	}
	public double getProgress() {
		return progress;
	}
	public void setProgress(double progress) {
		this.progress = progress;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
		if(createDate!=null){
			this.orderresult = Long.parseLong(productStatus+""+(2089536514l-this.createDate.getTime()/1000));
		}
	}
	public double getProductTotalAmount() {
		return productTotalAmount;
	}
	public void setProductTotalAmount(double productTotalAmount) {
		this.productTotalAmount = productTotalAmount;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
		if(productStatus!=null){
			this.orderresult = Long.parseLong(productStatus+""+(2089536514l-this.createDate.getTime()/1000));
		}
	}
	public Date getRaiseEndDate() {
		return raiseEndDate;
	}
	public void setRaiseEndDate(Date raiseEndDate) {
		this.raiseEndDate = raiseEndDate;
	}
	public String getRateCalculateType() {
		return rateCalculateType;
	}
	public void setRateCalculateType(String rateCalculateType) {
		this.rateCalculateType = rateCalculateType;
	}
	public String getRepaymentType() {
		return repaymentType;
	}
	public void setRepaymentType(String repaymentType) {
		this.repaymentType = repaymentType;
	}
	public String getRelatedBusiness() {
		return relatedBusiness;
	}
	public void setRelatedBusiness(String relatedBusiness) {
		this.relatedBusiness = relatedBusiness;
	}
	public int getMultipleRequire() {
		return multipleRequire;
	}
	public void setMultipleRequire(int multipleRequire) {
		this.multipleRequire = multipleRequire;
	}
	public long getOrderresult() {
		return orderresult;
	}
	public Date getStaRateDate() {
		return staRateDate;
	}
	public void setStaRateDate(Date staRateDate) {
		this.staRateDate = staRateDate;
	}
	
}
