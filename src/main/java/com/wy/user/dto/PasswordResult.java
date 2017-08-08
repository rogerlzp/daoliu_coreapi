package com.wy.user.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralResult;

/**
 * ClassName: PasswordResult 
 * @Description: return result that update password
 * @author Ciro
 * @date 2015-11-25
 */

public class PasswordResult  extends GeneralResult implements Serializable {

	/**
	 * @Fields serialVersionUID : Verify version consistency
	 */
	private static final long serialVersionUID = 6014650827260754186L;
	private String newPwd;
	public String getNewPwd() {
		return newPwd;
	}
	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
	
}
