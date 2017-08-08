package com.wy.gateway.api;

import com.wy.gateway.dto.UmPayAccountEnter;
import com.wy.gateway.dto.UmPayAccountResult;

/**
 * Created by liuyw on 2015/12/10.
 */
public interface UmPayAccountService {


    /**
     * 所有联动优势那边主动发起的请求，统一处理
     * @param umPayAccountEnter
     * @return
     */
    public UmPayAccountResult umpayGateway(UmPayAccountEnter umPayAccountEnter);


    /**
     * 4.2.1个人用户注册(商户平台)
     商户个人客户建立托管账户请求时使用，由商户发起在联动资金账户托管平台开户（托管账户），并进行账户绑定服务的接口，结果同步响应给商户。
     用户手机号不可变更。如果使用快捷充值，需要提示用户，相关注册要素务必与银行预留要素保持一致，例如：用户注册手机号务必与银行预留手机号保持一致。
     注册时身份证只支持18位。
     企业客户开户在线下完成，不通过线上处理。
     * @param umPayAccountEnter
     * @return
     */
    public UmPayAccountResult mer_register_person(UmPayAccountEnter umPayAccountEnter);



    public UmPayAccountResult ptp_mer_register_person(UmPayAccountEnter umPayAccountEnter);


    /**
     * 4.2.2绑定银行卡(商户平台)[这个看接口是要去到联动的页面的]
     接收处理P2P平台绑定个人客户银行卡的请求
     由P2P平台提交其客户提现银行卡信息给联动资金账户托管平台，用户在页面中进行确认操作，提交后由联动系统审核无误后，将提现银行卡信息与托管账户进行关联，交易结果异步响应给商户。
     上送姓名必须和注册姓名相同，进行银行实名认证。用户可以在绑卡页面修改银行预留手机号，以便通过银行实名认证。
     注意：医保卡、高中资助卡、中职卡，高端理财卡、单位卡等特殊卡种部分发卡行不允许做在线支付交易，可能导致绑卡或换卡时实名认证失败。
     绑卡受理结果通过“绑卡换卡申请后台通知”告知商户；最终绑卡结果通过“绑卡换卡结果通知”告知商户，绑卡超时时间：2小时。
     注意：
     1、只能为未绑定过银行卡的用户提供，且只能绑定一次，如果后续需要换卡，需走换卡接口。
     2、绑卡时用户可以签约借记卡快捷协议，此协议请谨慎开通，开通后无法解约。
     实名认证策略：
     绑卡时签约快捷，进行银行实名验证，银行范围详见附录借记卡快捷银行列表。
     绑卡时不签约快捷，进行银行实名验证，银行范围详见附录绑卡&提现银行列表。
     * @param umPayAccountEnter
     * @return
     */
    public UmPayAccountResult ptp_mer_bind_card(UmPayAccountEnter umPayAccountEnter);


    /**
     * 更换银行卡
     * @param umPayAccountEnter
     * @return
     */
    public UmPayAccountResult ptp_mer_replace_card(UmPayAccountEnter umPayAccountEnter);

    /**
     * 4.2.4绑卡换卡申请前台通知商户(平台商户)
     前台通知只表示绑卡申请的结果，并且只有申请成功时才会通知。绑卡是否成功的最终结果由后台通知决定。
     注意：由于网络因素，当绑卡申请结果后台通知或者最终结果后台通知先于前台通知到达时，请以最终结果后台通知为准。
     * @param umPayAccountEnter
     * @return
     */
    public UmPayAccountResult mer_bind_card_apply_notify(UmPayAccountEnter umPayAccountEnter);


    /**
     * 4.2.6绑卡换卡结果后台通知商户(平台商户)
     接收处理P2P平台绑定个人客户银行卡的请求。
     * @param umPayAccountEnter
     * @return
     */
    public UmPayAccountResult mer_bind_card_notify(UmPayAccountEnter umPayAccountEnter);
    
    /**
     * 查询企业账户
     * @Description: 查询商户结算账户中的可用余额，包括：平台方，担保方，企业投资方，企业融资方，即全部通过线下流程开通的联动账户。
     * @param @param umPayAccountEnter
     * @param @return   
     * @return UmPayAccountResult  
     * @throws
     * @author Ciro
     * @date 2015年12月28日
     */
    public UmPayAccountResult ptp_mer_query(UmPayAccountEnter umPayAccountEnter);

    /*接收处理P2P平台个人客户借记卡快捷、无密快捷、无密投资、无密还款签约的请求。
    1	ZCZP0800	无密快捷协议
    2	ZTBB0G00	无密投资协议
    3	ZHKB0H01	无密还款协议
    4	ZKJP0700	借记卡快捷协议（此协议请谨慎开通，开通后无法解约）

    用户签约借记卡快捷协议时，需要确保P2P用户注册手机号，姓名，身份证号与所换卡的银行预留信息保持一致。联动会进行银行实名验证，银行范围详见附录借记卡快捷银行列表。
    用户在绑卡页面修改银行预留手机号，以便通过银行快捷支付认证。

    跳转签约页面，用户需要输入交易密码进行绑定，交易结果异步响应给商户。
    使用“签约免密协议结果通知”告知商户签约结果。
    注意：绑定“无密快捷支付协议”前，用户必须已经绑定了“借记卡快捷支付协议”*/
    public UmPayAccountResult ptp_mer_bind_agreement(String user_id,String account_id,String agreement_list,String sourceV);


    /*接收处理P2P平台个人无密快捷、无密投资、无密还款的解约功能的请求。
    1	ZCZP0800	无密快捷协议
    2	ZTBB0G00	无密投资协议
    3	ZHKB0H01	无密还款协议

    跳转签约页面，用户需要输入交易密码进行解约，交易结果异步响应给商户。
    使用“解约授权结果通知”告知商户解约结果。*/
    public UmPayAccountResult mer_unbind_agreement(String user_id,String account_id,String agreement_list,String sourceV);



}
