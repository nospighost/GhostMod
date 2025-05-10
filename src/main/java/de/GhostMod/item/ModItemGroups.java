package de.GhostMod.item;

import de.GhostMod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import de.GhostMod.Main; // Import der GhostMod-Klasse
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Main.MOD_ID, "g"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ZINK_INGOT))
                    .displayName(Text.translatable("erzbloecke"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ZINK_INGOT);
                        entries.add(ModItems.RAWZINK_INGOT);
                        entries.add(ModBlocks.ZINK_BLOCK);
                        entries.add(ModBlocks.RAW_ZINK_BLOCK);
                        entries.add(ModBlocks.MAGIC_BLOCK);
                        entries.add(ModBlocks.ZINK_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ZINK_ORE);
                    }).build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Main.MOD_ID, "ghost"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.ZINK_BLOCK))
                    .displayName(Text.translatable("Erze"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ZINK_BLOCK);
                        entries.add(ModBlocks.RAW_ZINK_BLOCK);
                    }).build());


    public static void registerItemGroups() {
        Main.LOGGER.info("Registering Item Groups for " + Main.MOD_ID);
    }
}