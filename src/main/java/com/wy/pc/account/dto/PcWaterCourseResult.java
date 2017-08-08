package com.wy.pc.account.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created by znz on 2016/3/2.
 */
public class PcWaterCourseResult  extends GeneralResult implements Serializable {
    private static final long serialVersionUID = 817608300552217957L;
    List<PcWaterCourse> pcWaterCourseList;

    public List<PcWaterCourse> getPcWaterCourseList() {
        return pcWaterCourseList;
    }

    public void setPcWaterCourseList(List<PcWaterCourse> pcWaterCourseList) {
        this.pcWaterCourseList = pcWaterCourseList;
    }
}
