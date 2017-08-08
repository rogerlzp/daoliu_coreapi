package com.wy.log.dto;

import java.io.Serializable;

/**
 * 
 * Created by zhanggt on 2016-1-9.
 * 
 */
public class UmPayLog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6758071026410760303L;
	private String service;
	private String user_id;
	private String product_no;
	private String order_no;
	private String uri;
	private String request_parameter;
	private String response_result;
	private String ret_code;
	private String ret_msg;
	private String request_time;
	private String exception_msg;
	private short sync = 0;

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getProduct_no() {
		return product_no;
	}

	public void setProduct_no(String product_no) {
		this.product_no = product_no;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getRequest_parameter() {
		return request_parameter;
	}

	public void setRequest_parameter(String request_parameter) {
		this.request_parameter = request_parameter;
	}

	public String getResponse_result() {
		return response_result;
	}

	public void setResponse_result(String response_result) {
		this.response_result = response_result;
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

	public String getRequest_time() {
		return request_time;
	}

	public void setRequest_time(String request_time) {
		this.request_time = request_time;
	}

	public String getException_msg() {
		return exception_msg;
	}

	public void setException_msg(String exception_msg) {
		this.exception_msg = exception_msg;
	}

	public short getSync() {
		return sync;
	}

	public void setSync(short sync) {
		this.sync = sync;
	}

	@Override
	public String toString() {
		return "UmPayLog [service=" + service + ", user_id=" + user_id + ", product_no=" + product_no + ", order_no=" + order_no + ", uri="
				+ uri + ", request_parameter=" + request_parameter + ", response_result=" + response_result + ", ret_code=" + ret_code
				+ ", ret_msg=" + ret_msg + ", request_time=" + request_time + ", exception_msg=" + exception_msg + ", sync=" + sync + "]";
	}

}
