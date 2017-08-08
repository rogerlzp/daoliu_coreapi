package com.wy.wechat.api;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpUserService;

/**
 * Created by zhengpingli on 2017/6/13.
 */
public interface WeixinService {

    /**
     * <pre>
     * 验证消息的确来自微信服务器
     * 详情请见: http://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421135319&token=&lang=zh_CN
     * </pre>
     */
    boolean checkSignatureWrap(String timestamp, String nonce, String signature);

    /**
     * 获取access_token, 不强制刷新access_token
     *
     * @see #getAccessTokenWrap(boolean)
     */
    String getAccessTokenWrap() throws WxErrorException;

    /**
     * <pre>
     * 获取access_token，本方法线程安全
     * 且在多线程同时刷新时只刷新一次，避免超出2000次/日的调用次数上限
     *
     * 另：本service的所有方法都会在access_token过期是调用此方法
     *
     * 程序员在非必要情况下尽量不要主动调用此方法
     *
     * 详情请见: http://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421140183&token=&lang=zh_CN
     * </pre>
     *
     * @param forceRefresh 强制刷新
     */
    String getAccessTokenWrap(boolean forceRefresh) throws WxErrorException;


    /**
     * <pre>
     * 构造第三方使用网站应用授权登录的url
     * 详情请见: <a href="https://open.weixin.qq.com/cgi-bin/showdocument?action=dir_list&t=resource/res_list&verify=1&id=open1419316505&token=&lang=zh_CN">网站应用微信登录开发指南</a>
     * URL格式为：https://open.weixin.qq.com/connect/qrconnect?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect
     * </pre>
     *
     * @param redirectURI 用户授权完成后的重定向链接，无需urlencode, 方法内会进行encode
     * @param scope       应用授权作用域，拥有多个作用域用逗号（,）分隔，网页应用目前仅填写snsapi_login即可
     * @param state       非必填，用于保持请求和回调的状态，授权请求后原样带回给第三方。该参数可用于防止csrf攻击（跨站请求伪造攻击），建议第三方带上该参数，可设置为简单的随机数加session进行校验
     * @return url
     */
    String buildQrConnectUrl(String redirectURI, String scope, String state);

    /**
     * <pre>
     * 构造oauth2授权的url连接
     * 详情请见: http://mp.weixin.qq.com/wiki/index.php?title=网页授权获取用户基本信息
     * </pre>
     *
     * @param redirectURI 用户授权完成后的重定向链接，无需urlencode, 方法内会进行encode
     * @return url
     */
    String oauth2buildAuthorizationUrl(String redirectURI, String scope, String state);

    /**
     * 返回用户相关接口方法的实现类对象，以方便调用其各个接口
     *
     * @return WxMpUserService
     */
    WxMpUserService getUserServiceWrap();


}
