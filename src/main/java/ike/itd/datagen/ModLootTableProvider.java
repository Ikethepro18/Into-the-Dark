package ike.itd.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    // Useful for generating loot tables for simple blocks
    // But I think it's probably easier to just manually make them, the Cheese Wheel was nightmarish enough
    @Override
    public void generate() {

    }
}
