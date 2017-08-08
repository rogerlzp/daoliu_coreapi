package com.wy.user.api;

import com.wy.user.dto.*;

/**
 * Created by znz on 2015/12/30.
 */
public interface CouponService {
    /**
     * 发放抵用券
     * @param para userid，couponid，coupontype
     * @return
     */
    CouponResult issueCoupon(CouponEnter para);

    /**
     * 查询抵用券列表
     * @param couponListEnter
     * @return
     */
    CouponListResult findCouponList(CouponListEnter couponListEnter);

    /**
     * 添加抵用券
     * @param couponEnter
     * @return
     */
    String saveCoupon(CouponEnter couponEnter);

    /**
     * 查询抵用券
     * @param couponDetailEnter
     * @return
     */
    CouponDetailResult findCouponDetail(CouponDetailEnter couponDetailEnter);
}
