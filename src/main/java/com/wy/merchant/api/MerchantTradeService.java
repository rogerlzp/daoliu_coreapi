package com.wy.merchant.api;

import com.wy.common.model.PageResultData;
import com.wy.common.model.ResultData;
import com.wy.merchant.dto.MerchantTradeEnter;
import com.wy.merchant.dto.MerchantTradeResult;

/**
 * 
 * Created by zhanggt on 2015-12-30.
 * 
 */
public interface MerchantTradeService {

	MerchantTradeResult recharge(MerchantTradeEnter merchantTradeEnter);

	void updateMerchantTradeOrderStatus(String order_no, String ret_code, String ret_msg);

	MerchantTradeResult withdrawals(MerchantTradeEnter merchantTradeEnter);

	PageResultData list(long currentPage, long pageSize, String trade_type, String time_start, String time_end);

	ResultData getMerchants(int mer_type);

	ResultData getWaitRechargeProduct();

	ResultData getWaitWithdrawalsProduct();

	ResultData queryTradeByOrderNo(String orderNo);

	ResultData merchantTradeDetail(long id);

	/**
	 * spv钱到平台账户
	 * @param merchantTradeEnter
	 * @return
     */
	MerchantTradeResult spv2Mer(MerchantTradeEnter merchantTradeEnter);

}
