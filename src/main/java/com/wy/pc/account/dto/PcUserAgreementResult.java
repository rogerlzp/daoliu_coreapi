package com.wy.pc.account.dto;

import java.io.Serializable;
import java.util.Date;

import com.wy.common.model.GeneralResult;

public class PcUserAgreementResult extends GeneralResult implements Serializable{
	private static final long serialVersionUID = 6555554298618212866L;
	
	private Integer id;
	private Long userId;
	private String status;
	private String errorMsg;//ERROR_MSG
	private String agreementCZ;//充值
	private String agreementTZ;//投资
	private Date  operateDate;
	private Date  createDate;
	private Date  updateDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getAgreementCZ() {
		return agreementCZ;
	}
	public void setAgreementCZ(String agreementCZ) {
		this.agreementCZ = agreementCZ;
	}
	public String getAgreementTZ() {
		return agreementTZ;
	}
	public void setAgreementTZ(String agreementTZ) {
		this.agreementTZ = agreementTZ;
	}
	public Date getOperateDate() {
		return operateDate;
	}
	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
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
}
