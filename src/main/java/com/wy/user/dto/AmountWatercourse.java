package com.wy.user.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 账户流水(充值提现) Created by liuyw on 2015/12/21.
 */
public class AmountWatercourse implements Serializable {


	private static final long serialVersionUID = 8483968241431657162L;
	private Integer id;
	private String operateType;// 操作类型
	private Date operateDate;// 操作时间
	private double amount;// 金额
	private double charge;// 手续费
	private double ketingBirdCoin;// 提现鸟币费
	private String buckle;// 扣费方
	private Integer accountNo;// 账户
	private long userNo;// 用户

	private String orderNo;// 订单编号-我们标的
	private String tradeNo;// 订单编号-联动优势
	private double balance;// 可用余额
	private String status;// 状态
	private String merDate;// 商户对账时间

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getMerDate() {
		return merDate;
	}

	public void setMerDate(String merDate) {
		this.merDate = merDate;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOperateType() {
		return operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public Date getOperateDate() {
		return operateDate;
	}

	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	public double getKetingBirdCoin() {
		return ketingBirdCoin;
	}

	public void setKetingBirdCoin(double ketingBirdCoin) {
		this.ketingBirdCoin = ketingBirdCoin;
	}

	public String getBuckle() {
		return buckle;
	}

	public void setBuckle(String buckle) {
		this.buckle = buckle;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public long getUserNo() {
		return userNo;
	}

	public void setUserNo(long userNo) {
		this.userNo = userNo;
	}

}
