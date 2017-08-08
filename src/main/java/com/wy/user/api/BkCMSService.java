package com.wy.user.api;

import com.wy.gateway.dto.UmPaySearchResult;
import com.wy.user.dto.UmpayGatewayResult;

/**
*
* 版本号
* Created by zhangnz on 2015/12/28.
*/
public interface BkCMSService {
	/**
	 * 返回结果：
	 * 1.
	 * 2.
	 * 3.
	 * 4.
	 * @param mobileNo
	 * @return
     */
	String handleBindCardCMS(String mobileNo);


	UmPaySearchResult userSearch(String mobileNo);

}