package com.dragn0007.dragncrops.datagen;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.items.COItems;
import com.dragn0007.dragncrops.util.COTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.checkerframework.checker.units.qual.A;

import java.util.function.Consumer;

public class CORecipeMaker extends RecipeProvider implements IConditionBuilder {
    public CORecipeMaker(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, COItems.FLAIL.get())
                .define('A', ItemTags.PLANKS)
                .define('B', Items.STICK)
                .pattern("  B")
                .pattern(" BA")
                .pattern("B  ")
                .unlockedBy("has_wood", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.PLANKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, COItems.MEAT_MALLET.get())
                .define('A', Items.IRON_INGOT)
                .define('B', Items.STICK)
                .pattern(" AB")
                .pattern(" BA")
                .pattern("B  ")
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, COItems.EMPTY_CAN.get())
                .define('A', Items.IRON_INGOT)
                .define('B', Items.IRON_NUGGET)
                .pattern("B")
                .pattern("A")
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, COItems.GLASS_JAR.get())
                .define('A', Items.GLASS)
                .pattern("A A")
                .pattern("AAA")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS)
                        .build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.UNFERMENTED_PICKLES.get())
                .requires(COItems.GLASS_JAR.get())
                .requires(COItems.CUCUMBER.get())
                .requires(COItems.CUCUMBER.get())
                .requires(COItems.GARLIC.get())
                .requires(COTags.Items.HERBS)
                .unlockedBy("has_jar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.GLASS_JAR.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.STOCK.get())
                .requires(COItems.GLASS_JAR.get())
                .requires(Items.BONE)
                .requires(Items.BONE)
                .requires(COTags.Items.HERBS)
                .unlockedBy("has_jar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.GLASS_JAR.get())
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation(CropOverhaul.MODID, "stock_from_bones"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.STOCK.get())
                .requires(COItems.GLASS_JAR.get())
                .requires(COTags.Items.VEGETABLES)
                .requires(COTags.Items.VEGETABLES)
                .requires(COTags.Items.HERBS)
                .unlockedBy("has_jar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.GLASS_JAR.get())
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation(CropOverhaul.MODID, "stock_from_vegetables"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.VEGETABLE_SOUP.get())
                .requires(COItems.STOCK.get())
                .requires(COTags.Items.VEGETABLES)
                .requires(COTags.Items.VEGETABLES)
                .requires(COItems.GARLIC.get())
                .requires(COTags.Items.HERBS)
                .unlockedBy("has_jar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.GLASS_JAR.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.MEAT_AND_VEGETABLE_STEW.get())
                .requires(COItems.STOCK.get())
                .requires(COTags.Items.COOKED_MEATS)
                .requires(COTags.Items.VEGETABLES)
                .requires(COItems.GARLIC.get())
                .requires(COTags.Items.HERBS)
                .unlockedBy("has_jar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.GLASS_JAR.get())
                        .build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CANNED_CARROTS.get())
                .requires(COItems.EMPTY_CAN.get())
                .requires(COTags.Items.CARROTS)
                .requires(COTags.Items.CARROTS)
                .requires(COTags.Items.HERBS)
                .unlockedBy("has_can", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.EMPTY_CAN.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CANNED_POTATOES.get())
                .requires(COItems.EMPTY_CAN.get())
                .requires(COTags.Items.POTATOES)
                .requires(COTags.Items.POTATOES)
                .requires(COTags.Items.HERBS)
                .unlockedBy("has_can", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.EMPTY_CAN.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CANNED_BEETS.get())
                .requires(COItems.EMPTY_CAN.get())
                .requires(COTags.Items.BEETS)
                .requires(COTags.Items.BEETS)
                .requires(COTags.Items.HERBS)
                .unlockedBy("has_can", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.EMPTY_CAN.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CANNED_VEGETABLES.get())
                .requires(COItems.EMPTY_CAN.get())
                .requires(COTags.Items.VEGETABLES)
                .requires(COTags.Items.VEGETABLES)
                .requires(COItems.GARLIC.get())
                .unlockedBy("has_can", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.EMPTY_CAN.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CANNED_FRUIT.get())
                .requires(COItems.EMPTY_CAN.get())
                .requires(COTags.Items.FRUITS)
                .requires(COTags.Items.FRUITS)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_can", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.EMPTY_CAN.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CANNED_BEEF.get())
                .requires(COItems.EMPTY_CAN.get())
                .requires(COTags.Items.RAW_BEEF)
                .requires(COTags.Items.RAW_BEEF)
                .requires(COItems.GARLIC.get())
                .unlockedBy("has_can", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.EMPTY_CAN.get())
                        .build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.HONEYDEW_SLICE.get(), 4)
                .requires(COItems.HONEYDEW.get())
                .unlockedBy("has_hnyd", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.HONEYDEW.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CANTALOUPE_SLICE.get(), 4)
                .requires(COItems.CANTALOUPE.get())
                .unlockedBy("has_clpe", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.CANTALOUPE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.HONEYDEW_SEEDS.get(), 1)
                .requires(COItems.HONEYDEW_SLICE.get())
                .unlockedBy("has_hnyd_slice", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.HONEYDEW_SLICE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CANTALOUPE_SEEDS.get(), 1)
                .requires(COItems.CANTALOUPE_SLICE.get())
                .unlockedBy("has_clpe_slice", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.CANTALOUPE_SLICE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.RYE_SEEDS.get(), 1)
                .requires(COItems.RYE.get())
                .unlockedBy("has_rye", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.RYE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CORN_SEEDS.get(), 1)
                .requires(COItems.CORN.get())
                .unlockedBy("has_corn", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.CORN.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.RICE_SEEDS.get(), 1)
                .requires(COItems.RICE.get())
                .unlockedBy("has_rice", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.RICE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.RED_APPLE_SEEDS.get(), 1)
                .requires(Items.APPLE)
                .unlockedBy("has_apple", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.APPLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.YELLOW_APPLE_SEEDS.get(), 1)
                .requires(COItems.YELLOW_APPLE.get())
                .unlockedBy("has_apple", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.YELLOW_APPLE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.GREEN_APPLE_SEEDS.get(), 1)
                .requires(COItems.GREEN_APPLE.get())
                .unlockedBy("has_apple", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.GREEN_APPLE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.MANGO_PIT.get(), 1)
                .requires(COItems.MANGO.get())
                .unlockedBy("has_mango", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.MANGO.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.LIME_SEEDS.get(), 1)
                .requires(COItems.LIME.get())
                .unlockedBy("has_lime", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.LIME.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CHERRY_PIT.get(), 1)
                .requires(COItems.CHERRIES.get())
                .unlockedBy("has_cherries", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.CHERRIES.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.WHEAT_SEEDS, 1)
                .requires(Items.WHEAT)
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.FLOUR.get(), 2)
                .requires(COItems.GRAIN.get())
                .unlockedBy("has_grain", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.GRAIN.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.SUGAR, 2)
                .requires(COItems.SUGAR_BEET.get())
                .unlockedBy("has_sugar_beet", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.SUGAR_BEET.get())
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation(CropOverhaul.MODID, "sugar_from_sugar_beet"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.SUGAR, 3)
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_honey", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.HONEY_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation(CropOverhaul.MODID, "sugar_from_honey_bottle"));


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.BLUEBERRY_BREAD.get())
                .requires(COItems.BLUEBERRY.get())
                .requires(COItems.BLUEBERRY.get())
                .requires(COTags.Items.FLOUR)
                .requires(COTags.Items.FLOUR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CRANBERRY_BREAD.get())
                .requires(COItems.CRANBERRY.get())
                .requires(COItems.CRANBERRY.get())
                .requires(COTags.Items.FLOUR)
                .requires(COTags.Items.FLOUR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.NUT_BREAD.get())
                .requires(COTags.Items.NUTS)
                .requires(COTags.Items.NUTS)
                .requires(COTags.Items.FLOUR)
                .requires(COTags.Items.FLOUR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.RYE.get())
                .requires(COItems.RYE.get())
                .requires(COItems.RYE.get())
                .requires(COItems.RYE.get())
                .unlockedBy("has_rye", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.RYE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.WHITE_BREAD.get())
                .requires(COTags.Items.FLOUR)
                .requires(COTags.Items.FLOUR)
                .requires(COTags.Items.FLOUR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.APPLE_JAM.get())
                .requires(COTags.Items.APPLES)
                .requires(COTags.Items.APPLES)
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.BLACKBERRY_JAM.get())
                .requires(COItems.BLACKBERRY.get())
                .requires(COItems.BLACKBERRY.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.BLUEBERRY_JAM.get())
                .requires(COItems.BLUEBERRY.get())
                .requires(COItems.BLUEBERRY.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CANTALOUPE_JAM.get())
                .requires(COItems.CANTALOUPE_SLICE.get())
                .requires(COItems.CANTALOUPE_SLICE.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CHERRY_JAM.get())
                .requires(COItems.CHERRIES.get())
                .requires(COItems.CHERRIES.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CRANBERRY_JAM.get())
                .requires(COItems.CRANBERRY.get())
                .requires(COItems.CRANBERRY.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.MANGO_JAM.get())
                .requires(COItems.MANGO.get())
                .requires(COItems.MANGO.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.MELON_JAM.get())
                .requires(COItems.HONEYDEW_SLICE.get())
                .requires(COItems.HONEYDEW_SLICE.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.RASPBERRY_JAM.get())
                .requires(COItems.RASPBERRY.get())
                .requires(COItems.RASPBERRY.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.STRAWBERRY_JAM.get())
                .requires(COItems.STRAWBERRY.get())
                .requires(COItems.STRAWBERRY.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.WATERMELON_JAM.get())
                .requires(Items.MELON_SLICE)
                .requires(Items.MELON_SLICE)
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.APPLE_CANDY.get())
                .requires(COTags.Items.APPLES)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.BLACKBERRY_CANDY.get())
                .requires(COItems.BLACKBERRY.get())
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.BLUEBERRY_CANDY.get())
                .requires(COItems.BLUEBERRY.get())
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CANTALOUPE_CANDY.get())
                .requires(COItems.CANTALOUPE_SLICE.get())
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CHERRY_CANDY.get())
                .requires(COItems.CHERRIES.get())
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CRANBERRY_CANDY.get())
                .requires(COItems.CRANBERRY.get())
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.MANGO_CANDY.get())
                .requires(COItems.MANGO.get())
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.MELON_CANDY.get())
                .requires(COItems.HONEYDEW_SLICE.get())
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.RASPBERRY_CANDY.get())
                .requires(COItems.RASPBERRY.get())
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.STRAWBERRY_CANDY.get())
                .requires(COItems.STRAWBERRY.get())
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.WATERMELON_CANDY.get())
                .requires(Items.MELON_SLICE)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.APPLE_TART.get())
                .requires(COItems.APPLE_JAM.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.FLOUR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.BLACKBERRY_TART.get())
                .requires(COItems.BLACKBERRY_JAM.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.FLOUR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.BLUEBERRY_TART.get())
                .requires(COItems.BLUEBERRY_JAM.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.FLOUR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CANTALOUPE_TART.get())
                .requires(COItems.CANTALOUPE_JAM.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.FLOUR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CHERRY_TART.get())
                .requires(COItems.CHERRY_JAM.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.FLOUR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CRANBERRY_TART.get())
                .requires(COItems.CRANBERRY_JAM.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.FLOUR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.MANGO_TART.get())
                .requires(COItems.MANGO_JAM.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.FLOUR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.MELON_TART.get())
                .requires(COItems.MELON_JAM.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.FLOUR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.RASPBERRY_TART.get())
                .requires(COItems.RASPBERRY_JAM.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.FLOUR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.STRAWBERRY_TART.get())
                .requires(COItems.STRAWBERRY_JAM.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.FLOUR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.WATERMELON_TART.get())
                .requires(COItems.WATERMELON_JAM.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.FLOUR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.APPLE_GELATIN.get())
                .requires(COItems.APPLE_JAM.get())
                .requires(COTags.Items.APPLES)
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.BLACKBERRY_GELATIN.get())
                .requires(COItems.BLACKBERRY_JAM.get())
                .requires(COItems.BLACKBERRY.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.BLUEBERRY_GELATIN.get())
                .requires(COItems.BLUEBERRY_JAM.get())
                .requires(COItems.BLUEBERRY.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CANTALOUPE_GELATIN.get())
                .requires(COItems.CANTALOUPE_JAM.get())
                .requires(COItems.CANTALOUPE_SLICE.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CHERRY_GELATIN.get())
                .requires(COItems.CHERRY_JAM.get())
                .requires(COItems.CHERRIES.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CRANBERRY_GELATIN.get())
                .requires(COItems.CRANBERRY_JAM.get())
                .requires(COItems.CRANBERRY.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.MANGO_GELATIN.get())
                .requires(COItems.MANGO_JAM.get())
                .requires(COItems.MANGO.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.MELON_GELATIN.get())
                .requires(COItems.MELON_JAM.get())
                .requires(COItems.HONEYDEW_SLICE.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.RASPBERRY_GELATIN.get())
                .requires(COItems.RASPBERRY_JAM.get())
                .requires(COItems.RASPBERRY.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.STRAWBERRY_GELATIN.get())
                .requires(COItems.STRAWBERRY_JAM.get())
                .requires(COItems.STRAWBERRY.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.WATERMELON_GELATIN.get())
                .requires(COItems.WATERMELON_JAM.get())
                .requires(Items.MELON_SLICE)
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.UNFERMENTED_APPLE_MEAD.get())
                .requires(COTags.Items.APPLES)
                .requires(COTags.Items.SUGAR)
                .requires(COItems.GRAIN.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.UNFERMENTED_BLACKBERRY_MEAD.get())
                .requires(COItems.BLACKBERRY.get())
                .requires(COTags.Items.SUGAR)
                .requires(COItems.GRAIN.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.UNFERMENTED_BLUEBERRY_MEAD.get())
                .requires(COItems.BLUEBERRY.get())
                .requires(COTags.Items.SUGAR)
                .requires(COItems.GRAIN.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.UNFERMENTED_CANTALOUPE_MEAD.get())
                .requires(COItems.CANTALOUPE_SLICE.get())
                .requires(COTags.Items.SUGAR)
                .requires(COItems.GRAIN.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.UNFERMENTED_CHERRY_MEAD.get())
                .requires(COItems.CHERRIES.get())
                .requires(COTags.Items.SUGAR)
                .requires(COItems.GRAIN.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.UNFERMENTED_CRANBERRY_MEAD.get())
                .requires(COItems.CRANBERRY.get())
                .requires(COTags.Items.SUGAR)
                .requires(COItems.GRAIN.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.UNFERMENTED_MANGO_MEAD.get())
                .requires(COItems.MANGO.get())
                .requires(COTags.Items.SUGAR)
                .requires(COItems.GRAIN.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.UNFERMENTED_MELON_MEAD.get())
                .requires(COItems.HONEYDEW_SLICE.get())
                .requires(COTags.Items.SUGAR)
                .requires(COItems.GRAIN.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.UNFERMENTED_RASPBERRY_MEAD.get())
                .requires(COItems.RASPBERRY.get())
                .requires(COTags.Items.SUGAR)
                .requires(COItems.GRAIN.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.UNFERMENTED_STRAWBERRY_MEAD.get())
                .requires(COItems.STRAWBERRY.get())
                .requires(COTags.Items.SUGAR)
                .requires(COItems.GRAIN.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.UNFERMENTED_WATERMELON_MEAD.get())
                .requires(Items.MELON_SLICE)
                .requires(COTags.Items.SUGAR)
                .requires(COItems.GRAIN.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.UNFERMENTED_BEETROOT_MEAD.get())
                .requires(Items.BEETROOT)
                .requires(COTags.Items.SUGAR)
                .requires(COItems.GRAIN.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.UNFERMENTED_HONEY_MEAD.get())
                .requires(Items.HONEY_BOTTLE)
                .requires(COTags.Items.SUGAR)
                .requires(COItems.GRAIN.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.UNFERMENTED_MAGMA_CREAM_MEAD.get())
                .requires(Items.MAGMA_CREAM)
                .requires(COTags.Items.SUGAR)
                .requires(COItems.GRAIN.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.BEEF_SAUSAGE.get())
                .requires(COItems.MEAT_MALLET.get())
                .requires(COTags.Items.MAKES_BEEF_SAUSAGE)
                .requires(COTags.Items.HERBS)
                .unlockedBy("has_mallet", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.MEAT_MALLET.get())
                        .build()))
                .save(pFinishedRecipeConsumer);
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(COItems.BEEF_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_BEEF_SAUSAGE.get(), 0.35F, 100)
                .unlockedBy("has_beef_sausage", has(COItems.BEEF_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_beef_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(COItems.BEEF_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_BEEF_SAUSAGE.get(), 0.35F, 200)
                .unlockedBy("has_beef_sausage", has(COItems.BEEF_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_beef_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(COItems.BEEF_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_BEEF_SAUSAGE.get(), 0.35F, 600)
                .unlockedBy("has_beef_sausage", has(COItems.BEEF_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_beef_campfire_cooking"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.CHICKEN_SAUSAGE.get())
                .requires(COItems.MEAT_MALLET.get())
                .requires(COTags.Items.MAKES_CHICKEN_SAUSAGE)
                .requires(COTags.Items.HERBS)
                .unlockedBy("has_mallet", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.MEAT_MALLET.get())
                        .build()))
                .save(pFinishedRecipeConsumer);
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(COItems.CHICKEN_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_CHICKEN_SAUSAGE.get(), 0.35F, 100)
                .unlockedBy("has_chicken_sausage", has(COItems.CHICKEN_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_chicken_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(COItems.CHICKEN_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_CHICKEN_SAUSAGE.get(), 0.35F, 200)
                .unlockedBy("has_chicken_sausage", has(COItems.CHICKEN_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_chicken_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(COItems.CHICKEN_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_CHICKEN_SAUSAGE.get(), 0.35F, 600)
                .unlockedBy("has_chicken_sausage", has(COItems.CHICKEN_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_chicken_campfire_cooking"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.PORK_SAUSAGE.get())
                .requires(COItems.MEAT_MALLET.get())
                .requires(COTags.Items.MAKES_PORK_SAUSAGE)
                .requires(COTags.Items.HERBS)
                .unlockedBy("has_mallet", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.MEAT_MALLET.get())
                        .build()))
                .save(pFinishedRecipeConsumer);
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(COItems.PORK_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_PORK_SAUSAGE.get(), 0.35F, 100)
                .unlockedBy("has_pork_sausage", has(COItems.PORK_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_pork_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(COItems.PORK_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_PORK_SAUSAGE.get(), 0.35F, 200)
                .unlockedBy("has_pork_sausage", has(COItems.PORK_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_pork_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(COItems.PORK_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_PORK_SAUSAGE.get(), 0.35F, 600)
                .unlockedBy("has_pork_sausage", has(COItems.PORK_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_pork_campfire_cooking"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.MUTTON_SAUSAGE.get())
                .requires(COItems.MEAT_MALLET.get())
                .requires(COTags.Items.MAKES_MUTTON_SAUSAGE)
                .requires(COTags.Items.HERBS)
                .unlockedBy("has_mallet", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.MEAT_MALLET.get())
                        .build()))
                .save(pFinishedRecipeConsumer);
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(COItems.MUTTON_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_MUTTON_SAUSAGE.get(), 0.35F, 100)
                .unlockedBy("has_mutton_sausage", has(COItems.MUTTON_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_mutton_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(COItems.MUTTON_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_MUTTON_SAUSAGE.get(), 0.35F, 200)
                .unlockedBy("has_mutton_sausage", has(COItems.MUTTON_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_mutton_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(COItems.MUTTON_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_MUTTON_SAUSAGE.get(), 0.35F, 600)
                .unlockedBy("has_mutton_sausage", has(COItems.MUTTON_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_mutton_campfire_cooking"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.FISH_SAUSAGE.get())
                .requires(COItems.MEAT_MALLET.get())
                .requires(COTags.Items.MAKES_FISH_SAUSAGE)
                .requires(COTags.Items.HERBS)
                .unlockedBy("has_mallet", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.MEAT_MALLET.get())
                        .build()))
                .save(pFinishedRecipeConsumer);
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(COItems.FISH_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_FISH_SAUSAGE.get(), 0.35F, 100)
                .unlockedBy("has_fish_sausage", has(COItems.FISH_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_fish_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(COItems.FISH_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_FISH_SAUSAGE.get(), 0.35F, 200)
                .unlockedBy("has_fish_sausage", has(COItems.FISH_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_fish_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(COItems.FISH_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_FISH_SAUSAGE.get(), 0.35F, 600)
                .unlockedBy("has_fish_sausage", has(COItems.FISH_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_fish_campfire_cooking"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.GENERIC_SAUSAGE.get())
                .requires(COItems.MEAT_MALLET.get())
                .requires(COTags.Items.MAKES_GENERIC_SAUSAGE)
                .requires(COTags.Items.HERBS)
                .unlockedBy("has_mallet", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.MEAT_MALLET.get())
                        .build()))
                .save(pFinishedRecipeConsumer);
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(COItems.GENERIC_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_GENERIC_SAUSAGE.get(), 0.35F, 100)
                .unlockedBy("has_generic_sausage", has(COItems.GENERIC_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_generic_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(COItems.GENERIC_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_GENERIC_SAUSAGE.get(), 0.35F, 200)
                .unlockedBy("has_generic_sausage", has(COItems.GENERIC_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_generic_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(COItems.GENERIC_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_GENERIC_SAUSAGE.get(), 0.35F, 600)
                .unlockedBy("has_generic_sausage", has(COItems.GENERIC_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_generic_campfire_cooking"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.GAME_SAUSAGE.get())
                .requires(COItems.MEAT_MALLET.get())
                .requires(COTags.Items.MAKES_GAME_SAUSAGE)
                .requires(COTags.Items.HERBS)
                .unlockedBy("has_mallet", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COItems.MEAT_MALLET.get())
                        .build()))
                .save(pFinishedRecipeConsumer);
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(COItems.GAME_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_GAME_SAUSAGE.get(), 0.35F, 100)
                .unlockedBy("has_game_sausage", has(COItems.GAME_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_game_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(COItems.GAME_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_GAME_SAUSAGE.get(), 0.35F, 200)
                .unlockedBy("has_game_sausage", has(COItems.GAME_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_game_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(COItems.GAME_SAUSAGE.get()), RecipeCategory.MISC, COItems.COOKED_GAME_SAUSAGE.get(), 0.35F, 600)
                .unlockedBy("has_game_sausage", has(COItems.GAME_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dragncrops", "cooked_game_campfire_cooking"));

    }
}