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