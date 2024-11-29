package com.kiyotanatosu.justmorearmor.datagen;

import com.kiyotanatosu.justmorearmor.JustMoreArmor;
import com.kiyotanatosu.justmorearmor.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, JustMoreArmor.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.ENDERITE_ORE);
        blockWithItem(ModBlocks.ENDERITE_BLOCK);

        stairsBlock(((StairBlock) ModBlocks.ENDERITE_STAIRS.get()), blockTexture(ModBlocks.ENDERITE_BLOCK.get()));

        slabBlock(((SlabBlock) ModBlocks.ENDERITE_SLAB.get()), blockTexture(ModBlocks.ENDERITE_BLOCK.get()), blockTexture(ModBlocks.ENDERITE_BLOCK.get()));

        blockWithItem(ModBlocks.HELLSTONE_ORE);
        blockWithItem(ModBlocks.HELLSTONE_BLOCK);

        stairsBlock(((StairBlock) ModBlocks.HELLSTONE_STAIRS.get()), blockTexture(ModBlocks.HELLSTONE_BLOCK.get()));

        slabBlock(((SlabBlock) ModBlocks.HELLSTONE_SLAB.get()), blockTexture(ModBlocks.HELLSTONE_BLOCK.get()), blockTexture(ModBlocks.HELLSTONE_BLOCK.get()));


        stairsBlock(((StairBlock) ModBlocks.EMERALD_STAIRS.get()), blockTexture(Blocks.EMERALD_BLOCK));

        slabBlock(((SlabBlock) ModBlocks.EMERALD_SLAB.get()), blockTexture(Blocks.EMERALD_BLOCK), blockTexture(Blocks.EMERALD_BLOCK));

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}