package com.dragn0007.dragncrops.datagen;

import com.dragn0007.dragncrops.items.COItems;
import com.dragn0007.dragncrops.util.COTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class CORecipeMaker extends RecipeProvider implements IConditionBuilder {
    public CORecipeMaker(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

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
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.BLACKBERRY_JAM.get())
                .requires(COItems.BLACKBERRY.get())
                .requires(COItems.BLACKBERRY.get())
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.BLUEBERRY_JAM.get())
                .requires(COItems.BLUEBERRY.get())
                .requires(COItems.BLUEBERRY.get())
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

    }
}