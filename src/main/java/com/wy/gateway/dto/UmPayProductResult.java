package com.wy.gateway.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by liuyw on 2015/12/15.
 */
public class UmPayProductResult extends GeneralResult implements Serializable {

    private static final long serialVersionUID = 6970466435071638134L;
    private String sign;//签名
    private String plain;//
    private String url;//

    private Map resMap;//异步接口联动返回的数据

    public Map getResMap() {
        return resMap;
    }

    public void setResMap(Map resMap) {
        this.resMap = resMap;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getPlain() {
        return plain;
    }

    public void setPlain(String plain) {
        this.plain = plain;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

	@Override
	public String toString() {
		return "UmPayProductResult [sign=" + sign + ", plain=" + plain + ", url=" + url + ", resMap=" + resMap + "]";
	}
    
    
}
