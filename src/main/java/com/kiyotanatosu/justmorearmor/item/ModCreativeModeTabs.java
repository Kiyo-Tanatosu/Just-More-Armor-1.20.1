package com.kiyotanatosu.justmorearmor.item;

import com.kiyotanatosu.justmorearmor.JustMoreArmor;
import com.kiyotanatosu.justmorearmor.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JustMoreArmor.MOD_ID);

    public static final RegistryObject<CreativeModeTab> JUST_MORE_ARMOR_AND_TOOLS_TAB = CREATIVE_MODE_TABS.register("just_more_armor_and_tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENDERITE_INGOT.get()))
                    .title(Component.translatable("creativetab.just_more_armor_and_tools_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        //Ore
                        output.accept(ModBlocks.ENDERITE_ORE.get());

                        //Blocks
                        output.accept(ModBlocks.ENDERITE_BLOCK.get());

                        //Stairs
                        output.accept(ModBlocks.ENDERITE_STAIRS.get());

                        output.accept(ModBlocks.EMERALD_STAIRS.get());

                        //Slabs
                        output.accept(ModBlocks.ENDERITE_SLAB.get());

                        output.accept(ModBlocks.EMERALD_SLAB.get());

                        //Items
                        output.accept(ModItems.ENDERITE_INGOT.get());
                        output.accept(ModItems.ENDERITE_SCRAP.get());

                        //Tools
                        output.accept(ModItems.ENDERITE_SWORD.get());
                        output.accept(ModItems.ENDERITE_PICKAXE.get());
                        output.accept(ModItems.ENDERITE_AXE.get());
                        output.accept(ModItems.ENDERITE_SHOVEL.get());
                        output.accept(ModItems.ENDERITE_HOE.get());

                        output.accept(ModItems.EMERALD_SWORD.get());
                        output.accept(ModItems.EMERALD_PICKAXE.get());
                        output.accept(ModItems.EMERALD_AXE.get());
                        output.accept(ModItems.EMERALD_SHOVEL.get());
                        output.accept(ModItems.EMERALD_HOE.get());

                        output.accept(ModItems.COPPER_SWORD.get());
                        output.accept(ModItems.COPPER_PICKAXE.get());
                        output.accept(ModItems.COPPER_AXE.get());
                        output.accept(ModItems.COPPER_SHOVEL.get());
                        output.accept(ModItems.COPPER_HOE.get());

                        output.accept(ModItems.PRISMARINE_SWORD.get());
                        output.accept(ModItems.PRISMARINE_PICKAXE.get());
                        output.accept(ModItems.PRISMARINE_AXE.get());
                        output.accept(ModItems.PRISMARINE_SHOVEL.get());
                        output.accept(ModItems.PRISMARINE_HOE.get());

                        //Armor
                        output.accept(ModItems.ENDERITE_HELMET.get());
                        output.accept(ModItems.ENDERITE_CHESTPLATE.get());
                        output.accept(ModItems.ENDERITE_LEGGINGS.get());
                        output.accept(ModItems.ENDERITE_BOOTS.get());

                        output.accept(ModItems.EMERALD_HELMET.get());
                        output.accept(ModItems.EMERALD_CHESTPLATE.get());
                        output.accept(ModItems.EMERALD_LEGGINGS.get());
                        output.accept(ModItems.EMERALD_BOOTS.get());

                        output.accept(ModItems.COPPER_HELMET.get());
                        output.accept(ModItems.COPPER_CHESTPLATE.get());
                        output.accept(ModItems.COPPER_LEGGINGS.get());
                        output.accept(ModItems.COPPER_BOOTS.get());

                        output.accept(ModItems.PRISMARINE_HELMET.get());
                        output.accept(ModItems.PRISMARINE_CHESTPLATE.get());
                        output.accept(ModItems.PRISMARINE_LEGGINGS.get());
                        output.accept(ModItems.PRISMARINE_BOOTS.get());


                    })
                    .build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
