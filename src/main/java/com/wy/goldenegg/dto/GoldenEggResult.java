package com.wy.goldenegg.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralResult;

/**
 * 
 * Created by zhanggt on 2015-12-23.
 * 
 */
public class GoldenEggResult extends GeneralResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7553641177318229274L;

	private int general_chance;

	private int certainly_chance;

	private long yesterday_total_user;

	private double yesterday_bonus_average;

	private int has_golden_egg;

	private short is_winning;

	private double winning_amount;

	private int golden_egg_activity_switch;

	private int golden_egg_activity_is_popup = 1;

	private String url;

	public GoldenEggResult() {
		super();
	}

	public GoldenEggResult(int general_chance, int certainly_chance, int yesterday_total_user, double yesterday_bonus_average) {
		this.general_chance = general_chance;
		this.certainly_chance = certainly_chance;
		this.yesterday_total_user = yesterday_total_user;
		this.yesterday_bonus_average = yesterday_bonus_average;
	}

	public GoldenEggResult(int general_chance, int certainly_chance) {
		super();
		this.general_chance = general_chance;
		this.certainly_chance = certainly_chance;
	}

	public int getGeneral_chance() {
		return general_chance;
	}

	public void setGeneral_chance(int general_chance) {
		this.general_chance = general_chance;
	}

	public int getCertainly_chance() {
		return certainly_chance;
	}

	public void setCertainly_chance(int certainly_chance) {
		this.certainly_chance = certainly_chance;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public long getYesterday_total_user() {
		return yesterday_total_user;
	}

	public void setYesterday_total_user(long yesterday_total_user) {
		this.yesterday_total_user = yesterday_total_user;
	}

	public double getYesterday_bonus_average() {
		return yesterday_bonus_average;
	}

	public void setYesterday_bonus_average(double yesterday_bonus_average) {
		this.yesterday_bonus_average = yesterday_bonus_average;
	}

	public int getHas_golden_egg() {
		if (this.certainly_chance > 0 || this.general_chance > 0) {
			return 1;
		}
		return 0;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUrl(String drawawardUrl, String sessionKey, String host) {
		this.url = drawawardUrl + "?sessionKey=" + sessionKey + "&host=" + host;
	}

	public short getIs_winning() {
		return is_winning;
	}

	public void setIs_winning(short is_winning) {
		this.is_winning = is_winning;
	}

	public int getGolden_egg_activity_switch() {
		return golden_egg_activity_switch;
	}

	public void setGolden_egg_activity_switch(int golden_egg_activity_switch) {
		this.golden_egg_activity_switch = golden_egg_activity_switch;
	}

	public int getGolden_egg_activity_is_popup() {
		return golden_egg_activity_is_popup;
	}

	public void setGolden_egg_activity_is_popup(int golden_egg_activity_is_popup) {
		this.golden_egg_activity_is_popup = golden_egg_activity_is_popup;
	}

	public double getWinning_amount() {
		return winning_amount;
	}

	public void setWinning_amount(double winning_amount) {
		this.winning_amount = winning_amount;
	}

	@Override
	public String toString() {
		return "GoldenEggResult [general_chance=" + general_chance + ", certainly_chance=" + certainly_chance + ", yesterday_total_user="
				+ yesterday_total_user + ", yesterday_bonus_average=" + yesterday_bonus_average + ", has_golden_egg=" + has_golden_egg
				+ ", is_winning=" + is_winning + ", winning_amount=" + winning_amount + ", golden_egg_activity_switch="
				+ golden_egg_activity_switch + ", golden_egg_activity_is_popup=" + golden_egg_activity_is_popup + ", getGeneral_chance()="
				+ getGeneral_chance() + ", getCertainly_chance()=" + getCertainly_chance() + ", getYesterday_total_user()="
				+ getYesterday_total_user() + ", getYesterday_bonus_average()=" + getYesterday_bonus_average() + ", getHas_golden_egg()="
				+ getHas_golden_egg() + ", getUrl()=" + getUrl() + ", getIs_winning()=" + getIs_winning()
				+ ", getGolden_egg_activity_switch()=" + getGolden_egg_activity_switch() + ", getGolden_egg_activity_is_popup()="
				+ getGolden_egg_activity_is_popup() + ", getWinning_amount()=" + getWinning_amount() + ", getTotalCount()="
				+ getTotalCount() + ", getCode()=" + getCode() + ", getMessage()=" + getMessage() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
