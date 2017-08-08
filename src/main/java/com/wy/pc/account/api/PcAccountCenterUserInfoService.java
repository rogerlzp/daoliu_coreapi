package com.wy.pc.account.api;

import com.wy.common.annotation.Role;
import com.wy.common.model.GeneralEnter;
import com.wy.pc.account.dto.PcAccountCenterBankInfoResult;
import com.wy.pc.account.dto.PcAccountCenterNameAuthInfoResult;

/**
 * Created by znz on 2016/3/1.
 */
public interface PcAccountCenterUserInfoService {
    @Role
    PcAccountCenterBankInfoResult getBankInfo(GeneralEnter enter);
    @Role
    PcAccountCenterNameAuthInfoResult getNameAuthInfo(GeneralEnter enter);
}
