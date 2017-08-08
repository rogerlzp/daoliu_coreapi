package com.wy.user.dto;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
/**
 * @author wangdejun
 *
 */
public class Information implements Serializable{
	private static final long serialVersionUID = 2823903533643447154L;
	private Integer id;//编号
	private String type;//分类
	private String keyno;//关键字
	private String value;//内容
	@JSONField(format = "yyyy-MM-dd")
	private Date createDate;
	@JSONField(format = "yyyy-MM-dd")
	private Date updateDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getKeyno() {
		return keyno;
	}
	public void setKeyno(String keyno) {
		this.keyno = keyno;
	}
	
}
