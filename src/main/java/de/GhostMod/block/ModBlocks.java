package de.GhostMod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import de.GhostMod.GhostMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ZINK_BLOCK = registerBlock("zink_block", new Block(AbstractBlock.Settings.create().strength(0.2f)
            .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block RAW_ZINK_BLOCK = registerBlock("raw_zink_block", new Block(AbstractBlock.Settings.create().strength(0.1f)
            .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));
    private static Block registerBlock(String name, Block block) {
        GhostMod.LOGGER.info("Zink Block successfully registered");

        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GhostMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GhostMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks() {
        GhostMod.LOGGER.info("Registering Mod Blocks for " + GhostMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ZINK_BLOCK);
            entries.add(RAW_ZINK_BLOCK);
        });
    }
}
