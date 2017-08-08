package com.wy.user.api;

import com.wy.user.dto.VersionInfoEnter;
import com.wy.user.dto.VersionInfoResult;
/**
*
* 版本号
* Created by zhangnz on 2015/12/28.
*/
public interface VersionInfoService {
	VersionInfoResult checkupdate(VersionInfoEnter versionInfoEnter);
}