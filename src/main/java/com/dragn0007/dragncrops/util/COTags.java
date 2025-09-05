package com.dragn0007.dragncrops.util;

import com.dragn0007.dragncrops.CropOverhaul;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class COTags {

    public static class Items {

        public static final TagKey<Item> MILK = forgeTag("milk");
        public static final TagKey<Item> WATER = forgeTag("water");
        public static final TagKey<Item> FLOUR = forgeTag("flour");
        public static final TagKey<Item> LEAVES = forgeTag("leaves");
        public static final TagKey<Item> CROPS = forgeTag("crops");
        public static final TagKey<Item> JAMS = forgeTag("jams");
        public static final TagKey<Item> CHEESE = forgeTag("cheese");
        public static final TagKey<Item> COCOA = forgeTag("cocoa");
        public static final TagKey<Item> EGG = forgeTag("egg");
        public static final TagKey<Item> COOKED_SAUSAGE = forgeTag("cooked_sausage");
        public static final TagKey<Item> SUGAR = forgeTag("sugar");
        public static final TagKey<Item> BUTTER = forgeTag("butter");
        public static final TagKey<Item> PASTA = forgeTag("pasta");
        public static final TagKey<Item> DOUGH = forgeTag("dough");

        public static final TagKey<Item> RAW_MEATS = forgeTag("raw_meats");
        public static final TagKey<Item> RAW_CHICKEN = forgeTag("raw_chicken");
        public static final TagKey<Item> RAW_PORK = forgeTag("raw_pork");
        public static final TagKey<Item> RAW_MUTTON = forgeTag("raw_mutton");
        public static final TagKey<Item> RAW_BEEF = forgeTag("raw_beef");
        public static final TagKey<Item> COOKED_MEATS = forgeTag("cooked_meats");
        public static final TagKey<Item> COOKED_CHICKEN = forgeTag("cooked_chicken");
        public static final TagKey<Item> COOKED_PORK = forgeTag("cooked_pork");
        public static final TagKey<Item> COOKED_MUTTON = forgeTag("cooked_mutton");
        public static final TagKey<Item> COOKED_BEEF = forgeTag("cooked_beef");

        public static final TagKey<Item> APPLES = forgeTag("apples");
        public static final TagKey<Item> CARROTS = forgeTag("carrots");
        public static final TagKey<Item> POTATOES = forgeTag("potatoes");
        public static final TagKey<Item> WHEAT = forgeTag("wheat");
        public static final TagKey<Item> BERRIES = forgeTag("berries");
        public static final TagKey<Item> FRUITS = forgeTag("fruits");
        public static final TagKey<Item> TREE_FRUITS = forgeTag("tree_fruits");
        public static final TagKey<Item> VEGETABLES = forgeTag("vegetables");
        public static final TagKey<Item> NUTS = forgeTag("nuts");
        public static final TagKey<Item> HERBS = forgeTag("herbs");


        private static TagKey<Item> tag (String name) {
            return ItemTags.create(new ResourceLocation(CropOverhaul.MODID, name));
        }
        private static TagKey<Item> forgeTag (String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

}
