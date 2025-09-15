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