package com.wy.gateway.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;

/**
 * Created by liuyw on 2015/12/14.
 */
public class UmPayTradeResult extends GeneralResult implements Serializable {


	private static final long serialVersionUID = -6232030209887842146L;
	private String sign_type;// 签名方式
	private String sign;// 签名
	private String charset;// 参数字符编码集
	private String res_format;// 响应数据格式
	private String mer_id;// 商户编号
	private String ret_url;// 页面跳转同步通知页面路径
	private String notify_url;// 服务器异步通知页面路径
	private String apply_notify_flag;// 申请成功后台通知标识
	private String version;// 版本号
	private String sourceV;// 视图类型
	private String plain;//
	private String url;//
	private String order_id;//
	private String mer_date;//
	private String trade_no;//
	private String mer_check_date;//
	private String balance;//


	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public UmPayTradeResult(String code) {
		super(code);
	}

	public UmPayTradeResult() {
		super();
	}

	public UmPayTradeResult(String code, String message, Integer totalCount) {
		super(code, message, totalCount);
	}

	public UmPayTradeResult(String code, String message) {
		super(code, message);
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getMer_date() {
		return mer_date;
	}

	public void setMer_date(String mer_date) {
		this.mer_date = mer_date;
	}

	public String getTrade_no() {
		return trade_no;
	}

	public void setTrade_no(String trade_no) {
		this.trade_no = trade_no;
	}

	public String getMer_check_date() {
		return mer_check_date;
	}

	public void setMer_check_date(String mer_check_date) {
		this.mer_check_date = mer_check_date;
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

	public String getSign_type() {
		return sign_type;
	}

	public void setSign_type(String sign_type) {
		this.sign_type = sign_type;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getRes_format() {
		return res_format;
	}

	public void setRes_format(String res_format) {
		this.res_format = res_format;
	}

	public String getMer_id() {
		return mer_id;
	}

	public void setMer_id(String mer_id) {
		this.mer_id = mer_id;
	}

	public String getRet_url() {
		return ret_url;
	}

	public void setRet_url(String ret_url) {
		this.ret_url = ret_url;
	}

	public String getNotify_url() {
		return notify_url;
	}

	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
	}

	public String getApply_notify_flag() {
		return apply_notify_flag;
	}

	public void setApply_notify_flag(String apply_notify_flag) {
		this.apply_notify_flag = apply_notify_flag;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSourceV() {
		return sourceV;
	}

	public void setSourceV(String sourceV) {
		this.sourceV = sourceV;
	}

	@Override
	public String toString() {
		return "UmPayTradeResult [sign_type=" + sign_type + ", sign=" + sign + ", charset=" + charset + ", res_format=" + res_format
				+ ", mer_id=" + mer_id + ", ret_url=" + ret_url + ", notify_url=" + notify_url + ", apply_notify_flag=" + apply_notify_flag
				+ ", version=" + version + ", sourceV=" + sourceV + ", plain=" + plain + ", url=" + url + ", order_id=" + order_id
				+ ", mer_date=" + mer_date + ", trade_no=" + trade_no + ", mer_check_date=" + mer_check_date + "]";
	}

}
