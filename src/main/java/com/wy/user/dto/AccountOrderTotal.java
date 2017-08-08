package com.wy.user.dto;

import java.io.Serializable;

public class AccountOrderTotal implements Serializable{


	private static final long serialVersionUID = -4915993562836306065L;
	private double collectCapitalTotal;

	public double getCollectCapitalTotal() {
		return collectCapitalTotal;
	}

	public void setCollectCapitalTotal(double collectCapitalTotal) {
		this.collectCapitalTotal = collectCapitalTotal;
	}
	
	

}
