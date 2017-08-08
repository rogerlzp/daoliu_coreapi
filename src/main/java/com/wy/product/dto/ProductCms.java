package com.wy.product.dto;


import java.io.Serializable;

/**
 * Created by liuyw on 2015/12/2.
 */
public class ProductCms implements Serializable {
	
	private static final long serialVersionUID = -3794897436486612880L;
	
	private int Id;
	private String productId;
    private String productNo;//产品编号
    private String productName;//产品名称
    private String productType;//产品类型
    private String productTitle;//产品简介
    private String productTag;//产品标签 @@@@@@@@@@@@
    private String productDeadline;//产品期限
    private String deadlineUnit;//产品期限单位
    private String convertDay;//折算天
    private String annualIncomeText;//年化收益（显示给用户）@@@@@@@
    private String annualIncome;//年化收益
    private String productTotalAmount;//产品总金额
    private String productRemainAmount;//产品剩余金额
    private String staInvestAmount;//起投金额
    private String singleLimitAmount;//单个产品投资上限金额
    private String repaymentType;//还款方式
    private String staRateDate;//起息日期
    private String rateCalculateType;//起息计算方式
    private String productStatus;//产品状态
    private String isArrange;//是否可预约 @@@@@@
    private String arrangeDate;//是否可预约 @@@@@@
    private String raiseEndDate;//募集结束时间
    private String bidPublishDate;//标的发布时间
    private String overBidDate;//满标时间
    private String offBidDate;//流标时间
    private String orderNo;//排序号
    private String isFisrtPage;//是否首页推荐 @@@@@@
    private String createDate;//创建时间
    private String createBy;//创建人
    private String buyCount;//购买次数
    private String multipleRequire;//投资倍数要求
    private String auctionDate;//结标日期
    private String relatedBusiness;//业务公司
    private String productSubtype;//产品子类型
    private String repayment_rate;//还款利率
    
    
   	public String getRepayment_rate() {
		return repayment_rate;
	}
	public void setRepayment_rate(String repayment_rate) {
		this.repayment_rate = repayment_rate;
	}
   	public String getRelatedBusiness() {
   		return relatedBusiness;
   	}
   	public void setRelatedBusiness(String relatedBusiness) {
   		this.relatedBusiness = relatedBusiness;
   	}
    public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
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
	public String getConvertDay() {
		return convertDay;
	}
	public void setConvertDay(String convertDay) {
		this.convertDay = convertDay;
	}
	public String getAnnualIncomeText() {
		return annualIncomeText;
	}
	public void setAnnualIncomeText(String annualIncomeText) {
		this.annualIncomeText = annualIncomeText;
	}
	public String getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getProductTotalAmount() {
		return productTotalAmount;
	}
	public void setProductTotalAmount(String productTotalAmount) {
		this.productTotalAmount = productTotalAmount;
	}
	public String getProductRemainAmount() {
		return productRemainAmount;
	}
	public void setProductRemainAmount(String productRemainAmount) {
		this.productRemainAmount = productRemainAmount;
	}
	public String getStaInvestAmount() {
		return staInvestAmount;
	}
	public void setStaInvestAmount(String staInvestAmount) {
		this.staInvestAmount = staInvestAmount;
	}
	public String getSingleLimitAmount() {
		return singleLimitAmount;
	}
	public void setSingleLimitAmount(String singleLimitAmount) {
		this.singleLimitAmount = singleLimitAmount;
	}
	public String getRepaymentType() {
		return repaymentType;
	}
	public void setRepaymentType(String repaymentType) {
		this.repaymentType = repaymentType;
	}
	public String getStaRateDate() {
		return staRateDate;
	}
	public void setStaRateDate(String staRateDate) {
		this.staRateDate = staRateDate;
	}
	public String getRateCalculateType() {
		return rateCalculateType;
	}
	public void setRateCalculateType(String rateCalculateType) {
		this.rateCalculateType = rateCalculateType;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public String getIsArrange() {
		return isArrange;
	}
	public void setIsArrange(String isArrange) {
		this.isArrange = isArrange;
	}
	public String getArrangeDate() {
		return arrangeDate;
	}
	public void setArrangeDate(String arrangeDate) {
		this.arrangeDate = arrangeDate;
	}
	public String getRaiseEndDate() {
		return raiseEndDate;
	}
	public void setRaiseEndDate(String raiseEndDate) {
		this.raiseEndDate = raiseEndDate;
	}
	public String getBidPublishDate() {
		return bidPublishDate;
	}
	public void setBidPublishDate(String bidPublishDate) {
		this.bidPublishDate = bidPublishDate;
	}
	public String getOverBidDate() {
		return overBidDate;
	}
	public void setOverBidDate(String overBidDate) {
		this.overBidDate = overBidDate;
	}
	public String getOffBidDate() {
		return offBidDate;
	}
	public void setOffBidDate(String offBidDate) {
		this.offBidDate = offBidDate;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getIsFisrtPage() {
		return isFisrtPage;
	}
	public void setIsFisrtPage(String isFisrtPage) {
		this.isFisrtPage = isFisrtPage;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getBuyCount() {
		return buyCount;
	}
	public void setBuyCount(String buyCount) {
		this.buyCount = buyCount;
	}
	public String getMultipleRequire() {
		return multipleRequire;
	}
	public void setMultipleRequire(String multipleRequire) {
		this.multipleRequire = multipleRequire;
	}
	public String getAuctionDate() {
		return auctionDate;
	}
	public void setAuctionDate(String auctionDate) {
		this.auctionDate = auctionDate;
	}
	public String getProductSubtype() {
		return productSubtype;
	}
	public void setProductSubtype(String productSubtype) {
		this.productSubtype = productSubtype;
	}
}
