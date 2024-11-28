package com.kiyotanatosu.justmorearmor.item;

import com.kiyotanatosu.justmorearmor.JustMoreArmor;
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

                        //Items
                        output.accept(ModItems.ENDERITE_INGOT.get());
                        output.accept(ModItems.ENDERITE_SCRAP.get());

                        //Tools
                        output.accept(ModItems.ENDERITE_SWORD.get());
                        output.accept(ModItems.ENDERITE_PICKAXE.get());
                        output.accept(ModItems.ENDERITE_AXE.get());
                        output.accept(ModItems.ENDERITE_SHOVEL.get());
                        output.accept(ModItems.ENDERITE_HOE.get());

                        //Armor
                        output.accept(ModItems.ENDERITE_HELMET.get());
                        output.accept(ModItems.ENDERITE_CHESTPLATE.get());
                        output.accept(ModItems.ENDERITE_LEGGINGS.get());
                        output.accept(ModItems.ENDERITE_BOOTS.get());

                    })
                    .build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
