package com.wy.product.dto;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyw on 2015/12/2.
 */
public class Product implements Serializable {


    private static final long serialVersionUID = 8046006351312454910L;
    private Integer productId;
    private String productNo;//产品编号
    private String productName;//产品名称
    private String productType;//产品类型
    private String productTitle;//产品简介
    private String productTag;//产品标签 @@@@@@@@@@@@
    private int productDeadline;//产品期限
    private String deadlineUnit;//产品期限单位
    private int convertDay;//折算天
    private String annualIncomeText;//年化收益（显示给用户）@@@@@@@
    private double annualIncome;//年化收益
    private double productTotalAmount;//产品总金额
    private double productRemainAmount;//产品剩余金额
    private double staInvestAmount;//起投金额
    private double singleLimitAmount;//单个产品投资上限金额
    private String repaymentType;//还款方式
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date staRateDate;//起息日期
    private String rateCalculateType;//起息计算方式
    private String productStatus;//产品状态-状态
    private String productStatusText;//产品状态-中文
    private String isArrange;//是否可预约 @@@@@@
    private String arrangeDate;//是否可预约 @@@@@@
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date raiseEndDate;//募集结束时间
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date bidPublishDate;//标的发布时间
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date overBidDate;//满标时间
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date offBidDate;//流标时间
    private int orderNo;//排序号
    private int isFisrtPage;//是否首页推荐 @@@@@@
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;//创建时间
    private String createBy;//创建人
    private String buyCount;//购买次数
    private String buyPersonCount;//购买次数 wangdejun
    private String detailsUrl;//项目详情
    private int multipleTequire;//倍投
    
    private String relatedBusiness;//业务公司
    
   	public String getRelatedBusiness() {
   		return relatedBusiness;
   	}
   	public void setRelatedBusiness(String relatedBusiness) {
   		this.relatedBusiness = relatedBusiness;
   	}
    
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date auctionDate;//结标日期
    
    private String scopeOfBid;//投标范围
    public String getProductStatusText() {
        return productStatusText;
    }

    public void setProductStatusText(String productStatusText) {
        this.productStatusText = productStatusText;
    }

    public String getDetailsUrl() {
        return detailsUrl;
    }

    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
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

    public String getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(String buyCount) {
        this.buyCount = buyCount;
    }

    public String getProductTag() {
        return productTag;
    }

    public void setProductTag(String productTag) {
        this.productTag = productTag;
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

    public int getIsFisrtPage() {
        return isFisrtPage;
    }

    public void setIsFisrtPage(int isFisrtPage) {
        this.isFisrtPage = isFisrtPage;
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

    public int getConvertDay() {
        return convertDay;
    }

    public void setConvertDay(int convertDay) {
        this.convertDay = convertDay;
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

    public String getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
    }

    public Date getStaRateDate() {
        return staRateDate;
    }

    public void setStaRateDate(Date staRateDate) {
        this.staRateDate = staRateDate;
    }

    public String getRateCalculateType() {
        return rateCalculateType;
    }

    public void setRateCalculateType(String rateCalculateType) {
        this.rateCalculateType = rateCalculateType;
    }

    public Date getRaiseEndDate() {
        return raiseEndDate;
    }

    public void setRaiseEndDate(Date raiseEndDate) {
        this.raiseEndDate = raiseEndDate;
    }

    public Date getBidPublishDate() {
        return bidPublishDate;
    }

    public void setBidPublishDate(Date bidPublishDate) {
        this.bidPublishDate = bidPublishDate;
    }

    public Date getOverBidDate() {
        return overBidDate;
    }

    public void setOverBidDate(Date overBidDate) {
        this.overBidDate = overBidDate;
    }

    public Date getOffBidDate() {
        return offBidDate;
    }

    public void setOffBidDate(Date offBidDate) {
        this.offBidDate = offBidDate;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

	public int getMultipleTequire() {
		return multipleTequire;
	}

	public void setMultipleTequire(int multipleTequire) {
		this.multipleTequire = multipleTequire;
	}

	public Date getAuctionDate() {
		return auctionDate;
	}

	public void setAuctionDate(Date auctionDate) {
		this.auctionDate = auctionDate;
	}

	public String getScopeOfBid() {
		return scopeOfBid;
	}

	public void setScopeOfBid(String scopeOfBid) {
		this.scopeOfBid = scopeOfBid;
	}
	
	@Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productNo='" + productNo + '\'' +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", productTitle='" + productTitle + '\'' +
                ", productTag='" + productTag + '\'' +
                ", productDeadline=" + productDeadline +
                ", deadlineUnit='" + deadlineUnit + '\'' +
                ", convertDay=" + convertDay +
                ", annualIncomeText='" + annualIncomeText + '\'' +
                ", annualIncome=" + annualIncome +
                ", productTotalAmount=" + productTotalAmount +
                ", productRemainAmount=" + productRemainAmount +
                ", staInvestAmount=" + staInvestAmount +
                ", singleLimitAmount=" + singleLimitAmount +
                ", repaymentType='" + repaymentType + '\'' +
                ", staRateDate=" + staRateDate +
                ", rateCalculateType='" + rateCalculateType + '\'' +
                ", productStatus='" + productStatus + '\'' +
                ", productStatusText='" + productStatusText + '\'' +
                ", isArrange='" + isArrange + '\'' +
                ", arrangeDate='" + arrangeDate + '\'' +
                ", raiseEndDate=" + raiseEndDate +
                ", bidPublishDate=" + bidPublishDate +
                ", overBidDate=" + overBidDate +
                ", offBidDate=" + offBidDate +
                ", orderNo=" + orderNo +
                ", isFisrtPage=" + isFisrtPage +
                ", createDate=" + createDate +
                ", createBy='" + createBy + '\'' +
                ", buyCount='" + buyCount + '\'' +
                ", detailsUrl='" + detailsUrl + '\'' +
                ", multipleTequire=" + multipleTequire +
                ", auctionDate=" + auctionDate +
                ", scopeOfBid=" + scopeOfBid +
                '}';
    }
	public String getBuyPersonCount() {
		return buyPersonCount;
	}
	public void setBuyPersonCount(String buyPersonCount) {
		this.buyPersonCount = buyPersonCount;
	}
}
