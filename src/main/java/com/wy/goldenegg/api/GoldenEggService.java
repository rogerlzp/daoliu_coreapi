package com.wy.goldenegg.api;

import com.wy.common.annotation.Role;
import com.wy.goldenegg.dto.GoldenEggEnter;
import com.wy.goldenegg.dto.GoldenEggResult;

/**
 * 
 * Created by zhanggt on 2015-12-23.
 * 
 */
public interface GoldenEggService {

	// public void incr(long userId, int generalChance, int certainlyChance,
	// String goldenEggDate);
	@Role
	public GoldenEggResult get(GoldenEggEnter goldenEnter);

	@Role
	public GoldenEggResult submit(GoldenEggEnter goldenEnter);

	public void distributionBonus(String yesterday, long goldenEggWinningCount, Double realityBonusPool);

	public void addGoldenEgg(long userId, String bizType, String bizId, String winningType);

}
