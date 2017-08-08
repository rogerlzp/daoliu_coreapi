package com.wy.user.dto;

import com.wy.common.model.GeneralResult;
import lombok.Data;

/**
 * Created by zhengpingli on 2017/7/18.
 */

@Data
public class UserIOSProfileResult extends GeneralResult {
    private static final long serialVersionUID = 6512310861823934434L;

    private long id;
    private long userId;
    private String contactUser;
    private String contactPhone;
    private String address;
    private String email;
    private String incomeType;
    private String provinceCode;
    private String cityCode;
    private String areaCode;
    private String createDate;
    private String updateDate;
    private String userName;

}