package com.wy.user.dto;

import java.io.Serializable;

/**
 * Created by liuyw on 2016/2/19.
 */
public class OfflineOrder implements Serializable {

    private static final long serialVersionUID = 5827756963358491777L;
    private String cust_name;
    private String card_id;
    private String mobile_no;
    private String product_name;
    private String order_date;
    private String order_amount;
    private String annual_income;
    private String investment_term;
    private String over_date;
    private String profit;
    private String status;
    private String salesman;

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(String order_amount) {
        this.order_amount = order_amount;
    }

    public String getAnnual_income() {
        return annual_income;
    }

    public void setAnnual_income(String annual_income) {
        this.annual_income = annual_income;
    }

    public String getInvestment_term() {
        return investment_term;
    }

    public void setInvestment_term(String investment_term) {
        this.investment_term = investment_term;
    }

    public String getOver_date() {
        return over_date;
    }

    public void setOver_date(String over_date) {
        this.over_date = over_date;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }
}
