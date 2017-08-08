package com.wy.cloan.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhengpingli on 2017/6/22.
 */
public class CloanUserListResult extends GeneralResult implements Serializable {

    private static final long serialVersionUID = 6359812304513710123L;

    private List<CloanUserList> cloanUserList;

    public List<CloanUserList> getCloanUserList() {
        return cloanUserList;
    }

    public void setCloanUserList(List<CloanUserList> cloanUserList) {
        this.cloanUserList = cloanUserList;
    }
}