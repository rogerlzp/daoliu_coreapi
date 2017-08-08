package com.wy.user.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyw on 2015/12/11.
 */
public class AccountEnter extends GeneralEnter implements Serializable {


    private static final long serialVersionUID = 6707634982775975484L;
    private double  orderAmount;//订单金额
    private String orderBizStatus;//订单业务状态，'投标中：TBZ；持有中：CYZ；已还款：YHK'
    private String  orderType;//订单类型
    private Date orderDate;//订单时间
    private String cashbackCoupon;//返现券编号
    private double birdCoin;//鸟币
    private int  userId;//用户编号
    private String  userIp;//用户ip
    //实名认证接口
    private String  identityType;//证件类型
    private String  identityCode;//证件号码
    private String  email;//邮箱
    private String  userName;//姓名
    //帮卡接口
    private String cardId;//银行卡
    private String metaHtml;//联动传过来的全部数据
    private String sourceV;//来源
    private String belongBank;//所属银行
    private String com_amt_type;//1 前向手续费：交易方承担 2 前向手续费：平台商户（手续费账户）承担

    private String gateId;//发卡银行编号

    public String getBelongBank() {
        return belongBank;
    }

    public void setBelongBank(String belongBank) {
        this.belongBank = belongBank;
    }

    public String getCom_amt_type() {
        return com_amt_type;
    }

    public void setCom_amt_type(String com_amt_type) {
        this.com_amt_type = com_amt_type;
    }

    public String getMetaHtml() {
        return metaHtml;
    }

    public void setMetaHtml(String metaHtml) {
        this.metaHtml = metaHtml;
    }

    public String getSourceV() {
        return sourceV;
    }

    public String getOrderBizStatus() {
		return orderBizStatus;
	}

	public void setOrderBizStatus(String orderBizStatus) {
		this.orderBizStatus = orderBizStatus;
	}

	public void setSourceV(String sourceV) {
        this.sourceV = sourceV;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
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

    public double getBirdCoin() {
        return birdCoin;
    }

    public void setBirdCoin(double birdCoin) {
        this.birdCoin = birdCoin;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getGateId() {
        return gateId;
    }

    public void setGateId(String gateId) {
        this.gateId = gateId;
    }

    @Override
    public String toString() {
        return "AccountEnter{" +
                "orderAmount=" + orderAmount +
                ", orderBizStatus='" + orderBizStatus + '\'' +
                ", orderType='" + orderType + '\'' +
                ", orderDate=" + orderDate +
                ", cashbackCoupon='" + cashbackCoupon + '\'' +
                ", birdCoin=" + birdCoin +
                ", userId=" + userId +
                ", userIp='" + userIp + '\'' +
                ", identityType='" + identityType + '\'' +
                ", identityCode='" + identityCode + '\'' +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", cardId='" + cardId + '\'' +
                ", metaHtml='" + metaHtml + '\'' +
                ", sourceV='" + sourceV + '\'' +
                ", belongBank='" + belongBank + '\'' +
                ", com_amt_type='" + com_amt_type + '\'' +
                '}';
    }
}
