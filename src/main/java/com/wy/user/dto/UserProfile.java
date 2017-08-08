package com.wy.user.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/6/27.
 */
@Data
public class UserProfile implements Serializable {

    private static final long serialVersionUID = 4300651098374859003L;

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
