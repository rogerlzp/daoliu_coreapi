package com.wy.cloan.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhengpingli on 2017/6/22.
 */
@Data
public class CloanUserList implements Serializable {


    private static final long serialVersionUID = 1138462871619395169L;

    private long id;//
    private long userId;//'用户ID'
    private String cloanNo;//'借款标的'

    private String operationType;//'操作记录： visit：浏览； apply: 申请','
    private String createDate;//'创建时间'

    private String applyCondition;//''申请人数''
    private String applyDescription;//''申请人数''

    public String cloanLogo;//'Logo'
    public String cloanName;//'名称'
    public String company;//'公司名称'
    public String h5link;//'公司名称'
    private double monthRate;//月利率
    private double dayRate;//日利率
    private int applyCustomer;//''申请人数''

    private int cloanOrder;//排序号
    private String contactPhone; //联系电话
    private int remitTime; //放款时间
    private String remitUnit; //放款时间单位， 分钟，小时，天数

    private String description;//待确认
    private String remark;//备注


}
