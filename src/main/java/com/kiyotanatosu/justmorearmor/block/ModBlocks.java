package com.kiyotanatosu.justmorearmor.block;

import com.kiyotanatosu.justmorearmor.JustMoreArmor;
import com.kiyotanatosu.justmorearmor.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JustMoreArmor.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> ENDERITE_BLOCK = registerBlock("enderite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> HELLSTONE_BLOCK = registerBlock("hellstone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    //Stairs
    public static final RegistryObject<Block> ENDERITE_STAIRS = registerBlock("enderite_stairs",
            () -> new StairBlock(() -> ModBlocks.ENDERITE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> EMERALD_STAIRS = registerBlock("emerald_stairs",
            () -> new StairBlock(() -> Blocks.EMERALD_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> HELLSTONE_STAIRS = registerBlock("hellstone_stairs",
            () -> new StairBlock(() -> ModBlocks.HELLSTONE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    //Slabs
    public static final RegistryObject<Block> ENDERITE_SLAB = registerBlock("enderite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> EMERALD_SLAB = registerBlock("emerald_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> HELLSTONE_SLAB = registerBlock("hellstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.HELLSTONE_BLOCK.get())));

    //Ore
    public static final RegistryObject<Block> ENDERITE_ORE = registerBlock("enderite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(5, 2000).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> HELLSTONE_ORE = registerBlock("hellstone_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(5, 2000).requiresCorrectToolForDrops()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
