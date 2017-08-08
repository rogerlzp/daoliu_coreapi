package com.wy.user.api;

import com.wy.common.annotation.Role;
import com.wy.user.dto.UserInfoListEnter;
import com.wy.user.dto.UserInfoListResult;
import com.wy.user.dto.UserLocationEnter;
import com.wy.user.dto.UserLocationResult;

/**
 * Created by zhengpingli on 2017/3/28.
 */
public interface LocationService {

    @Role
    UserLocationResult insertUserLocation(UserLocationEnter userLocationEnter);
}
