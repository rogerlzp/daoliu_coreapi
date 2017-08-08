package com.wy.user.api;

import com.wy.common.annotation.Role;
import com.wy.user.dto.RepartnerEnter;
import com.wy.user.dto.RepartnerResult;
/**
 * Created by znz on 2015/12/29.
 */
public interface RepartnerService {
    @Role
    RepartnerResult replenish(RepartnerEnter para);
    RepartnerResult promoteUserLevel(RepartnerEnter para);
}
