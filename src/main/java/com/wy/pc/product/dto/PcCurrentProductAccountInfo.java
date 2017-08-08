package com.wy.pc.product.dto;

import java.io.Serializable;

/**
 * Created by znz on 2016/2/28.
 */
public class PcCurrentProductAccountInfo implements Serializable{
    private static final long serialVersionUID = -7632349327685422341L;
    private double balance;//随心投总额
    private double totalIncome;//累计收益
    private double lastdayIncome;//昨日收益
    private double usableBalance;//可用收益

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double getLastdayIncome() {
        return lastdayIncome;
    }

    public void setLastdayIncome(double lastdayIncome) {
        this.lastdayIncome = lastdayIncome;
    }

    public double getUsableBalance() {
        return usableBalance;
    }

    public void setUsableBalance(double usableBalance) {
        this.usableBalance = usableBalance;
    }
}
