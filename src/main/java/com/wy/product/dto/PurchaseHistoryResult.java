package com.wy.product.dto;

import java.io.Serializable;
import java.util.List;

import com.wy.common.model.GeneralResult;

public class PurchaseHistoryResult extends GeneralResult implements Serializable{


	private static final long serialVersionUID = -4084405725446701863L;
	private List<PurchaseHistory> purchaseHistoryList;

	public List<PurchaseHistory> getPurchaseHistoryList() {
		return purchaseHistoryList;
	}

	public void setPurchaseHistoryList(List<PurchaseHistory> purchaseHistoryList) {
		this.purchaseHistoryList = purchaseHistoryList;
	}

	
	
}
