package com.wy.pc.account.api;

import com.wy.common.annotation.Role;
import com.wy.pc.account.dto.PcWaterCourseEnter;
import com.wy.pc.account.dto.PcWaterCourseResult;

/**
 * Created by znz on 2016/3/2.
 */
public interface PcWaterCourseService {
    @Role
    PcWaterCourseResult getWaterCourseList(PcWaterCourseEnter pcWaterCourseEnter);
}
