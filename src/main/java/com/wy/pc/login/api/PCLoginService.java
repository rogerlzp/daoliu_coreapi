package com.wy.pc.login.api;

import com.wy.pc.login.dto.PCLoginEnter;
import com.wy.pc.login.dto.PCLoginResult;

/**
 * Created by znz on 2016/2/25.
 */
public interface PCLoginService {
    PCLoginResult doLogin(PCLoginEnter pCLoginEnter);
}