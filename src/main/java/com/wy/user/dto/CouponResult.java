package com.wy.user.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.wy.common.model.GeneralResult;

public class CouponResult extends GeneralResult implements Serializable {
    private static final long serialVersionUID = 6966062519862837107L;
    /**
     */
    private List<Coupon> coupons;
	public List<Coupon> getCoupons() {
		return coupons;
	}
	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

}
