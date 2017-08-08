package com.wy.pc.account.api;

import com.wy.common.annotation.Role;
import com.wy.user.dto.AccountEnter;
import com.wy.user.dto.UmAccountResult;

/**
 * Created by znz on 2016/2/25.
 */
public interface LargeRechargeService {
    /**
     * 大额充值
     */
    @Role
    UmAccountResult largeRecharge(AccountEnter accountEnter);
}
