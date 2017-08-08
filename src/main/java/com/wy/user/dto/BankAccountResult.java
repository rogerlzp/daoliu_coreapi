package com.wy.user.dto;
import com.wy.common.model.GeneralResult;

/**
 * @author wangdejun
 *
 */
public class BankAccountResult extends GeneralResult {
	private static final long serialVersionUID = 2395676555023075120L;
	private String id;//银行卡申请编号
	private String tag;//状态
	private String remark;//标记
	private String memo;//备注
	private String check;//0更换银行卡，1查询换卡进度 
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
}
