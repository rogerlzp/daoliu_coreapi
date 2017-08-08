package com.wy.product.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by liuyw on 2016/1/5.
 */
public class JobEnter extends GeneralEnter implements Serializable {
    private static final long serialVersionUID = -8935686792996122651L;
    private String jobName;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
