package com.wy.user.dto;

import com.wy.common.model.GeneralEnter;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/6/27.
 */
@Data
public class UserProfileEnter extends GeneralEnter   implements Serializable {

    private static final long serialVersionUID = 4305109837610923556L;

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
