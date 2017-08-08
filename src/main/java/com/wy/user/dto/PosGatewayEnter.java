package com.wy.user.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by liuyw on 2016/3/12.
 */
public class PosGatewayEnter extends GeneralEnter implements Serializable {


    private static final long serialVersionUID = -1857338777176928921L;
    private String metaHtml;// 联动传过来的全部数据
    private Map requestMap;
    private Map responseMap;

    private String ret_code;
    private String ret_msg;
    private String order_id;
    private String user_id;
    private String service;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getMetaHtml() {
        return metaHtml;
    }

    public void setMetaHtml(String metaHtml) {
        this.metaHtml = metaHtml;
    }

    public Map getRequestMap() {
        return requestMap;
    }

    public void setRequestMap(Map requestMap) {
        this.requestMap = requestMap;
    }

    public Map getResponseMap() {
        return responseMap;
    }

    public void setResponseMap(Map responseMap) {
        this.responseMap = responseMap;
    }

    public String getRet_code() {
        return ret_code;
    }

    public void setRet_code(String ret_code) {
        this.ret_code = ret_code;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
}
