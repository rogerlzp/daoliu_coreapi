package com.wy.report.dto;

/**
 * Created by znz on 2016/1/21.
 */
public class ProductReport {
    private int number;//标的总量
    private double amount;//标的总金额
    private double convertDay;//平均期限
    private double annualIncome;//平均利率

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getConvertDay() {
        return convertDay;
    }

    public void setConvertDay(double convertDay) {
        this.convertDay = convertDay;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }
}
