package com.wy.mobile.api;

import com.wy.mobile.dto.MobileCodeEnter;
import com.wy.mobile.dto.MobileCodeResult;

/**
 * 内部发短信的服务类，封装在 网关层
 */
public interface PrivateMobileCodeService {


	/**
	 * 发送短信
	 * @param mobile 手机号码
	 * @param messageData 内容
	 * @param type 发送方式
     * @return
     */
	public MobileCodeResult sendMobileCode(String mobile,String messageData,String type);
	/**
	 * 发送短信
	 * @param mobile 手机号码
	 * @param messageData 内容
	 * @param type 发送方式
     * @return
     */
	public MobileCodeResult sendMobileCode(String[] mobile,String messageData,String type);


}
