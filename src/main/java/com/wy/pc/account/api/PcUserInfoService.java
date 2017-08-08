package com.wy.pc.account.api;

import com.wy.common.annotation.Role;
import com.wy.pc.account.dto.PcAccountAmountWaterResult;
import com.wy.pc.account.dto.PcAmountWaterEnter;
import com.wy.pc.account.dto.PcUserAccountEnter;
import com.wy.pc.account.dto.PcUserAgreementEnter;
import com.wy.pc.account.dto.PcUserAgreementResult;
import com.wy.pc.account.dto.PcUserInfoEnter;
import com.wy.pc.account.dto.PcUserInfoResult;
import com.wy.pc.account.dto.PcUserTotalAccountResult;
import com.wy.user.dto.User;

public interface PcUserInfoService {
	
	/**
	 * 获取个人账户信息
	 * @param accountEnter
	 * @return
	 */
    @Role
    PcUserInfoResult userPcUserInfo(PcUserInfoEnter pcUserInfoEnter);
    
    /**
     * 获取用户是否签约免密
     * @param pcUserAgreementEnter
     * @return
     */
    @Role
    PcUserAgreementResult userAgreementByUserId(PcUserAgreementEnter pcUserAgreementEnter);

    
    User userBySessionKey(String sessionkey);
    
    /**
     *获取我的账户 
     * @param pcUserAccountEnter
     * @return
     */
    @Role
    PcUserTotalAccountResult userTotalAccountByUserId(PcUserAccountEnter pcUserAccountEnter);
    
    /**
     *获取已充值，提现金额和银行卡号 
     * @param PcAmountWaterEnter
     * @return
     */
    @Role
    PcAccountAmountWaterResult userAccountAmountWater(PcAmountWaterEnter pcAmountWaterEnter);
}
