package com.wy.pc.product.dto;

/**
 * Created by znz on 2016/2/29.
 */
public class FixedProductOrder {
    private String orderNo;//订单编号
    private double orderAmount;//订单金额
    private String handleStatus;//订单状态
    private String orderDate;//订单日期
    private double annualIncome;//年化利率
    private int convertDay;//折算天
    private String staRateDate;//起息日
    private double denomination;//返现券金额

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
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

    public String getStaRateDate() {
        return staRateDate;
    }

    public void setStaRateDate(String staRateDate) {
        this.staRateDate = staRateDate;
    }

    public double getDenomination() {
        return denomination;
    }

    public void setDenomination(double denomination) {
        this.denomination = denomination;
    }
}
