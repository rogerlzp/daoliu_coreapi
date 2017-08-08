package com.wy.gateway.api;

import com.wy.gateway.dto.PushEnter;
import com.wy.gateway.dto.PushResult;

/**
 * 
 * Created by zhanggt on 2016-2-18.
 * 
 */
public interface PushService {

	PushResult push(PushEnter pushEnter);
}
