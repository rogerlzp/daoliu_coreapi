package com.wy.gateway.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/4/11.
 */
public class QiNiuTokenEnter extends GeneralEnter implements Serializable {

    private static final long serialVersionUID = 5130193749592010202L;

    private String spaceName;
    private String fileName;

    //
   // scope ='my-bucket:sunflower.jpg'


    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
