package com.skitbet.flamethrowermod;

import com.skitbet.flamethrowermod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlameThrowerMod implements ModInitializer {
	public static final String FLAMETHROWER = "flamethrower";

	public static final Logger LOGGER = LoggerFactory.getLogger(FLAMETHROWER);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
