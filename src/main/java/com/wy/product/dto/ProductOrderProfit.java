package com.wy.product.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyw on 2015/12/24.
 */
public class ProductOrderProfit implements Serializable {


    private static final long serialVersionUID = -2575635240251563757L;
    private Integer id;
    private Integer orderId;
    private String orderNo;
    private Integer userId;//用户id
    private String umpayAccountNo;//联动优势账户号
    private String umpayUserNo;//联动优势用户号
    private Integer productId;//产品id
    private String productNo;//产品编号
    private String productName;//产品名称
    private double annualIncome;//年化收益
    private  int convertDay;//折算天
    private Date offBidDate;//流标时间
    private String productType;//产品类型
    private String productStatus;//产品状态
    private double profit;//订单收益[重要]
    private double orderAmount;//订单金额
    private double birdCoin;//鸟币金额
    private String orderType;//订单类型
    private Date orderDate;//订单时间
    private String cashbackCoupon;//返现券编号
    private String handleStatus;//订单处理状态
    private String cashbackCouponId;//订单处理状态  CASHBACK_COUPON_ID
    private String denomination;//返现券金额

    private Date createDate;//创建时间
    private Date updateDate;//修改时间
    private String status;//修改时间  初始化：0 |  已通知联动优势 2| 已日终对账 3
    private String merCheckDate;//对账时间
    private String sysDate;//清算时间
    private String errorMessage;//错误原因
    private String isFirstOrder;// 是否首次下单

    public String getIsFirstOrder() {
        return isFirstOrder;
    }

    public void setIsFirstOrder(String isFirstOrder) {
        this.isFirstOrder = isFirstOrder;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUmpayAccountNo() {
        return umpayAccountNo;
    }

    public void setUmpayAccountNo(String umpayAccountNo) {
        this.umpayAccountNo = umpayAccountNo;
    }

    public String getUmpayUserNo() {
        return umpayUserNo;
    }

    public void setUmpayUserNo(String umpayUserNo) {
        this.umpayUserNo = umpayUserNo;
    }

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

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public int getConvertDay() {
        return convertDay;
    }

    public void setConvertDay(int convertDay) {
        this.convertDay = convertDay;
    }

    public Date getOffBidDate() {
        return offBidDate;
    }

    public void setOffBidDate(Date offBidDate) {
        this.offBidDate = offBidDate;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
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

    public String getCashbackCoupon() {
        return cashbackCoupon;
    }

    public void setCashbackCoupon(String cashbackCoupon) {
        this.cashbackCoupon = cashbackCoupon;
    }

    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public String getCashbackCouponId() {
        return cashbackCouponId;
    }

    public void setCashbackCouponId(String cashbackCouponId) {
        this.cashbackCouponId = cashbackCouponId;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
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

    @Override
    public String toString() {
        return "ProductOrderProfit{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", orderNo='" + orderNo + '\'' +
                ", userId=" + userId +
                ", umpayAccountNo='" + umpayAccountNo + '\'' +
                ", umpayUserNo='" + umpayUserNo + '\'' +
                ", productId=" + productId +
                ", productNo='" + productNo + '\'' +
                ", productName='" + productName + '\'' +
                ", annualIncome=" + annualIncome +
                ", convertDay=" + convertDay +
                ", offBidDate=" + offBidDate +
                ", productType='" + productType + '\'' +
                ", productStatus='" + productStatus + '\'' +
                ", profit=" + profit +
                ", orderAmount=" + orderAmount +
                ", birdCoin=" + birdCoin +
                ", orderType='" + orderType + '\'' +
                ", orderDate=" + orderDate +
                ", cashbackCoupon='" + cashbackCoupon + '\'' +
                ", handleStatus='" + handleStatus + '\'' +
                ", cashbackCouponId='" + cashbackCouponId + '\'' +
                ", denomination='" + denomination + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", status='" + status + '\'' +
                ", merCheckDate='" + merCheckDate + '\'' +
                ", sysDate='" + sysDate + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", isFirstOrder='" + isFirstOrder + '\'' +
                '}';
    }
}
