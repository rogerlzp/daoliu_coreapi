package com.wy.cloan.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/8/18.
 */
@Data
public class Advertisement implements Serializable {

    private static final long serialVersionUID = 1109172394560911769L;


    private int id;
    private String name;
    private String imageUrl;
    private String linkUrl;
    private String status;


}
