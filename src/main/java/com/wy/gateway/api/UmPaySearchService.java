package com.wy.gateway.api;

import com.wy.gateway.dto.UmPayAccountEnter;
import com.wy.gateway.dto.UmPayAccountResult;
import com.wy.gateway.dto.UmPaySearchEnter;
import com.wy.gateway.dto.UmPaySearchResult;
import com.wy.gateway.dto.UmpayTransferSearchResult;

/**
 * 查询类接口 Created by liuyw on 2015/12/10.
 */
public interface UmPaySearchService {
	/**
	 * 4.5.3标的查询接口(商户平台) 查询标的账户状态及余额
	 * 
	 * @param umPaySearchEnter
	 * @return
	 */
	public UmPaySearchResult project_account_search(UmPaySearchEnter umPaySearchEnter);

	/**
	 * 用户查询-接收处理P2P商户发起的个人账户查询请求，返还相应个人用户状态、账户状态、余额
	 * 
	 * @param umPaySearchEnter
	 * @return
	 */
	public UmPaySearchResult user_search(UmPaySearchEnter umPaySearchEnter);
	
	/**
	 * 标的查询
	 * 
	 * @param umPaySearchEnter
	 * @return
	 */
	public UmPaySearchResult user_project_search(UmPaySearchEnter umPaySearchEnter);
	/**
	 * 4.5.1 交易查询(商户平台) 接收处理P2P平台发起的交易查询请求，返还相应交易状态和信息。 包括充值、提现、标的转账，转账。
	 * 
	 * @return
	 */
	public UmpayTransferSearchResult transfer_search(String orderNo, String orderDate, String busiType);


	/**
	 * 绑卡换卡订单查询
	 * @param orderNo 商户订单号
	 * @param merDate 商户生成订单的日期，格式YYYYMMDD
     * @return
     */
	public UmPaySearchResult bindcard_search(String orderNo,String merDate);
}
