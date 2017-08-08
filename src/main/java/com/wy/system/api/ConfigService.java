package com.wy.system.api;

import com.wy.common.model.GeneralEnter;
import com.wy.common.model.GeneralResult;
import com.wy.pc.mobile.dto.PCMobileCodeEnter;
import com.wy.pc.mobile.dto.PCMobileCodeResult;
import com.wy.system.dto.IOSApiEnter;
import com.wy.system.dto.IOSApiResult;

/**
 * Created by zhengpingli on 2017/7/18.
 */
public interface ConfigService {

    public IOSApiResult getIOSApi(IOSApiEnter iosApiEnter);

}
