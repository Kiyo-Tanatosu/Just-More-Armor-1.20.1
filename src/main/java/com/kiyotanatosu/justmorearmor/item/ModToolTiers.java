package com.kiyotanatosu.justmorearmor.item;

import com.kiyotanatosu.justmorearmor.JustMoreArmor;
import com.kiyotanatosu.justmorearmor.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;


public class ModToolTiers {
    public static final Tier ENDERITE = TierSortingRegistry.registerTier(
            new ForgeTier(5,3000, 11f, 5f, 20,
                    ModTags.Blocks.NEEDS_ENDERITE_TOOL, () -> Ingredient.of(ModItems.ENDERITE_INGOT.get())),
            new ResourceLocation(JustMoreArmor.MOD_ID, "enderite"), List.of(Tiers.NETHERITE), List.of());
}