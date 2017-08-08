package com.wy.product.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * 合伙人分润
 * Created by liuyw on 2015/12/25.
 */
public class PartnerBenefitSplit  implements Serializable {


    private static final long serialVersionUID = 7661118738963013326L;
    private Integer orderId;
    private String orderNo;
    private String tradeNo;
    private Integer productId;
    private Integer userId;
    private String userType;
    private Integer orderUserId;
    private String umpayUserNo;//联动用户号
    private String umpayAccountNo;//联动账户号
    private String productName;
    private String orderType;
    private Date orderDate;
    private double orderAmount;
    private double birdCoin;
    private String rateCalculatetype;
    private int convertday;
    private double annualIncome;
    private double profit;
   private int fatherId;
   private int grandFatherId;
   private double fatherLevelIncome;
   private double grandFatherLevelIncome;
   private double fatherProfit;
   private Date createDate;
   private Date updateDate;
   private String status;
   private String merCheckDate;
   private String sysDate;
   private String errorMessage;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Integer getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Integer orderUserId) {
        this.orderUserId = orderUserId;
    }

    public String getUmpayUserNo() {
        return umpayUserNo;
    }

    public void setUmpayUserNo(String umpayUserNo) {
        this.umpayUserNo = umpayUserNo;
    }

    public String getUmpayAccountNo() {
        return umpayAccountNo;
    }

    public void setUmpayAccountNo(String umpayAccountNo) {
        this.umpayAccountNo = umpayAccountNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public double getBirdCoin() {
        return birdCoin;
    }

    public void setBirdCoin(double birdCoin) {
        this.birdCoin = birdCoin;
    }

    public String getRateCalculatetype() {
        return rateCalculatetype;
    }

    public void setRateCalculatetype(String rateCalculatetype) {
        this.rateCalculatetype = rateCalculatetype;
    }

    public int getConvertday() {
        return convertday;
    }

    public void setConvertday(int convertday) {
        this.convertday = convertday;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public int getFatherId() {
        return fatherId;
    }

    public void setFatherId(int fatherId) {
        this.fatherId = fatherId;
    }

    public int getGrandFatherId() {
        return grandFatherId;
    }

    public void setGrandFatherId(int grandFatherId) {
        this.grandFatherId = grandFatherId;
    }

    public double getFatherLevelIncome() {
        return fatherLevelIncome;
    }

    public void setFatherLevelIncome(double fatherLevelIncome) {
        this.fatherLevelIncome = fatherLevelIncome;
    }

    public double getGrandFatherLevelIncome() {
        return grandFatherLevelIncome;
    }

    public void setGrandFatherLevelIncome(double grandFatherLevelIncome) {
        this.grandFatherLevelIncome = grandFatherLevelIncome;
    }

    public double getFatherProfit() {
        return fatherProfit;
    }

    public void setFatherProfit(double fatherProfit) {
        this.fatherProfit = fatherProfit;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMerCheckDate() {
        return merCheckDate;
    }

    public void setMerCheckDate(String merCheckDate) {
        this.merCheckDate = merCheckDate;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }


    @Override
    public String toString() {
        return "PartnerBenefitSplit{" +
                "orderId=" + orderId +
                ", orderNo='" + orderNo + '\'' +
                ", tradeNo='" + tradeNo + '\'' +
                ", productId=" + productId +
                ", userId=" + userId +
                ", userType='" + userType + '\'' +
                ", orderUserId=" + orderUserId +
                ", umpayUserNo='" + umpayUserNo + '\'' +
                ", umpayAccountNo='" + umpayAccountNo + '\'' +
                ", productName='" + productName + '\'' +
                ", orderType='" + orderType + '\'' +
                ", orderDate=" + orderDate +
                ", orderAmount=" + orderAmount +
                ", birdCoin=" + birdCoin +
                ", rateCalculatetype='" + rateCalculatetype + '\'' +
                ", convertday=" + convertday +
                ", annualIncome=" + annualIncome +
                ", profit=" + profit +
                ", fatherId=" + fatherId +
                ", grandFatherId=" + grandFatherId +
                ", fatherLevelIncome=" + fatherLevelIncome +
                ", grandFatherLevelIncome=" + grandFatherLevelIncome +
                ", fatherProfit=" + fatherProfit +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", status='" + status + '\'' +
                ", merCheckDate='" + merCheckDate + '\'' +
                ", sysDate='" + sysDate + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
