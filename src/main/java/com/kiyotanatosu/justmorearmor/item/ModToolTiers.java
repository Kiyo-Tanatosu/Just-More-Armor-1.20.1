package com.kiyotanatosu.justmorearmor.item;

import com.kiyotanatosu.justmorearmor.JustMoreArmor;
import com.kiyotanatosu.justmorearmor.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;


public class ModToolTiers {
    public static final Tier ENDERITE = TierSortingRegistry.registerTier(
            new ForgeTier(5,3000, 11f, 5f, 20,
                    ModTags.Blocks.NEEDS_ENDERITE_TOOL, () -> Ingredient.of(ModItems.ENDERITE_INGOT.get())),
            new ResourceLocation(JustMoreArmor.MOD_ID, "enderite"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier EMERALD = TierSortingRegistry.registerTier(
            new ForgeTier(3,1561, 8f, 3f, 10,
                    BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.EMERALD)),
            new ResourceLocation(JustMoreArmor.MOD_ID, "emerald"), List.of(Tiers.IRON), List.of());

    public static final Tier COPPER = TierSortingRegistry.registerTier(
            new ForgeTier(2,200, 6f, 2f, 14,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(JustMoreArmor.MOD_ID, "copper"), List.of(Tiers.STONE), List.of());

    public static final Tier PRISMARINE = TierSortingRegistry.registerTier(
            new ForgeTier(3,1561, 8f, 3f, 15,
                    BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.PRISMARINE)),
            new ResourceLocation(JustMoreArmor.MOD_ID, "prismarine"), List.of(Tiers.IRON), List.of());
}
