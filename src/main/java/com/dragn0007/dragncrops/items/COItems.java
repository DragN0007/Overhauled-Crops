package com.dragn0007.dragncrops.items;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.items.custom.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class COItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CropOverhaul.MODID);

    //Crop Items
    public static final RegistryObject<Item> GREEN_APPLE = ITEMS.register("green_apple",
            () -> new PlaceableItem(COBlocks.GREEN_APPLE.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).build()))));
    public static final RegistryObject<Item> YELLOW_APPLE = ITEMS.register("yellow_apple",
            () -> new PlaceableItem(COBlocks.YELLOW_APPLE.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).build()))));
    public static final RegistryObject<Item> PURPLE_CARROT = ITEMS.register("purple_carrot",
            () -> new ItemNameBlockItem(COBlocks.PURPLE_CARROTS.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.6F).build()))));
    public static final RegistryObject<Item> YELLOW_CARROT = ITEMS.register("yellow_carrot",
            () -> new ItemNameBlockItem(COBlocks.YELLOW_CARROTS.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.6F).build()))));
    public static final RegistryObject<Item> PURPLE_POTATO = ITEMS.register("purple_potato",
            () -> new ItemNameBlockItem(COBlocks.PURPLE_POTATOES.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3F).build()))));
    public static final RegistryObject<Item> RED_POTATO = ITEMS.register("red_potato",
            () -> new ItemNameBlockItem(COBlocks.RED_POTATOES.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3F).build()))));

    public static final RegistryObject<Item> BLACKBERRY = ITEMS.register("blackberry",
            () -> new ItemNameBlockItem(COBlocks.BLACKBERRIES.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3F).build()))));
    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new ItemNameBlockItem(COBlocks.BLUEBERRIES.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3F).build()))));
    public static final RegistryObject<Item> RASPBERRY = ITEMS.register("raspberry",
            () -> new ItemNameBlockItem(COBlocks.RASPBERRIES.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3F).build()))));
    public static final RegistryObject<Item> WHITE_RASPBERRY = ITEMS.register("white_raspberry",
            () -> new ItemNameBlockItem(COBlocks.WHITE_RASPBERRIES.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3F).build()))));

    public static final RegistryObject<Item> CRANBERRY = ITEMS.register("cranberry",
            () -> new ItemNameBlockItem(COBlocks.CRANBERRIES.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.6F).build()))));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new ItemNameBlockItem(COBlocks.STRAWBERRIES.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.6F).build()))));
    public static final RegistryObject<Item> PEANUT = ITEMS.register("peanut",
            () -> new ItemNameBlockItem(COBlocks.PEANUTS.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.6F).build()))));
    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new ItemNameBlockItem(COBlocks.CUCUMBERS.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.6F).build()))));
    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",
            () -> new ItemNameBlockItem(COBlocks.GARLIC.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.6F).build()))));
    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            () -> new GrainItem(COBlocks.CORN_GRAIN.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build()))));
    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new GrainItem(COBlocks.RICE_GRAIN.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3F).build()))));
    public static final RegistryObject<Item> RYE = ITEMS.register("rye",
            () -> new GrainItem(COBlocks.RYE_GRAIN.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3F).build()))));
    public static final RegistryObject<Item> SUGAR_BEET = ITEMS.register("sugar_beet",
            () -> new ItemNameBlockItem(COBlocks.SUGAR_BEETS.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build()))));
    public static final RegistryObject<Item> CANTALOUPE_SLICE = ITEMS.register("cantaloupe_slice",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build())));
    public static final RegistryObject<Item> HONEYDEW_SLICE = ITEMS.register("honeydew_slice",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build())));
    public static final RegistryObject<Item> CANTALOUPE = ITEMS.register("cantaloupe",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.4F).build())));
    public static final RegistryObject<Item> HONEYDEW = ITEMS.register("honeydew",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.4F).build())));
    public static final RegistryObject<Item> CHERRIES = ITEMS.register("cherries",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build())));
    public static final RegistryObject<Item> MANGO = ITEMS.register("mango",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.5F).build())));
    public static final RegistryObject<Item> COCONUT = ITEMS.register("coconut",
            () -> new ItemNameBlockItem(COBlocks.COCONUT_SAPLING.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.5F).build()))));
    public static final RegistryObject<Item> LIME = ITEMS.register("lime",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F).build())));

    public static final RegistryObject<Item> CILANTRO = ITEMS.register("cilantro",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1F).build())));
    public static final RegistryObject<Item> OREGANO = ITEMS.register("oregano",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1F).build())));
    public static final RegistryObject<Item> ROSEMARY = ITEMS.register("rosemary",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1F).build())));

    //Seeds
    public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
            () -> new ItemNameBlockItem(COBlocks.CORN.get(), (new Item.Properties())));
    public static final RegistryObject<Item> RICE_SEEDS = ITEMS.register("rice_seeds",
            () -> new ItemNameBlockItem(COBlocks.RICE.get(), (new Item.Properties())));
    public static final RegistryObject<Item> RYE_SEEDS = ITEMS.register("rye_seeds",
            () -> new ItemNameBlockItem(COBlocks.RYE.get(), (new Item.Properties())));
    public static final RegistryObject<Item> CANTALOUPE_SEEDS = ITEMS.register("cantaloupe_seeds",
            () -> new ItemNameBlockItem(COBlocks.CANTALOUPE.get(), (new Item.Properties())));
    public static final RegistryObject<Item> HONEYDEW_SEEDS = ITEMS.register("honeydew_seeds",
            () -> new ItemNameBlockItem(COBlocks.HONEYDEW.get(), (new Item.Properties())));
    public static final RegistryObject<Item> RED_APPLE_SEEDS = ITEMS.register("red_apple_seeds",
            () -> new ItemNameBlockItem(COBlocks.RED_APPLE_SAPLING.get(), (new Item.Properties())));
    public static final RegistryObject<Item> YELLOW_APPLE_SEEDS = ITEMS.register("yellow_apple_seeds",
            () -> new ItemNameBlockItem(COBlocks.YELLOW_APPLE_SAPLING.get(), (new Item.Properties())));
    public static final RegistryObject<Item> GREEN_APPLE_SEEDS = ITEMS.register("green_apple_seeds",
            () -> new ItemNameBlockItem(COBlocks.GREEN_APPLE_SAPLING.get(), (new Item.Properties())));
    public static final RegistryObject<Item> LIME_SEEDS = ITEMS.register("lime_seeds",
            () -> new ItemNameBlockItem(COBlocks.LIME_SAPLING.get(), (new Item.Properties())));
    public static final RegistryObject<Item> MANGO_PIT = ITEMS.register("mango_pit",
            () -> new ItemNameBlockItem(COBlocks.MANGO_SAPLING.get(), (new Item.Properties())));
    public static final RegistryObject<Item> CHERRY_PIT = ITEMS.register("cherry_pit",
            () -> new ItemNameBlockItem(COBlocks.CHERRY_SAPLING.get(), (new Item.Properties())));


    //Ingredients
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.2F).build())));
    public static final RegistryObject<Item> GRAIN = ITEMS.register("grain",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.2F).build())));


    //Breads
    public static final RegistryObject<Item> BLUEBERRY_BREAD = ITEMS.register("blueberry_bread",
            () -> new PlaceableItem(COBlocks.BLUEBERRY_BREAD.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(0.6F).build()))));

    public static final RegistryObject<Item> CRANBERRY_BREAD = ITEMS.register("cranberry_bread",
            () -> new PlaceableItem(COBlocks.CRANBERRY_BREAD.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(0.6F).build()))));

    public static final RegistryObject<Item> NUT_BREAD = ITEMS.register("nut_bread",
            () -> new PlaceableItem(COBlocks.NUT_BREAD.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(0.6F).build()))));

    public static final RegistryObject<Item> RYE_BREAD = ITEMS.register("rye_bread",
            () -> new PlaceableItem(COBlocks.RYE_BREAD.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).build()))));

    public static final RegistryObject<Item> WHITE_BREAD = ITEMS.register("white_bread",
            () -> new PlaceableItem(COBlocks.WHITE_BREAD.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1F).build()))));

    //Jams
    public static final RegistryObject<Item> APPLE_JAM = ITEMS.register("apple_jam",
            () -> new PlaceableItem(COBlocks.APPLE_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> BLACKBERRY_JAM = ITEMS.register("blackberry_jam",
            () -> new PlaceableItem(COBlocks.BLACKBERRY_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> BLUEBERRY_JAM = ITEMS.register("blueberry_jam",
            () -> new PlaceableItem(COBlocks.BLUEBERRY_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> CANTALOUPE_JAM = ITEMS.register("cantaloupe_jam",
            () -> new PlaceableItem(COBlocks.CANTALOUPE_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> CHERRY_JAM = ITEMS.register("cherry_jam",
            () -> new PlaceableItem(COBlocks.CHERRY_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> CRANBERRY_JAM = ITEMS.register("cranberry_jam",
            () -> new PlaceableItem(COBlocks.CRANBERRY_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> MANGO_JAM = ITEMS.register("mango_jam",
            () -> new PlaceableItem(COBlocks.MANGO_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> MELON_JAM = ITEMS.register("melon_jam",
            () -> new PlaceableItem(COBlocks.MELON_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> RASPBERRY_JAM = ITEMS.register("raspberry_jam",
            () -> new PlaceableItem(COBlocks.RASPBERRY_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> STRAWBERRY_JAM = ITEMS.register("strawberry_jam",
            () -> new PlaceableItem(COBlocks.STRAWBERRY_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> WATERMELON_JAM = ITEMS.register("watermelon_jam",
            () -> new PlaceableItem(COBlocks.WATERMELON_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));


    //Tarts
    public static final RegistryObject<Item> APPLE_TART = ITEMS.register("apple_tart",
            () -> new PlaceablePixelPlacerItem(COBlocks.APPLE_TART.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> BLACKBERRY_TART = ITEMS.register("blackberry_tart",
            () -> new PlaceablePixelPlacerItem(COBlocks.BLACKBERRY_TART.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> BLUEBERRY_TART = ITEMS.register("blueberry_tart",
            () -> new PlaceablePixelPlacerItem(COBlocks.BLUEBERRY_TART.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> CANTALOUPE_TART = ITEMS.register("cantaloupe_tart",
            () -> new PlaceablePixelPlacerItem(COBlocks.CANTALOUPE_TART.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> CHERRY_TART = ITEMS.register("cherry_tart",
            () -> new PlaceablePixelPlacerItem(COBlocks.CHERRY_TART.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> CRANBERRY_TART = ITEMS.register("cranberry_tart",
            () -> new PlaceablePixelPlacerItem(COBlocks.CRANBERRY_TART.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> MANGO_TART = ITEMS.register("mango_tart",
            () -> new PlaceablePixelPlacerItem(COBlocks.MANGO_TART.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> MELON_TART = ITEMS.register("melon_tart",
            () -> new PlaceablePixelPlacerItem(COBlocks.MELON_TART.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> RASPBERRY_TART = ITEMS.register("raspberry_tart",
            () -> new PlaceablePixelPlacerItem(COBlocks.RASPBERRY_TART.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> STRAWBERRY_TART = ITEMS.register("strawberry_tart",
            () -> new PlaceablePixelPlacerItem(COBlocks.STRAWBERRY_TART.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> WATERMELON_TART = ITEMS.register("watermelon_tart",
            () -> new PlaceablePixelPlacerItem(COBlocks.WATERMELON_TART.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F).build()))));


    //Candy
    public static final RegistryObject<Item> APPLE_CANDY = ITEMS.register("apple_candy",
            () -> new PlaceableItem(COBlocks.APPLE_CANDY.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> BLACKBERRY_CANDY = ITEMS.register("blackberry_candy",
            () -> new PlaceableItem(COBlocks.BLACKBERRY_CANDY.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> BLUEBERRY_CANDY = ITEMS.register("blueberry_candy",
            () -> new PlaceableItem(COBlocks.BLUEBERRY_CANDY.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> CANTALOUPE_CANDY = ITEMS.register("cantaloupe_candy",
            () -> new PlaceableItem(COBlocks.CANTALOUPE_CANDY.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> CHERRY_CANDY = ITEMS.register("cherry_candy",
            () -> new PlaceableItem(COBlocks.CHERRY_CANDY.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> CRANBERRY_CANDY = ITEMS.register("cranberry_candy",
            () -> new PlaceableItem(COBlocks.CRANBERRY_CANDY.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> MANGO_CANDY = ITEMS.register("mango_candy",
            () -> new PlaceableItem(COBlocks.MANGO_CANDY.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> MELON_CANDY = ITEMS.register("melon_candy",
            () -> new PlaceableItem(COBlocks.MELON_CANDY.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> RASPBERRY_CANDY = ITEMS.register("raspberry_candy",
            () -> new PlaceableItem(COBlocks.RASPBERRY_CANDY.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> STRAWBERRY_CANDY = ITEMS.register("strawberry_candy",
            () -> new PlaceableItem(COBlocks.STRAWBERRY_CANDY.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> WATERMELON_CANDY = ITEMS.register("watermelon_candy",
            () -> new PlaceableItem(COBlocks.WATERMELON_CANDY.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 0.8F).build()))));


    //Canned
    public static final RegistryObject<Item> CANNED_CARROTS = ITEMS.register("canned_carrots",
            () -> new CanItem(COBlocks.CANNED_CARROTS.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(7).saturationMod(0.4F)
                            .effect(new MobEffectInstance(MobEffects.SATURATION, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> CANNED_POTATOES = ITEMS.register("canned_potatoes",
            () -> new CanItem(COBlocks.CANNED_POTATOES.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(7).saturationMod(0.4F)
                            .effect(new MobEffectInstance(MobEffects.SATURATION, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> CANNED_BEETS = ITEMS.register("canned_beets",
            () -> new CanItem(COBlocks.CANNED_BEETS.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(7).saturationMod(0.4F)
                            .effect(new MobEffectInstance(MobEffects.SATURATION, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> CANNED_VEGETABLES = ITEMS.register("canned_vegetables",
            () -> new CanItem(COBlocks.CANNED_VEGETABLES.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(7).saturationMod(0.4F)
                            .effect(new MobEffectInstance(MobEffects.SATURATION, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> CANNED_FRUIT = ITEMS.register("canned_fruit",
            () -> new CanItem(COBlocks.CANNED_FRUIT.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(7).saturationMod(0.4F)
                            .effect(new MobEffectInstance(MobEffects.SATURATION, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> CANNED_BEEF = ITEMS.register("canned_beef",
            () -> new CanItem(COBlocks.CANNED_BEEF.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(7).saturationMod(0.4F)
                            .effect(new MobEffectInstance(MobEffects.SATURATION, 600, 1), 0.8F).build()))));


    //Jarred
    public static final RegistryObject<Item> UNFERMENTED_PICKLES = ITEMS.register("unfermented_pickles",
            () -> new CanItem(COBlocks.UNFERMENTED_PICKLES.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(3).saturationMod(0.4F)
                            .effect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 200, 1), 0.8F).build()))));

    public static final RegistryObject<Item> FERMENTED_PICKLES = ITEMS.register("fermented_pickles",
            () -> new CanItem(COBlocks.FERMENTED_PICKLES.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(7).saturationMod(0.4F)
                            .effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> STOCK = ITEMS.register("stock",
            () -> new CanItem(COBlocks.STOCK.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(4).saturationMod(0.4F)
                            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> VEGETABLE_SOUP = ITEMS.register("vegetable_soup",
            () -> new CanItem(COBlocks.VEGETABLE_SOUP.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(7).saturationMod(0.8F)
                            .effect(new MobEffectInstance(MobEffects.SATURATION, 600, 1), 0.8F).build()))));

    public static final RegistryObject<Item> MEAT_AND_VEGETABLE_STEW = ITEMS.register("meat_and_vegetable_stew",
            () -> new CanItem(COBlocks.MEAT_AND_VEGETABLE_STEW.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(9).saturationMod(1.0F)
                            .effect(new MobEffectInstance(MobEffects.SATURATION, 600, 1), 0.8F).build()))));


    //Tools/ Supplies
    public static final RegistryObject<Item> FLAIL = ITEMS.register("flail",
            () -> new FlailItem(Tiers.DIAMOND, 1, -1.4F, new Item.Properties()));

    public static final RegistryObject<Item> EMPTY_CAN = ITEMS.register("empty_can",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GLASS_JAR = ITEMS.register("glass_jar",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> CROP_OVERHAUL = ITEMS.register("crop_overhaul",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}