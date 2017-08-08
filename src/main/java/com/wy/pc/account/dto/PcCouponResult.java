package com.wy.pc.account.dto;

import com.wy.common.model.GeneralResult;
import com.wy.user.dto.Coupon;

import java.io.Serializable;
import java.util.List;

/**
 * Created by znz on 2016/3/2.
 */
public class PcCouponResult  extends GeneralResult implements Serializable {

    private static final long serialVersionUID = 7109981372365118000L;
    private List<Coupon> couponList;

    public List<Coupon> getCouponList() {
        return couponList;
    }

    public void setCouponList(List<Coupon> couponList) {
        this.couponList = couponList;
    }
}
