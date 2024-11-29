package com.kiyotanatosu.justmorearmor.datagen;

import com.kiyotanatosu.justmorearmor.JustMoreArmor;
import com.kiyotanatosu.justmorearmor.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, JustMoreArmor.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ENDERITE_HELMET.get(),
                        ModItems.ENDERITE_CHESTPLATE.get(),
                        ModItems.ENDERITE_LEGGINGS.get(),
                        ModItems.ENDERITE_BOOTS.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.EMERALD_HELMET.get(),
                        ModItems.EMERALD_CHESTPLATE.get(),
                        ModItems.EMERALD_LEGGINGS.get(),
                        ModItems.EMERALD_BOOTS.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.COPPER_HELMET.get(),
                        ModItems.COPPER_CHESTPLATE.get(),
                        ModItems.COPPER_LEGGINGS.get(),
                        ModItems.COPPER_BOOTS.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.PRISMARINE_HELMET.get(),
                        ModItems.PRISMARINE_CHESTPLATE.get(),
                        ModItems.PRISMARINE_LEGGINGS.get(),
                        ModItems.PRISMARINE_BOOTS.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.HELLSTONE_HELMET.get(),
                        ModItems.HELLSTONE_CHESTPLATE.get(),
                        ModItems.HELLSTONE_LEGGINGS.get(),
                        ModItems.HELLSTONE_BOOTS.get());

    }
}
