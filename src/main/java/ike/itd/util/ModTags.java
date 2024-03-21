package ike.itd.util;

import ike.itd.IntoTheDark;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        // Moon block tag to identify blocks found on the moon
        // Purely cosmetic but someone might have a use for it
        public static final TagKey<Block> FOUND_ON_MOON =
                createTag("found_on_moon");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(IntoTheDark.MOD_ID, name));
        }
    }

    public static class Items {
        // Same as above but for items
        public static final TagKey<Item> FOUND_ON_MOON =
                createTag("found_on_moon");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(IntoTheDark.MOD_ID, name));
        }
    }
}
