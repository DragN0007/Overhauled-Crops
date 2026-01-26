package com.dragn0007.dragncrops.datagen.compat;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.items.COItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import sfiomn.legendarysurvivaloverhaul.api.data.providers.ThirstDataProvider;

import java.util.concurrent.CompletableFuture;

/*
ModThirstProvider (renamed to COThirstProvider) originally by legendary_workshop, used in Legendary Survival Overhaul
Distributed under MIT

This class is used for Legendary Survival Overhaul compat with CO foods & drinks
 */

public class COThirstProvider extends ThirstDataProvider {

    public COThirstProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper fileHelper) {
        super(CropOverhaul.MODID, output, lookupProvider, fileHelper);
    }

    @Override
    public void generate(HolderLookup.Provider provider, ExistingFileHelper existingFileHelper) {
        consumable(COItems.YELLOW_APPLE.get()).addThirst(thirstData(2, 0.5f));
        consumable(COItems.GREEN_APPLE.get()).addThirst(thirstData(2, 0.5f));
        consumable(COItems.CANTALOUPE_SLICE.get()).addThirst(thirstData(2, 0.5f));
        consumable(COItems.HONEYDEW_SLICE.get()).addThirst(thirstData(2, 0.5f));
        consumable(COItems.CANTALOUPE.get()).addThirst(thirstData(4, 1.0f));
        consumable(COItems.HONEYDEW.get()).addThirst(thirstData(4, 1.0f));
        consumable(COItems.BLACKBERRY.get()).addThirst(thirstData(2, 0.5f));
        consumable(COItems.BLUEBERRY.get()).addThirst(thirstData(2, 0.5f));
        consumable(COItems.RASPBERRY.get()).addThirst(thirstData(2, 0.5f));
        consumable(COItems.CRANBERRY.get()).addThirst(thirstData(2, 0.5f));
        consumable(COItems.STRAWBERRY.get()).addThirst(thirstData(2, 0.5f));
        consumable(COItems.CRIMSONBERRY.get()).addThirst(thirstData(2, 0.5f));
        consumable(COItems.GOLDENBERRIES.get()).addThirst(thirstData(2, 0.5f));
        consumable(COItems.CUCUMBER.get()).addThirst(thirstData(2, 0.5f));
        consumable(COItems.CHERRIES.get()).addThirst(thirstData(2, 0.5f));
        consumable(COItems.MANGO.get()).addThirst(thirstData(2, 0.5f));
        consumable(COItems.COCONUT.get()).addThirst(thirstData(4, 1.0f));
        consumable(COItems.LIME.get()).addThirst(thirstData(2, 0.5f));
        consumable(COItems.PLUM.get()).addThirst(thirstData(2, 0.5f));
        
        consumable(COItems.APPLE_JAM.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.BLACKBERRY_JAM.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.BLUEBERRY_JAM.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.CANTALOUPE_JAM.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.CHERRY_JAM.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.CRANBERRY_JAM.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.CRIMSONBERRY_JAM.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.GOLDENBERRY_JAM.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.MANGO_JAM.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.MELON_JAM.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.PLUM_JAM.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.RASPBERRY_JAM.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.STRAWBERRY_JAM.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.WATERMELON_JAM.get()).addThirst(thirstData(2, 0.3f));

        consumable(COItems.APPLE_COCKTAIL.get()).addThirst(thirstData(5, 0.7f));
        consumable(COItems.BLACKBERRY_COCKTAIL.get()).addThirst(thirstData(5, 0.7f));
        consumable(COItems.BLUEBERRY_COCKTAIL.get()).addThirst(thirstData(5, 0.7f));
        consumable(COItems.CANTALOUPE_COCKTAIL.get()).addThirst(thirstData(5, 0.7f));
        consumable(COItems.CHERRY_COCKTAIL.get()).addThirst(thirstData(5, 0.7f));
        consumable(COItems.CRANBERRY_COCKTAIL.get()).addThirst(thirstData(5, 0.7f));
        consumable(COItems.CRIMSONBERRY_COCKTAIL.get()).addThirst(thirstData(5, 0.7f));
        consumable(COItems.GOLDENBERRY_COCKTAIL.get()).addThirst(thirstData(5, 0.7f));
        consumable(COItems.MANGO_COCKTAIL.get()).addThirst(thirstData(5, 0.7f));
        consumable(COItems.MELON_COCKTAIL.get()).addThirst(thirstData(5, 0.7f));
        consumable(COItems.PLUM_COCKTAIL.get()).addThirst(thirstData(5, 0.7f));
        consumable(COItems.RASPBERRY_COCKTAIL.get()).addThirst(thirstData(5, 0.7f));
        consumable(COItems.STRAWBERRY_COCKTAIL.get()).addThirst(thirstData(5, 0.7f));
        consumable(COItems.WATERMELON_COCKTAIL.get()).addThirst(thirstData(5, 0.7f));

        consumable(COItems.TEA.get()).addThirst(thirstData(5, 1.0f));
        consumable(COItems.APPLE_TEA.get()).addThirst(thirstData(5, 1.0f));
        consumable(COItems.BLACKBERRY_TEA.get()).addThirst(thirstData(5, 1.0f));
        consumable(COItems.BLUEBERRY_TEA.get()).addThirst(thirstData(5, 1.0f));
        consumable(COItems.CANTALOUPE_TEA.get()).addThirst(thirstData(5, 1.0f));
        consumable(COItems.CHERRY_TEA.get()).addThirst(thirstData(5, 1.0f));
        consumable(COItems.CRANBERRY_TEA.get()).addThirst(thirstData(5, 1.0f));
        consumable(COItems.CRIMSONBERRY_TEA.get()).addThirst(thirstData(5, 1.0f));
        consumable(COItems.GOLDENBERRY_TEA.get()).addThirst(thirstData(5, 1.0f));
        consumable(COItems.MANGO_TEA.get()).addThirst(thirstData(5, 1.0f));
        consumable(COItems.MELON_TEA.get()).addThirst(thirstData(5, 1.0f));
        consumable(COItems.PLUM_GELATIN.get()).addThirst(thirstData(5, 1.0f));
        consumable(COItems.RASPBERRY_TEA.get()).addThirst(thirstData(5, 1.0f));
        consumable(COItems.STRAWBERRY_TEA.get()).addThirst(thirstData(5, 1.0f));
        consumable(COItems.WATERMELON_TEA.get()).addThirst(thirstData(5, 1.0f));

        consumable(COItems.APPLE_MEAD.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.BLACKBERRY_MEAD.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.BLUEBERRY_MEAD.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.CANTALOUPE_MEAD.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.CHERRY_MEAD.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.CRANBERRY_MEAD.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.CRIMSONBERRY_MEAD.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.GOLDENBERRY_MEAD.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.MANGO_MEAD.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.MELON_MEAD.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.PLUM_MEAD.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.RASPBERRY_MEAD.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.STRAWBERRY_MEAD.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.WATERMELON_MEAD.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.HONEY_MEAD.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.MAGMA_CREAM_MEAD.get()).addThirst(thirstData(2, 0.3f));
        consumable(COItems.BEETROOT_MEAD.get()).addThirst(thirstData(2, 0.3f));
    }
}