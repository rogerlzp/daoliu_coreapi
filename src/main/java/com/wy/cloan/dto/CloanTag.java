package com.wy.cloan.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/6/28.
 */
@Data
public class CloanTag implements Serializable {

    private static final long serialVersionUID = 1136519039387112349L;
    private Integer id;//
    private String cloanNo;//'贷款编号'
    private Integer tagId;//'tag标识'
    private int status;//状态
    private String createDate;//待确认

}
