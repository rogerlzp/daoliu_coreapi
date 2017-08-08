package com.wy.log.dto;

import com.wy.common.model.GeneralEnter;

/**
 * 
 * Created by zhanggt on 2016-1-26.
 * 
 */
public class InterfaceLog extends GeneralEnter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2699157354418267322L;

	private String uri;
	private long request_timestamp;
	private String request_time;
	private String request_header;
	private String request_body;
	private String method;
	private String response_header;
	private String response_body;
	private long response_timestamp;
	private String response_time;
	private String exception;
	private String version;
	private long user_id;

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public long getRequest_timestamp() {
		return request_timestamp;
	}

	public void setRequest_timestamp(long request_timestamp) {
		this.request_timestamp = request_timestamp;
	}

	public String getRequest_time() {
		return request_time;
	}

	public void setRequest_time(String request_time) {
		this.request_time = request_time;
	}

	public String getRequest_header() {
		return request_header;
	}

	public void setRequest_header(String request_header) {
		this.request_header = request_header;
	}

	public String getRequest_body() {
		return request_body;
	}

	public void setRequest_body(String request_body) {
		this.request_body = request_body;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getResponse_header() {
		return response_header;
	}

	public void setResponse_header(String response_header) {
		this.response_header = response_header;
	}

	public String getResponse_body() {
		return response_body;
	}

	public void setResponse_body(String response_body) {
		this.response_body = response_body;
	}

	public long getResponse_timestamp() {
		return response_timestamp;
	}

	public void setResponse_timestamp(long response_timestamp) {
		this.response_timestamp = response_timestamp;
	}

	public String getResponse_time() {
		return response_time;
	}

	public void setResponse_time(String response_time) {
		this.response_time = response_time;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "InterfaceLog [uri=" + uri + ", request_timestamp=" + request_timestamp + ", request_time=" + request_time
				+ ", request_header=" + request_header + ", request_body=" + request_body + ", method=" + method + ", response_header="
				+ response_header + ", response_body=" + response_body + ", response_timestamp=" + response_timestamp + ", response_time="
				+ response_time + ", exception=" + exception + ", version=" + version + ", user_id=" + user_id + ", getSessionKey()="
				+ getSessionKey() + "]";
	}

}
