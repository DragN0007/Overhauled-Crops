package com.dragn0007.dragncrops.datagen;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.items.COItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class COItemModelProvider extends ItemModelProvider {
    public COItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CropOverhaul.MODID, existingFileHelper);
    }

    @Override
    public void registerModels() {
        simpleItem(COItems.CROP_OVERHAUL);

        simpleItem(COItems.YELLOW_APPLE);
        simpleItem(COItems.GREEN_APPLE);
        simpleItem(COItems.YELLOW_CARROT);
        simpleItem(COItems.PURPLE_CARROT);
        simpleItem(COItems.RED_POTATO);
        simpleItem(COItems.PURPLE_POTATO);
        simpleItem(COItems.BLACKBERRY);
        simpleItem(COItems.BLUEBERRY);
        simpleItem(COItems.RASPBERRY);
        simpleItem(COItems.WHITE_RASPBERRY);
        simpleItem(COItems.CRANBERRY);
        simpleItem(COItems.STRAWBERRY);
        simpleItem(COItems.PEANUT);
        simpleItem(COItems.CUCUMBER);
        simpleItem(COItems.GARLIC);
        simpleItem(COItems.CORN);
        simpleItem(COItems.RICE);
        simpleItem(COItems.RYE);
        simpleItem(COItems.SUGAR_BEET);
        simpleItem(COItems.CANTALOUPE_SLICE);
        simpleItem(COItems.HONEYDEW_SLICE);
        simpleItem(COItems.CANTALOUPE);
        simpleItem(COItems.HONEYDEW);
        simpleItem(COItems.CHERRIES);
        simpleItem(COItems.MANGO);
        simpleItem(COItems.COCONUT);
        simpleItem(COItems.LIME);
        simpleItem(COItems.CILANTRO);
        simpleItem(COItems.OREGANO);
        simpleItem(COItems.ROSEMARY);

        simpleItem(COItems.CORN_SEEDS);
        simpleItem(COItems.RICE_SEEDS);
        simpleItem(COItems.RYE_SEEDS);
        simpleItem(COItems.CANTALOUPE_SEEDS);
        simpleItem(COItems.HONEYDEW_SEEDS);
        simpleItem(COItems.RED_APPLE_SEEDS);
        simpleItem(COItems.YELLOW_APPLE_SEEDS);
        simpleItem(COItems.GREEN_APPLE_SEEDS);
        simpleItem(COItems.LIME_SEEDS);
        simpleItem(COItems.MANGO_PIT);
        simpleItem(COItems.CHERRY_PIT);

        simpleItem(COItems.FLAIL);
        simpleItem(COItems.GRAIN);
        simpleItem(COItems.FLOUR);

        simpleItem(COItems.BLUEBERRY_BREAD);
        simpleItem(COItems.CRANBERRY_BREAD);
        simpleItem(COItems.NUT_BREAD);
        simpleItem(COItems.RYE_BREAD);
        simpleItem(COItems.WHITE_BREAD);
        simpleItem(COItems.CORN_BREAD);
        simpleItem(COItems.POTATO_BREAD);

        simpleItem(COItems.APPLE_JAM);
        simpleItem(COItems.BLACKBERRY_JAM);
        simpleItem(COItems.BLUEBERRY_JAM);
        simpleItem(COItems.CANTALOUPE_JAM);
        simpleItem(COItems.CHERRY_JAM);
        simpleItem(COItems.CRANBERRY_JAM);
        simpleItem(COItems.MANGO_JAM);
        simpleItem(COItems.MELON_JAM);
        simpleItem(COItems.RASPBERRY_JAM);
        simpleItem(COItems.STRAWBERRY_JAM);
        simpleItem(COItems.WATERMELON_JAM);

        simpleItem(COItems.APPLE_TART);
        simpleItem(COItems.BLACKBERRY_TART);
        simpleItem(COItems.BLUEBERRY_TART);
        simpleItem(COItems.CANTALOUPE_TART);
        simpleItem(COItems.CHERRY_TART);
        simpleItem(COItems.CRANBERRY_TART);
        simpleItem(COItems.MANGO_TART);
        simpleItem(COItems.MELON_TART);
        simpleItem(COItems.RASPBERRY_TART);
        simpleItem(COItems.STRAWBERRY_TART);
        simpleItem(COItems.WATERMELON_TART);

        simpleItem(COItems.APPLE_CANDY);
        simpleItem(COItems.BLACKBERRY_CANDY);
        simpleItem(COItems.BLUEBERRY_CANDY);
        simpleItem(COItems.CANTALOUPE_CANDY);
        simpleItem(COItems.CHERRY_CANDY);
        simpleItem(COItems.CRANBERRY_CANDY);
        simpleItem(COItems.MANGO_CANDY);
        simpleItem(COItems.MELON_CANDY);
        simpleItem(COItems.RASPBERRY_CANDY);
        simpleItem(COItems.STRAWBERRY_CANDY);
        simpleItem(COItems.WATERMELON_CANDY);

        simpleItem(COItems.EMPTY_CAN);
        simpleItem(COItems.CANNED_CARROTS);
        simpleItem(COItems.CANNED_POTATOES);
        simpleItem(COItems.CANNED_BEETS);
        simpleItem(COItems.CANNED_VEGETABLES);
        simpleItem(COItems.CANNED_FRUIT);
        simpleItem(COItems.CANNED_BEEF);

        simpleItem(COItems.GLASS_JAR);
        simpleItem(COItems.UNFERMENTED_PICKLES);
        simpleItem(COItems.FERMENTED_PICKLES);
        simpleItem(COItems.STOCK);
        simpleItem(COItems.VEGETABLE_SOUP);
        simpleItem(COItems.MEAT_AND_VEGETABLE_STEW);

        simpleItem(COItems.MEAT_MALLET);
        simpleItem(COItems.BEEF_SAUSAGE);
        simpleItem(COItems.DRIED_BEEF_SAUSAGE);
        simpleItem(COItems.COOKED_BEEF_SAUSAGE);
        simpleItem(COItems.CHICKEN_SAUSAGE);
        simpleItem(COItems.DRIED_CHICKEN_SAUSAGE);
        simpleItem(COItems.COOKED_CHICKEN_SAUSAGE);
        simpleItem(COItems.PORK_SAUSAGE);
        simpleItem(COItems.DRIED_PORK_SAUSAGE);
        simpleItem(COItems.COOKED_PORK_SAUSAGE);
        simpleItem(COItems.MUTTON_SAUSAGE);
        simpleItem(COItems.DRIED_MUTTON_SAUSAGE);
        simpleItem(COItems.COOKED_MUTTON_SAUSAGE);
        simpleItem(COItems.FISH_SAUSAGE);
        simpleItem(COItems.DRIED_FISH_SAUSAGE);
        simpleItem(COItems.COOKED_FISH_SAUSAGE);
        simpleItem(COItems.GENERIC_SAUSAGE);
        simpleItem(COItems.DRIED_GENERIC_SAUSAGE);
        simpleItem(COItems.COOKED_GENERIC_SAUSAGE);
        simpleItem(COItems.GAME_SAUSAGE);
        simpleItem(COItems.DRIED_GAME_SAUSAGE);
        simpleItem(COItems.COOKED_GAME_SAUSAGE);

        simpleItem(COItems.APPLE_MEAD);
        simpleItem(COItems.BLACKBERRY_MEAD);
        simpleItem(COItems.BLUEBERRY_MEAD);
        simpleItem(COItems.CANTALOUPE_MEAD);
        simpleItem(COItems.CHERRY_MEAD);
        simpleItem(COItems.CRANBERRY_MEAD);
        simpleItem(COItems.MANGO_MEAD);
        simpleItem(COItems.MELON_MEAD);
        simpleItem(COItems.RASPBERRY_MEAD);
        simpleItem(COItems.STRAWBERRY_MEAD);
        simpleItem(COItems.WATERMELON_MEAD);
        simpleItem(COItems.HONEY_MEAD);
        simpleItem(COItems.MAGMA_CREAM_MEAD);
        simpleItem(COItems.BEETROOT_MEAD);

        advancedItem(COItems.UNFERMENTED_APPLE_MEAD, "unfermented_mead");
        advancedItem(COItems.UNFERMENTED_BLACKBERRY_MEAD, "unfermented_mead");
        advancedItem(COItems.UNFERMENTED_BLUEBERRY_MEAD, "unfermented_mead");
        advancedItem(COItems.UNFERMENTED_CANTALOUPE_MEAD, "unfermented_mead");
        advancedItem(COItems.UNFERMENTED_CHERRY_MEAD, "unfermented_mead");
        advancedItem(COItems.UNFERMENTED_CRANBERRY_MEAD, "unfermented_mead");
        advancedItem(COItems.UNFERMENTED_MANGO_MEAD, "unfermented_mead");
        advancedItem(COItems.UNFERMENTED_MELON_MEAD, "unfermented_mead");
        advancedItem(COItems.UNFERMENTED_RASPBERRY_MEAD, "unfermented_mead");
        advancedItem(COItems.UNFERMENTED_STRAWBERRY_MEAD, "unfermented_mead");
        advancedItem(COItems.UNFERMENTED_WATERMELON_MEAD, "unfermented_mead");
        advancedItem(COItems.UNFERMENTED_HONEY_MEAD, "unfermented_mead");
        advancedItem(COItems.UNFERMENTED_MAGMA_CREAM_MEAD, "unfermented_mead");
        advancedItem(COItems.UNFERMENTED_BEETROOT_MEAD, "unfermented_mead");

        simpleItem(COItems.APPLE_GELATIN);
        simpleItem(COItems.BLACKBERRY_GELATIN);
        simpleItem(COItems.BLUEBERRY_GELATIN);
        simpleItem(COItems.CANTALOUPE_GELATIN);
        simpleItem(COItems.CHERRY_GELATIN);
        simpleItem(COItems.CRANBERRY_GELATIN);
        simpleItem(COItems.MANGO_GELATIN);
        simpleItem(COItems.MELON_GELATIN);
        simpleItem(COItems.RASPBERRY_GELATIN);
        simpleItem(COItems.STRAWBERRY_GELATIN);
        simpleItem(COItems.WATERMELON_GELATIN);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CropOverhaul.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockSpriteItem(RegistryObject<net.minecraft.world.level.block.Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CropOverhaul.MODID,"item/" + block.getId().getPath()));
    }

    private ItemModelBuilder advancedItem(RegistryObject<Item> item, String getTextureName) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CropOverhaul.MODID,"item/" + getTextureName));
    }
}