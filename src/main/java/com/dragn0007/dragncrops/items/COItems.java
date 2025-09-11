package com.dragn0007.dragncrops.items;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.items.custom.FlailItem;
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
            () -> new ItemNameBlockItem(COBlocks.GREEN_APPLE.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).build()))));
    public static final RegistryObject<Item> YELLOW_APPLE = ITEMS.register("yellow_apple",
            () -> new ItemNameBlockItem(COBlocks.YELLOW_APPLE.get(),
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
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.6F).build())));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.6F).build())));
    public static final RegistryObject<Item> PEANUT = ITEMS.register("peanut",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.6F).build())));
    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.6F).build())));
    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.6F).build())));
    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            () -> new ItemNameBlockItem(COBlocks.CORN_GRAIN.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build()))));
    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new ItemNameBlockItem(COBlocks.RICE_GRAIN.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3F).build()))));
    public static final RegistryObject<Item> RYE = ITEMS.register("rye",
            () -> new ItemNameBlockItem(COBlocks.RYE_GRAIN.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3F).build()))));
    public static final RegistryObject<Item> SUGAR_BEET = ITEMS.register("sugar_beet",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build())));

    public static final RegistryObject<Item> CHERRIES = ITEMS.register("cherries",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build())));
    public static final RegistryObject<Item> MANGO = ITEMS.register("mango",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.5F).build())));
    public static final RegistryObject<Item> COCONUT = ITEMS.register("coconut",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.5F).build())));
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
            () -> new ItemNameBlockItem(COBlocks.CORN_GRAIN.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build()))));
    public static final RegistryObject<Item> RICE_SEEDS = ITEMS.register("rice_seeds",
            () -> new ItemNameBlockItem(COBlocks.RICE_GRAIN.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3F).build()))));
    public static final RegistryObject<Item> RYE_SEEDS = ITEMS.register("rye_seeds",
            () -> new ItemNameBlockItem(COBlocks.RYE_GRAIN.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3F).build()))));


    //Ingredients
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.2F).build())));
    public static final RegistryObject<Item> GRAIN = ITEMS.register("grain",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.2F).build())));


    //Breads
    public static final RegistryObject<Item> BLUEBERRY_BREAD = ITEMS.register("blueberry_bread",
            () -> new ItemNameBlockItem(COBlocks.BLUEBERRY_BREAD.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(0.6F).build()))));
    public static final RegistryObject<Item> CRANBERRY_BREAD = ITEMS.register("cranberry_bread",
            () -> new ItemNameBlockItem(COBlocks.CRANBERRY_BREAD.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(0.6F).build()))));
    public static final RegistryObject<Item> NUT_BREAD = ITEMS.register("nut_bread",
            () -> new ItemNameBlockItem(COBlocks.NUT_BREAD.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(0.6F).build()))));
    public static final RegistryObject<Item> RYE_BREAD = ITEMS.register("rye_bread",
            () -> new ItemNameBlockItem(COBlocks.RYE_BREAD.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).build()))));
    public static final RegistryObject<Item> WHITE_BREAD = ITEMS.register("white_bread",
            () -> new ItemNameBlockItem(COBlocks.WHITE_BREAD.get(),
                    (new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1F).build()))));

    //Jams
    public static final RegistryObject<Item> APPLE_JAM = ITEMS.register("apple_jam",
            () -> new ItemNameBlockItem(COBlocks.APPLE_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> BLACKBERRY_JAM = ITEMS.register("blackberry_jam",
            () -> new ItemNameBlockItem(COBlocks.BLACKBERRY_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> BLUEBERRY_JAM = ITEMS.register("blueberry_jam",
            () -> new ItemNameBlockItem(COBlocks.BLUEBERRY_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> CANTALOUPE_JAM = ITEMS.register("cantaloupe_jam",
            () -> new ItemNameBlockItem(COBlocks.CANTALOUPE_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> CHERRY_JAM = ITEMS.register("cherry_jam",
            () -> new ItemNameBlockItem(COBlocks.CHERRY_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> CRANBERRY_JAM = ITEMS.register("cranberry_jam",
            () -> new ItemNameBlockItem(COBlocks.CRANBERRY_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> MANGO_JAM = ITEMS.register("mango_jam",
            () -> new ItemNameBlockItem(COBlocks.MANGO_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> MELON_JAM = ITEMS.register("melon_jam",
            () -> new ItemNameBlockItem(COBlocks.MELON_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> RASPBERRY_JAM = ITEMS.register("raspberry_jam",
            () -> new ItemNameBlockItem(COBlocks.RASPBERRY_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> STRAWBERRY_JAM = ITEMS.register("strawberry_jam",
            () -> new ItemNameBlockItem(COBlocks.STRAWBERRY_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    public static final RegistryObject<Item> WATERMELON_JAM = ITEMS.register("watermelon_jam",
            () -> new ItemNameBlockItem(COBlocks.WATERMELON_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));

    //Tools
    public static final RegistryObject<Item> FLAIL = ITEMS.register("flail",
            () -> new FlailItem(Tiers.DIAMOND, 1, -1.4F, new Item.Properties()));

    public static final RegistryObject<Item> CROP_OVERHAUL = ITEMS.register("crop_overhaul",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}