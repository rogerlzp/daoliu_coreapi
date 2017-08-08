package com.wy.user.dto;

import com.wy.common.model.GeneralResult;
import lombok.Data;

/**
 * Created by zhengpingli on 2017/7/24.
 */

@Data
public class UserIOSSubmitResult extends GeneralResult {
    private static final long serialVersionUID = 6517615245677134434L;

    private long id;
    private long userId;
    private String submitDate;
}