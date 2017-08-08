package com.wy.cloan.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhengpingli on 2017/6/22.
 */
@Data
public class UserSearchRecord implements Serializable {

    private static final long serialVersionUID = 1138462300123471769L;
    private long id;//
    private long userId;//'用户Id'
    private String occupation;//'职业'

    private int loanAmount;//'申请时候的借款数额','
    private String loanTimeLimit;//'申请时候的借款时间','
    private Date createDate;//'创建时间'

    
}
