package ike.itd.block;

import ike.itd.IntoTheDark;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block MOON_DUST_BLOCK = registerBlock("moon_dust_block",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY)));

    public static final Block CHEESE_WHEEL = registerBlock("cheese_wheel",
            new Block(FabricBlockSettings.copyOf(Blocks.MUSHROOM_STEM)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(IntoTheDark.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(IntoTheDark.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        IntoTheDark.LOGGER.info("Registering Blocks...");
    }
}