package com.wy.pc.order.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralEnter;

public class PcCurrentOrderEnter extends GeneralEnter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3585424717517134031L;

	private Double order_amount;

	private int pay_type = 0;

	public Double getOrder_amount() {
		return order_amount;
	}

	public void setOrder_amount(Double order_amount) {
		this.order_amount = order_amount;
	}

	public int getPay_type() {
		return pay_type;
	}

	public void setPay_type(int pay_type) {
		this.pay_type = pay_type;
	}

	@Override
	public String toString() {
		return "CurrentOrderEnter [order_amount=" + order_amount + ", payType=" + pay_type + ", getOrder_amount()=" + getOrder_amount()
				+ ", getPayType()=" + getPay_type() + ", getPageSize()=" + getPageSize() + ", getCurrentPage()=" + getCurrentPage()
				+ ", getVersion()=" + getVersion() + ", getTimestamp()=" + getTimestamp() + ", getSessionKey()=" + getSessionKey()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
