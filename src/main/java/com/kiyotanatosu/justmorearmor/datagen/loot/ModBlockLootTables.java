package com.kiyotanatosu.justmorearmor.datagen.loot;

import com.kiyotanatosu.justmorearmor.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ENDERITE_ORE.get());
        this.dropSelf(ModBlocks.ENDERITE_BLOCK.get());
        this.dropSelf(ModBlocks.ENDERITE_STAIRS.get());
        this.add(ModBlocks.ENDERITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ENDERITE_SLAB.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
