package com.wy.mobile.api;

import com.wy.mobile.dto.MobileCodeEnter;
import com.wy.mobile.dto.MobileCodeResult;

/**
 * ClassName: MobileCodeService 
 * @Description: get mobile validation code
 * @author Ciro
 * @date 2015年11月26日
 */
public interface MobileCodeService {
	public MobileCodeResult getMobileCode(MobileCodeEnter mce);

	/**
	 * 验证手机验证码
	 * @param mce
	 * @return
     */
	public MobileCodeResult verifyMobileCode(MobileCodeEnter mce);
}
