package com.wy.goldenegg.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralEnter;

/**
 * 
 * Created by zhanggt on 2015-12-23.
 * 
 */
public class GoldenEggEnter extends GeneralEnter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7318829275239759621L;

	public static final String CERTAINLY_CHANCE = "BZ";

	public static final String GENERAL_CHANCE = "FBZ";

	/**
	 * 1-必中 0-非必中
	 */
	private String golden_egg_type;

	private boolean homepage;

	public String getGolden_egg_type() {
		return golden_egg_type;
	}

	public void setGolden_egg_type(String golden_egg_type) {
		this.golden_egg_type = golden_egg_type;
	}

	public boolean isHomepage() {
		return homepage;
	}

	public void setHomepage(boolean homepage) {
		this.homepage = homepage;
	}

}
