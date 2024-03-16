package ike.itd.item;

import ike.itd.IntoTheDark;
import ike.itd.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

// Creating custom item groups
public class ModItemGroups {
    public static final ItemGroup INTO_THE_DARK = Registry.register(Registries.ITEM_GROUP,
            new Identifier(IntoTheDark.MOD_ID, "into_the_dark"),
            // Setting up the translation key to give it a name in assets\lang
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.itd"))
                    // Setting the icon
                    // This sets it to Moon Dust, but that can quickly and easily be swapped with any item in the mod
                    .icon(() -> new ItemStack(ModItems.MOON_DUST)).entries((displayContext, entries) -> {
                        // List the items in the tab group
                        // You can use Items.{vanilla item} to add vanilla items to the group, if you see fit
                        // Remember, the first thing listed is the first thing in the group
                        entries.add(ModItems.CHEESE);
                        entries.add(ModBlocks.MOON_DUST_BLOCK);
                        entries.add(ModItems.MOON_DUST);

                    }).build());

    public static void registerItemGroups() {
        IntoTheDark.LOGGER.info("Registering Custom Item Groups...");
    }
}
