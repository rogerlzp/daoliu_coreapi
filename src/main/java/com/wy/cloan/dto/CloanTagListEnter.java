package com.wy.cloan.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhengpingli on 2017/6/28.
 */
public class CloanTagListEnter extends GeneralEnter implements Serializable {

    private static final long serialVersionUID = 3525761490812356781L;


    private List<Tag> tagList;

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }
}
