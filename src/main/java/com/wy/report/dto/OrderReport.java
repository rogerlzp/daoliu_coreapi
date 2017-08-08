package com.wy.report.dto;

/**
 * Created by znz on 2016/1/21.
 */
public class OrderReport {
    private int number;//投资用户规模
    private double amount;//累计投资金额
    private double average;//人均投资金额
    //年龄段分布
    private String ageScope;//年龄段
    private String sex;//性别
    private int userNumber;//投资人数
    private double userAmount;//投资金额

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAgeScope() {
        return ageScope;
    }

    public void setAgeScope(String ageScope) {
        this.ageScope = ageScope;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public double getUserAmount() {
        return userAmount;
    }

    public void setUserAmount(double userAmount) {
        this.userAmount = userAmount;
    }

    public String getSex() {
    	if ("male".equals(this.sex))
    		sex = "男";
    	else if ("female".equals(this.sex))
    		sex = "女";
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
