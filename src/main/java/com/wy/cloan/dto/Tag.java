package com.wy.cloan.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/6/28.
 */
@Data
public class Tag implements Serializable {

    private static final long serialVersionUID = 1136519039387112349L;
    private Integer id;//
    private String tagName;//'贷款编号'
    private String tagDesc;//'贷款编号'
    private String createDate;//待确认

    public Tag() {
    }

    public Tag(Integer id) {
        this.id = id;
    }
}

