package com.wy.pc.account.api;

import com.wy.common.annotation.Role;
import com.wy.common.model.GeneralResult;
import com.wy.pc.account.dto.PcBindCardEnter;
import com.wy.user.dto.UmAccountResult;

/**
 * Created by znz on 2016/3/2.
 */
public interface PcAccountBindCardService {
    /**
     * bindcard
     */
    @Role
    UmAccountResult bindCard(PcBindCardEnter pcBindCardEnter);
}
