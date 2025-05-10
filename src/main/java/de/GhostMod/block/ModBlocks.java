package de.GhostMod.block;

import de.GhostMod.block.custom.MagicBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import de.GhostMod.Main;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block ZINK_ORE = registerBlock("zink_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));
    public static final Block DEEPSLATE_ZINK_ORE = registerBlock("deepslate_zink_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block ZINK_BLOCK = registerBlock("zink_block", new Block(AbstractBlock.Settings.create().strength(0.2f)
            .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));
    public static final Block MAGIC_BLOCK = registerBlock("magic_block",
            new MagicBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));


    public static final Block RAW_ZINK_BLOCK = registerBlock("raw_zink_block", new Block(AbstractBlock.Settings.create().strength(0.1f)
            .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    private static Block registerBlock(String name, Block block) {
        Main.LOGGER.info("Zink Block successfully registered");

        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Main.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Main.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks() {
        Main.LOGGER.info("Registering Mod Blocks for " + Main.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ZINK_BLOCK);
            entries.add(RAW_ZINK_BLOCK);
            entries.add(ZINK_ORE);
            entries.add(DEEPSLATE_ZINK_ORE);
            entries.add(MAGIC_BLOCK);
        });
    }
}
