package com.wy.cloan.dto;

import com.wy.common.model.GeneralEnter;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhengpingli on 2017/6/22.
 */
@Data
public class  CloanUserRecordEnter  extends GeneralEnter implements Serializable {

    private static final long serialVersionUID = 3525762319810171283L;

    private long id;//
    private long userId;//'用户ID'
    private String cloanNo;//'借款标的'

    private String operationType;//'操作记录： visit：浏览； apply: 申请','
    private Date createDate;//'创建时间'


}
