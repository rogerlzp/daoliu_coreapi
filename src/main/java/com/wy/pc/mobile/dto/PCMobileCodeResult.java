package com.wy.pc.mobile.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;

public class PCMobileCodeResult extends GeneralResult implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -523113377654005528L;


	private String certification;

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}
}
