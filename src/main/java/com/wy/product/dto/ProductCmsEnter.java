package com.wy.product.dto;

import java.io.Serializable;

public class ProductCmsEnter implements Serializable{

	private static final long serialVersionUID = -6511430330342600512L;
	private String id;//productId
	private String ids;//productDetailId
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
    private String multipleRequire;//投资倍数要求
    private String auctionDate;//结标日期
    private String scopeOfBid;//投标范围
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
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
	public String getScopeOfBid() {
		return scopeOfBid;
	}
	public void setScopeOfBid(String scopeOfBid) {
		this.scopeOfBid = scopeOfBid;
	}
	public String getProductSubtype() {
		return productSubtype;
	}
	public void setProductSubtype(String productSubtype) {
		this.productSubtype = productSubtype;
	}
}
