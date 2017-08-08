package com.wy.log.api;

import com.wy.log.dto.InterfaceLog;
import com.wy.log.dto.UmPayLog;

/**
 *
 *Created by zhanggt on 2016-1-13.
 *
 */
public interface LogService {

	void saveUmpayLog(UmPayLog log);
	
	void saveInterfaceLog(InterfaceLog log);
}
