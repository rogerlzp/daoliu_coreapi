package com.wy.pc.account.api;

import com.wy.common.annotation.Role;
import com.wy.common.model.GeneralResult;
import com.wy.pc.account.dto.PcNameAuthEnter;

/**
 * Created by znz on 2016/3/1.
 */
public interface PcAccountNameAuthService {
    /**
     * 实名认证
     */
    @Role
    GeneralResult nameAuth(PcNameAuthEnter pcNameAuthEnter);
}
