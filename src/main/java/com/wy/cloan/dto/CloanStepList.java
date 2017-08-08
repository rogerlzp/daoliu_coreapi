package com.wy.cloan.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/6/26.
 */
@Data
public class CloanStepList  implements Serializable  {
    private static final long serialVersionUID = 1138716340611311269L;

    private Integer id;//

    private String cloanNo;//

    private Integer stepId;//
    private String stepName;//
    private int stepOrder;//
    private String createDate;//

    private String  enStepName;

}
