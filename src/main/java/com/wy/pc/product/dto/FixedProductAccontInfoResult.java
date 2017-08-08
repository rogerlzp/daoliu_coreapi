package com.wy.pc.product.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created by znz on 2016/2/28.
 */
public class FixedProductAccontInfoResult extends GeneralResult implements Serializable {
    private static final long serialVersionUID = -90520836856274118L;
    private double orderWaitedIncome;//待收收益
    private double orderReceivedIncome;//已收收益
    private double sumOrderAmount;//在投总金额
    private double last30DayInvest;//近一月投资金额
    private double last30DayExpiration;//近一月到期金额
    private int last30DayExpirationNum;//近一月到期订单数

    public double getOrderWaitedIncome() {
        return orderWaitedIncome;
    }

    public void setOrderWaitedIncome(double orderWaitedIncome) {
        this.orderWaitedIncome = orderWaitedIncome;
    }

    public double getOrderReceivedIncome() {
        return orderReceivedIncome;
    }

    public void setOrderReceivedIncome(double orderReceivedIncome) {
        this.orderReceivedIncome = orderReceivedIncome;
    }

    public double getSumOrderAmount() {
        return sumOrderAmount;
    }

    public void setSumOrderAmount(double sumOrderAmount) {
        this.sumOrderAmount = sumOrderAmount;
    }

    public double getLast30DayInvest() {
        return last30DayInvest;
    }

    public void setLast30DayInvest(double last30DayInvest) {
        this.last30DayInvest = last30DayInvest;
    }

    public double getLast30DayExpiration() {
        return last30DayExpiration;
    }

    public void setLast30DayExpiration(double last30DayExpiration) {
        this.last30DayExpiration = last30DayExpiration;
    }

    public int getLast30DayExpirationNum() {
        return last30DayExpirationNum;
    }

    public void setLast30DayExpirationNum(int last30DayExpirationNum) {
        this.last30DayExpirationNum = last30DayExpirationNum;
    }
}
