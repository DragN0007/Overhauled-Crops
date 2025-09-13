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
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.MANGO.get())
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

    }
}