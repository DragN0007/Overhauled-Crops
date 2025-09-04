package com.dragn0007.dragncrops.datagen;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.items.COItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.mozilla.javascript.ast.Block;

public class COItemModelProvider extends ItemModelProvider {
    public COItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CropOverhaul.MODID, existingFileHelper);
    }

    @Override
    public void registerModels() {
        simpleItem(COItems.CROP_OVERHAUL);

        simpleBlockSpriteItem(COBlocks.BLACKBERRY_JAM);
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