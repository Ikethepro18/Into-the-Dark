package ike.itd.datagen;

import ike.itd.item.ModItems;
import ike.itd.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    // Add items to tags
    // This will automatically create the required JSON files at build (or runtime I'm not entirely sure) to avoid having to create them manually
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        // Specify the tag
        getOrCreateTagBuilder(ModTags.Items.FOUND_ON_MOON)
                // List the items to add to the tag
                .add(ModItems.CHEESE)
                .add(ModItems.MOON_DUST);

    }
}
