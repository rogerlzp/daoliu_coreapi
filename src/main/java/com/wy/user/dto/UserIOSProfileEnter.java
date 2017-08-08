package com.wy.user.dto;

import com.wy.common.model.GeneralEnter;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/7/18.
 */
@Data
public class UserIOSProfileEnter  extends GeneralEnter implements Serializable {

    private static final long serialVersionUID = 43051098091623746L;


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

}
