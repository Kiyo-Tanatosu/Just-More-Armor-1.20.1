package com.kiyotanatosu.justmorearmor.datagen;

import com.kiyotanatosu.justmorearmor.JustMoreArmor;
import com.kiyotanatosu.justmorearmor.block.ModBlocks;
import com.kiyotanatosu.justmorearmor.item.ModToolTiers;
import com.kiyotanatosu.justmorearmor.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, JustMoreArmor.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ENDERITE_ORE.get())
                .add(ModBlocks.ENDERITE_BLOCK.get())
                .add(ModBlocks.ENDERITE_STAIRS.get())
                .add(ModBlocks.ENDERITE_SLAB.get())

                .add(ModBlocks.EMERALD_STAIRS.get())
                .add(ModBlocks.EMERALD_SLAB.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.EMERALD_STAIRS.get())
                .add(ModBlocks.EMERALD_SLAB.get());


    }
}
