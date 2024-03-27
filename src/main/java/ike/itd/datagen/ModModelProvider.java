package ike.itd.datagen;

import ike.itd.block.ModBlocks;
import ike.itd.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    // Used to automatically generate block model JSON files
    // This bad boy even makes the item JSONs required too, isn't technology just great
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // This is just the simple models, so just copy and paste for those
        // If you're trying anything more complicated than that Ike, I am very concerned, and you should go worship Kaupenjoe quickly
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHEESE_WHEEL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOON_DUST_BLOCK);
    }

    // Used to automatically generate item model JSON files
    // Works great for simple shit like basic 2D items, which is all I plan on using
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Just follow the same format and you'll be reyt
        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOON_DUST, Models.GENERATED);
    }
}
