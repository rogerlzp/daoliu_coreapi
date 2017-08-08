package com.wy.cloan.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhengpingli on 2017/6/22.
 */
public class UserSearchListResult extends GeneralResult implements Serializable {

    private static final long serialVersionUID = 6359890814234710123L;

    private List<UserSearchList> list;

    public List<UserSearchList> getList() {
        return list;
    }


}
