package de.GhostMod;

import de.GhostMod.block.ModBlocks;
import de.GhostMod.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import de.GhostMod.item.ModItems;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.text.html.parser.Entity;

// Very important comment
public class Main implements ModInitializer {
    public static final String MOD_ID = "ghostmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {


        ModItemGroups.registerItemGroups();
        ModBlocks.registerBlocks();
        ModItems.registerModItems();

    }


}