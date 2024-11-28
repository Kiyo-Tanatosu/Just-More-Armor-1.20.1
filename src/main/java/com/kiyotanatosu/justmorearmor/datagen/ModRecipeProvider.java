package com.kiyotanatosu.justmorearmor.datagen;

import com.kiyotanatosu.justmorearmor.JustMoreArmor;
import com.kiyotanatosu.justmorearmor.block.ModBlocks;
import com.kiyotanatosu.justmorearmor.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> ENDERITE_ORE_SMELTABLES = List.of(ModItems.ENDERITE_SCRAP.get(),
            ModBlocks.ENDERITE_ORE.get());


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        //Smeltables
        oreBlasting(pWriter, ENDERITE_ORE_SMELTABLES, RecipeCategory.MISC, ModItems.ENDERITE_SCRAP.get(), 1f, 100, "enderite_scrap");
        oreSmelting(pWriter, ENDERITE_ORE_SMELTABLES, RecipeCategory.MISC, ModItems.ENDERITE_SCRAP.get(), 1f, 200, "enderite_scrap");

        //Items
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_INGOT.get())
                .pattern("CCC")
                .pattern("CSS")
                .pattern("SS ")
                .define('C', ModItems.ENDERITE_SCRAP.get())
                .define('S', Items.DIAMOND)
                .unlockedBy(getHasName(ModItems.ENDERITE_SCRAP.get()), has(ModItems.ENDERITE_SCRAP.get()))
                .save(pWriter);

        //Blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENDERITE_BLOCK.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModItems.ENDERITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);

        //Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENDERITE_STAIRS.get(), 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .define('C', ModBlocks.ENDERITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ENDERITE_BLOCK.get()), has(ModBlocks.ENDERITE_BLOCK.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EMERALD_STAIRS.get(), 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .define('C', Blocks.EMERALD_BLOCK)
                .unlockedBy(getHasName(Blocks.EMERALD_BLOCK), has(Blocks.EMERALD_BLOCK))
                .save(pWriter);

        //Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENDERITE_SLAB.get(), 2)
                .pattern("   ")
                .pattern("   ")
                .pattern("CCC")
                .define('C', ModBlocks.ENDERITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ENDERITE_BLOCK.get()), has(ModBlocks.ENDERITE_BLOCK.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EMERALD_SLAB.get(), 2)
                .pattern("   ")
                .pattern("   ")
                .pattern("CCC")
                .define('C', Blocks.EMERALD_BLOCK)
                .unlockedBy(getHasName(Blocks.EMERALD_BLOCK), has(Blocks.EMERALD_BLOCK))
                .save(pWriter);

        //Tools
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_SWORD.get())
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" S ")
                .define('C', ModItems.ENDERITE_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_PICKAXE.get())
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .define('C', ModItems.ENDERITE_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_AXE.get())
                .pattern("CC ")
                .pattern("CS ")
                .pattern(" S ")
                .define('C', ModItems.ENDERITE_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_SHOVEL.get())
                .pattern(" C ")
                .pattern(" S ")
                .pattern(" S ")
                .define('C', ModItems.ENDERITE_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_HOE.get())
                .pattern("CC ")
                .pattern(" S ")
                .pattern(" S ")
                .define('C', ModItems.ENDERITE_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_SWORD.get())
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" S ")
                .define('C', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_PICKAXE.get())
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .define('C', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_AXE.get())
                .pattern("CC ")
                .pattern("CS ")
                .pattern(" S ")
                .define('C', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_SHOVEL.get())
                .pattern(" C ")
                .pattern(" S ")
                .pattern(" S ")
                .define('C', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_HOE.get())
                .pattern("CC ")
                .pattern(" S ")
                .pattern(" S ")
                .define('C', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        //Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_HELMET.get())
                .pattern("CNC")
                .pattern("C C")
                .pattern("   ")
                .define('C', ModItems.ENDERITE_INGOT.get())
                .define('N', Items.ENDER_EYE)
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_CHESTPLATE.get())
                .pattern("C C")
                .pattern("CNC")
                .pattern("CCC")
                .define('C', ModItems.ENDERITE_INGOT.get())
                .define('N', Items.NETHER_STAR)
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_LEGGINGS.get())
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .define('C', ModItems.ENDERITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_BOOTS.get())
                .pattern("C C")
                .pattern("C C")
                .pattern("   ")
                .define('C', ModItems.ENDERITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.ENDERITE_INGOT.get()), has(ModItems.ENDERITE_INGOT.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_HELMET.get())
                .pattern("CCC")
                .pattern("C C")
                .pattern("   ")
                .define('C', Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_CHESTPLATE.get())
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_LEGGINGS.get())
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .define('C', Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_BOOTS.get())
                .pattern("C C")
                .pattern("C C")
                .pattern("   ")
                .define('C', Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

    }


    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }


    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, JustMoreArmor.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

        
    }
}