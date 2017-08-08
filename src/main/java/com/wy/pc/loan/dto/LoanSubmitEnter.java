package com.wy.pc.loan.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by znz on 2016/3/1.
 */
public class LoanSubmitEnter  extends GeneralEnter implements Serializable {
    private static final long serialVersionUID = -7061998556453145088L;
    private Integer id;
    private String cityName;//
    private String name;//
    private String sex;//
    private String mobileNo;//
    private String email;//
    private String loanType;//借款类型
    private String loanAmount;//借款金额
    private String timeLimit;//借款期限
    private String loanExplaination;//借款说明

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getLoanExplaination() {
        return loanExplaination;
    }

    public void setLoanExplaination(String loanExplaination) {
        this.loanExplaination = loanExplaination;
    }
}
