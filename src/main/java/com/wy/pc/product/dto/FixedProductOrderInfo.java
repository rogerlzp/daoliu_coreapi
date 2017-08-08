package com.wy.pc.product.dto;

import java.io.Serializable;

/**
 * Created by znz on 2016/2/29.
 */
public class FixedProductOrderInfo implements Serializable {
    private static final long serialVersionUID = 6238297833760661332L;
    private String orderNo;//订单编号
    private String productName;//产品名称
    private double orderAmount;//订单金额
    private double expectedRevenue;//预期收益
    private String expectedRevenueTxt;//预期收益文本
    private String orderDate;//订单日期
    private String expirationDate;//到期日
    private String productNo;//产品编号
    private String status;//产品编号

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public double getExpectedRevenue() {
        return expectedRevenue;
    }

    public void setExpectedRevenue(double expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getExpectedRevenueTxt() {
        return expectedRevenueTxt;
    }

    public void setExpectedRevenueTxt(String expectedRevenueTxt) {
        this.expectedRevenueTxt = expectedRevenueTxt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
