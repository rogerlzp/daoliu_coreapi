package com.wy.user.api;

import com.wy.common.annotation.Role;
import com.wy.user.dto.AgreementEnter;
import com.wy.user.dto.AgreementResult;
import com.wy.user.dto.UmpayGatewayEnter;

/**
 * 协议接口
 * <p/>
 * 1	ZCZP0800	无密快捷协议
 * 2	ZTBB0G00	无密投资协议
 * 3	ZHKB0H01	无密还款协议
 * 4	ZKJP0700	借记卡快捷协议（此协议请谨慎开通，开通后无法解约）
 * Created by liuyw on 2016/2/17.
 */

public interface AgreementService {

    @Role
    AgreementResult ptp_mer_bind_agreement(AgreementEnter agreementEnter);


    @Role
    AgreementResult mer_unbind_agreement(AgreementEnter agreementEnter);


    void handleAgreementNotify(UmpayGatewayEnter umpayGatewayEnter);

    void handleUnbindAgreementNotify(UmpayGatewayEnter umpayGatewayEnter);
}
