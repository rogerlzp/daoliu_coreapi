package com.wy.user.dto;

import com.wy.common.model.GeneralResult;
import lombok.Data;

/**
 * Created by zhengpingli on 2017/6/27.
 */
@Data
public class UserProfileResult extends GeneralResult {
    private static final long serialVersionUID = -407409861823934434L;

    private long id;
    private long userId;
    private String userName;
    private String idcard;
    private String education;
    private String job;
    private String income;
    private int hasCreditCard;
    private String createDate;
    private String updateDate;
}
