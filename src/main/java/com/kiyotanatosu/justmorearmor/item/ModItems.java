package com.kiyotanatosu.justmorearmor.item;

import com.kiyotanatosu.justmorearmor.JustMoreArmor;
import com.kiyotanatosu.justmorearmor.item.custom.*;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JustMoreArmor.MOD_ID);

    //Items
    public static final RegistryObject<Item> ENDERITE_INGOT = ITEMS.register("enderite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDERITE_SCRAP = ITEMS.register("enderite_scrap",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> HELLSTONE_INGOT = ITEMS.register("hellstone_ingot",
            () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> HELLSTONE = ITEMS.register("hellstone",
            () -> new Item(new Item.Properties().fireResistant()));


    //Tools
    public static final RegistryObject<Item> ENDERITE_SWORD = ITEMS.register("enderite_sword",
            () -> new SwordItem(ModToolTiers.ENDERITE, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> ENDERITE_PICKAXE = ITEMS.register("enderite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ENDERITE, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> ENDERITE_AXE = ITEMS.register("enderite_axe",
            () -> new AxeItem(ModToolTiers.ENDERITE, 5, -3f, new Item.Properties()));

    public static final RegistryObject<Item> ENDERITE_SHOVEL = ITEMS.register("enderite_shovel",
            () -> new ShovelItem(ModToolTiers.ENDERITE, 1, -3f, new Item.Properties()));

    public static final RegistryObject<Item> ENDERITE_HOE = ITEMS.register("enderite_hoe",
            () -> new HoeItem(ModToolTiers.ENDERITE, -4, 0f, new Item.Properties()));


    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(ModToolTiers.EMERALD, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EMERALD, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ModToolTiers.EMERALD, 5, -3f, new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ModToolTiers.EMERALD, 1, -3f, new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ModToolTiers.EMERALD, -3, 0f, new Item.Properties()));


    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModToolTiers.COPPER, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COPPER, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModToolTiers.COPPER, 5, -3f, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModToolTiers.COPPER, 1, -3f, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModToolTiers.COPPER, -3, 0f, new Item.Properties()));


    public static final RegistryObject<Item> PRISMARINE_SWORD = ITEMS.register("prismarine_sword",
            () -> new SwordItem(ModToolTiers.PRISMARINE, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> PRISMARINE_PICKAXE = ITEMS.register("prismarine_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PRISMARINE, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> PRISMARINE_AXE = ITEMS.register("prismarine_axe",
            () -> new AxeItem(ModToolTiers.PRISMARINE, 5, -3f, new Item.Properties()));

    public static final RegistryObject<Item> PRISMARINE_SHOVEL = ITEMS.register("prismarine_shovel",
            () -> new ShovelItem(ModToolTiers.PRISMARINE, 1, -3f, new Item.Properties()));

    public static final RegistryObject<Item> PRISMARINE_HOE = ITEMS.register("prismarine_hoe",
            () -> new HoeItem(ModToolTiers.PRISMARINE, -3, 0f, new Item.Properties()));


    public static final RegistryObject<Item> HELLSTONE_SWORD = ITEMS.register("hellstone_sword",
            () -> new SwordItem(ModToolTiers.ENDERITE, 3, -2.4f, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> HELLSTONE_PICKAXE = ITEMS.register("hellstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ENDERITE, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> HELLSTONE_AXE = ITEMS.register("hellstone_axe",
            () -> new AxeItem(ModToolTiers.ENDERITE, 5, -3f, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> HELLSTONE_SHOVEL = ITEMS.register("hellstone_shovel",
            () -> new ShovelItem(ModToolTiers.ENDERITE, 1, -3f, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> HELLSTONE_HOE = ITEMS.register("hellstone_hoe",
            () -> new HoeItem(ModToolTiers.ENDERITE, -4, 0f, new Item.Properties().fireResistant()));


    //Armor
    public static final RegistryObject<Item> ENDERITE_HELMET = ITEMS.register("enderite_helmet",
            () -> new EnderiteArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> ENDERITE_CHESTPLATE = ITEMS.register("enderite_chestplate",
            () -> new EnderiteArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> ENDERITE_LEGGINGS = ITEMS.register("enderite_leggings",
            () -> new EnderiteArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> ENDERITE_BOOTS = ITEMS.register("enderite_boots",
            () -> new EnderiteArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new EmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new EmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new EmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new EmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new CopperArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new CopperArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new CopperArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new CopperArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> PRISMARINE_HELMET = ITEMS.register("prismarine_helmet",
            () -> new PrismarineArmorItem(ModArmorMaterials.PRISMARINE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> PRISMARINE_CHESTPLATE = ITEMS.register("prismarine_chestplate",
            () -> new PrismarineArmorItem(ModArmorMaterials.PRISMARINE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> PRISMARINE_LEGGINGS = ITEMS.register("prismarine_leggings",
            () -> new PrismarineArmorItem(ModArmorMaterials.PRISMARINE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> PRISMARINE_BOOTS = ITEMS.register("prismarine_boots",
            () -> new PrismarineArmorItem(ModArmorMaterials.PRISMARINE, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> HELLSTONE_HELMET = ITEMS.register("hellstone_helmet",
            () -> new HellstoneArmorItem(ModArmorMaterials.HELLSTONE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> HELLSTONE_CHESTPLATE = ITEMS.register("hellstone_chestplate",
            () -> new HellstoneArmorItem(ModArmorMaterials.HELLSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> HELLSTONE_LEGGINGS = ITEMS.register("hellstone_leggings",
            () -> new HellstoneArmorItem(ModArmorMaterials.HELLSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> HELLSTONE_BOOTS = ITEMS.register("hellstone_boots",
            () -> new HellstoneArmorItem(ModArmorMaterials.HELLSTONE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

