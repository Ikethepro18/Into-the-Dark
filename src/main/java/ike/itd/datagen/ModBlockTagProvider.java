package ike.itd.datagen;

import ike.itd.block.ModBlocks;
import ike.itd.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    // Add blocks to tags
    // This will automatically create the required JSON files at build (or runtime I'm not entirely sure) to avoid having to create them manually
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        // Specify the tag
        getOrCreateTagBuilder(ModTags.Blocks.FOUND_ON_MOON)
                // List the blocks to add to the tag
                .add(ModBlocks.CHEESE_WHEEL)
                .add(ModBlocks.MOON_DUST_BLOCK);
    }
}
