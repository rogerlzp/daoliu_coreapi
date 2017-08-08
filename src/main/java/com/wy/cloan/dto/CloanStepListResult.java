package com.wy.cloan.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhengpingli on 2017/6/26.
 */
public class CloanStepListResult extends GeneralResult implements Serializable {

    private static final long serialVersionUID = 6359819807661230123L;

    private List<CloanStepList> cloanStepList;

    public List<CloanStepList> getCloanStepList() {
        return cloanStepList;
    }

    public void setCloanStepList(List<CloanStepList> cloanStepList) {
        this.cloanStepList = cloanStepList;
    }
}
