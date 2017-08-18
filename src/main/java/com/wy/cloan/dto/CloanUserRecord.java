package com.wy.cloan.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhengpingli on 2017/6/22.
 */
@Data
public class CloanUserRecord implements Serializable {

    private static final long serialVersionUID = 1138462340910791769L;
    private long id;//
    private long userId;//'用户ID'
    private String cloanNo;//'借款标的'

    private String operationType;//'操作记录： visit：浏览； apply: 申请','
    private Date createDate;//'创建时间'

    private String ipAddress;//'用户ID'

}
