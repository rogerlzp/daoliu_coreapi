package com.wy.user.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/7/18.
 */
@Data
public class UserIOSProfile implements Serializable {

    private static final long serialVersionUID = 4891023455637859003L;


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
