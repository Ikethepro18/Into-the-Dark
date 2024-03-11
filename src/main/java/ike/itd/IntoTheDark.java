package ike.itd;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntoTheDark implements ModInitializer {
	public static final String MOD_ID = "itd";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading Into The Dark... It's cold here");
	}
}