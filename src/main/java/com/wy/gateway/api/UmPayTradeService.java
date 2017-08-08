package com.wy.gateway.api;

import com.wy.gateway.dto.UmPayAccountEnter;
import com.wy.gateway.dto.UmPayAccountResult;
import com.wy.gateway.dto.UmPayTradeEnter;
import com.wy.gateway.dto.UmPayTradeResult;

/**
 * 普通交易类接口 Created by liuyw on 2015/12/10.
 */
public interface UmPayTradeService {

	/**
	 * 4.4.4个人客户无密充值(商户平台)
	 接收处理P2P平台发起的个人客户（投资人、融资人）托管账户请求，通过无密借记卡快捷充值，并完成入账到个人客户P2P托管账，同步响应充值结果（对于结果不明的返回码需要特殊处理，详见本接口对应的返回码说明部分）。
	 用户必须已经签约了借记卡快捷和无密快捷服务。
	 交易成功后会使用“充值结果通知”接口再次告知商户。
	 使用快捷充值时，用户注册手机号务必与银行预留手机号保持一致。
	 * @param umPayTradeEnter
	 * @return
	 */
	UmPayTradeResult mer_recharge_person_nopwd(UmPayTradeEnter umPayTradeEnter);
	/**
	 * 4.4.1个人客户充值申请(商户平台)
	 * 接收处理P2P平台发起的个人客户（投资人、融资人）托管账户充值请求，并完成入账到个人客户P2P托管账户，用户需要在页面进行确认和验证操作。
	 * 实际充值结果由异步“充值结果通知接口”完成； 本期个人客户充值仅提供个人借记卡网银充值、借记卡快捷； 验证码有效期：15分钟。
	 * 如果使用快捷充值，需要提示用户，相关注册要素务必与银行预留要素保持一致，例如：用户注册手机号务必与银行预留手机号保持一致。
	 * 
	 * @param umPayTradeEnter
	 * @return
	 */
	UmPayTradeResult mer_recharge_person(UmPayTradeEnter umPayTradeEnter);

	/**
	 * 4.4.2 企业客户充值申请（商户-->平台）
	 * 接收处理P2P平台发起的企业客户（P2P平台、担保方）托管账户充值请求，并完成入账到企业客户U付账户，
	 * 实际充值结果由异步“充值结果通知接口”完成； 本期企业客户充值仅提供个人借记卡、企业网银充值两种方式；
	 * 
	 * @param umPayTradeEnter
	 * @return
	 */
	UmPayTradeResult mer_recharge(UmPayTradeEnter umPayTradeEnter);

	/**
	 * 4.4.3充值结果通知(平台商户) 主动通知商户告知充值处理结果
	 * 
	 * 注：商户如果签约了-托管账户线下充值（POS）产品，商户需要把商户侧接收POS充值通知结果的url地址在新产品接入的协议或者商户变更通知单里填写，
	 * 线下方式提交给联动侧销售或商户运营经理
	 * ，联动侧手工完成商户侧POS充值通知地址的配置，配置完成后，商户侧POS充值交易的通知结果即可以回调到预先配置的通知地址上，
	 * 具体充值通知的消息参数详见本接口定义。
	 * 
	 * @param umPayTradeEnter
	 * @return
	 */
	UmPayTradeResult recharge_notify(UmPayTradeEnter umPayTradeEnter);

	/**
	 * 4.4.5个人客户提现(商户平台)
	 * 接收处理P2P平台发起的个人客户（投资人、融资人）托管账户提现请求，并完成提现到个人客户银行卡，交易结果异步响应商户。
	 * 本接口只是提现申请环节，此时商户只能收到前台通知，作为提现申请的结果反馈，并不能作为交易结果使用。交易结果需要等最终的后台通知。
	 * 验证码有效期：15分钟。 用户授权页面有效期：30分钟
	 * 
	 * @param umPayTradeEnter
	 * @return
	 */
	UmPayTradeResult cust_withdrawals(UmPayTradeEnter umPayTradeEnter);

	/**
	 * 4.4.6 企业客户提现(商户-->平台)
	 * 接收处理P2P平台发起的企业客户托管账户提现申请请求。提现申请结果由同步响应获得（无前台通知），交易结果异步响应商户。
	 * 需要提前由商户运营经理申请做企业提现绑卡，否则此接口无法使用。 验证码有效期：15分钟。
	 * 
	 * 
	 * @param umPayTradeEnter
	 * @return
	 */
	UmPayTradeResult mer_withdrawals(UmPayTradeEnter umPayTradeEnter);

	/**
	 * 4.4.7提现申请前台通知(平台商户) 个人用户提现申请结果，商户获得此结果后只能认定为用户提现申请成功，并不能作为提现交易最终结果。
	 * 
	 * @param umPayTradeEnter
	 * @return
	 */
	UmPayTradeResult withdraw_apply_notify(UmPayTradeEnter umPayTradeEnter);

	/**
	 * 4.4.10普通转账（非标的转账）免密接口(商户平台) 接收处理P2P平台发起的非标的转账请求，不通过标的账户，并完成账户之间转账功能。
	 * 此接口为同步接口，为保证商户获取交易结果，同时具备后台通知的功能。 支持P2P平台对用户（对私、对公）转账；和对公企业用户向P2P平台转账。
	 * 验证码有效期：15分钟。 订单有效期：24小时。
	 * 
	 * @param umPayTradeEnter
	 * @return
	 */
	UmPayTradeResult transfer(UmPayTradeEnter umPayTradeEnter);

	/**
	 * 4.4.11普通转账验密接口 (商户平台)
	 * 接收处理P2P平台发起个人用户对其平台的转账，跳转到确认页面，用户通过验密，完成个人用户的P2P账户向平台现金账户的转账功能。
	 * 此功能为异步接口，交易结果通过前台页面跳转和后台通知方式响应给商户。 验证码有效期：15分钟。 订单有效期：2小时。
	 * 
	 * @param umPayTradeEnter
	 * @return
	 */
	UmPayTradeResult transfer_asyn(UmPayTradeEnter umPayTradeEnter);

	/**
	 * 4.4.12普通转账通知 (平台商户) 完成非标的转账的异步通知。 由商户提供服务端地址，供托管平台调用。
	 * 
	 * @param umPayTradeEnter
	 * @return
	 */
	UmPayTradeResult transfer_notify(UmPayTradeEnter umPayTradeEnter);

}
