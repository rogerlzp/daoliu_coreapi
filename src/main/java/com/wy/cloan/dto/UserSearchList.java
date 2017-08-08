package com.wy.cloan.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhengpingli on 2017/6/22.
 */
@Data
public class UserSearchList implements Serializable {

    private static final long serialVersionUID = 1138467610923471769L;
    private long id;//
    private long userId;//'用户Id'
    private String occupation;//'职业'

    private int loanAmount;//'申请时候的借款数额','
    private String loanTimeLimit;//'申请时候的借款时间','
    private String createDate;//'创建时间'

    public String cloanLogo;//'Logo'
    public String cloanName;//'名称'
    public String company;//'公司名称'
    public String h5link;//'链接地址'

    private int cloanOrder;//排序号
    private String contactPhone; //联系电话
    private int remitTime; //放款时间
    private String remitUnit; //放款时间单位， 分钟，小时，天数


}
