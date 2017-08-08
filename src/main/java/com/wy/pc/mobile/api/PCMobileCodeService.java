package com.wy.pc.mobile.api;

import com.wy.pc.mobile.dto.PCMobileCodeEnter;
import com.wy.pc.mobile.dto.PCMobileCodeResult;

/**
 * PC官网 获取手机验证码
 */
public interface PCMobileCodeService {
	public PCMobileCodeResult getMobileCode(PCMobileCodeEnter mce);
}
