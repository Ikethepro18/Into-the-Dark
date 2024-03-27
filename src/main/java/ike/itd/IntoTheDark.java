package ike.itd;

import ike.itd.block.ModBlocks;
import ike.itd.item.ModItemGroups;
import ike.itd.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntoTheDark implements ModInitializer {

	// Creates tje MOD_ID variable allowing the ID to be quickly reference elsewhere
	// Also allows the Mod ID to be changed globally if needed
	public static final String MOD_ID = "itd";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading Into the Dark...");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Into the Dark has loaded, I think");
	}
}