package com.wy.cloan.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/6/26.
 */
@Data
public class CloanStep implements Serializable {
    private static final long serialVersionUID = 1138445091239413169L;
    private Integer id;//

    private String cloanNo;//

    private Integer stepId;//
    private String stepName;//
    private String enStepName;//
    private int stepOrder;//
    private String createDate;//



}
