package ike.itd.item;

import ike.itd.IntoTheDark;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

// Defining items as existing, so they can be registered with the game
// Adding a new item is as simple as ctrl + c, ctrl + v and then ctrl + h
public class ModItems {
    public static final Item MOON_DUST = registerItem("moon_dust", new Item(new FabricItemSettings()));
    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings()));

    // Creates the format for the above to follow
    // I think
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(IntoTheDark.MOD_ID, name), item );
    }

    // Called when the game launches
    // Register items with the game
    public static void registerModItems() {
        // Logs in the console that items are being registered
        IntoTheDark.LOGGER.info("Registering Items...");
    }
}
