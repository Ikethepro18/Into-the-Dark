package ike.itd.datagen;

import ike.itd.block.ModBlocks;
import ike.itd.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    // This can generate all of your recipe JSONs
    // This shit is fire if you have a lot of very similar recipes or something like diamonds to diamond block and back
    // But it can also be used for other custom recipes, so everything can be in one place
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOON_DUST_BLOCK, 1)
                .pattern("DD")
                .pattern("DD")
                .input('D', ModItems.MOON_DUST)
                .criterion(hasItem(ModItems.MOON_DUST), conditionsFromItem(ModItems.MOON_DUST))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOON_DUST_BLOCK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHEESE_WHEEL, 1)
                .pattern("HHH")
                .pattern("HCH")
                .pattern("HHH")
                .input('H', Items.HONEYCOMB)
                .input('C', ModItems.CHEESE)
                .criterion(hasItem(ModItems.CHEESE), conditionsFromItem(ModItems.CHEESE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHEESE_WHEEL)));
    }
}
