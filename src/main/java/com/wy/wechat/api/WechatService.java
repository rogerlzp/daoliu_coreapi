package com.wy.wechat.api;

import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.result.WxMpUser;

import java.io.IOException;
import java.util.List;

/**
 * Created by zhengpingli on 2017/6/15.
 */
public interface WechatService {


    /**
     * 刷新消息路由器
     */
    void refreshRouter();

    /**
     * 路由消息
     *
     * @param inMessage
     * @return
     */
    WxMpXmlOutMessage route(WxMpXmlMessage inMessage);

    /**
     * 通过openid获得基本用户信息
     *
     * @param openid
     * @param lang
     * @return
     */
    WxMpUser getUserInfo(String openid, String lang);

}
