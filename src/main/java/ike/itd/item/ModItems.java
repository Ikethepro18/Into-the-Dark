package ike.itd.item;

import ike.itd.IntoTheDark;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

// Defining items as existing, so they can be registered with the game
// Adding a new item is as simple as ctrl + c, ctrl + v and then ctrl + h
public class ModItems {
    public static final Item MOON_DUST = registerItem("moon_dust", new Item(new FabricItemSettings()));

    // Add items listed to the Ingredient tab of the creative inventory
    // This method of adding items should only really be used to add them to other people's tab groups like vanilla ones
    // For custom tab groups see ModItemGroups where you can just directly list the group contents
    private static void addItemsToIngredientTabGroup(FabricItemGroupEntries entries)  {
        entries.add(MOON_DUST);
    }

    // Register the items with the game
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(IntoTheDark.MOD_ID, name), item );
    }

    // Runs when the game launches
    public static void registerModItems() {
        // Logs in the console that items are being registered
        IntoTheDark.LOGGER.info("Registering Items...");

        // Executes the previous function to add items to the tab group, thusly actually adding them to the tab on game launch
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabGroup);
    }
}
