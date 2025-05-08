package de.GhostMod;

import de.GhostMod.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import de.GhostMod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class GhostMod implements ModInitializer {
	public static final String MOD_ID = "ghostmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerBlocks();
		ModItems.registerModItems();

	}
}