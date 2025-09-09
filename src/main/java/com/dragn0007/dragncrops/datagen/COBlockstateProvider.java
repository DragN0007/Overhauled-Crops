package com.dragn0007.dragncrops.datagen;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.blocks.crop.base.OCropBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collections;

public class COBlockstateProvider extends BlockStateProvider {
    public COBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CropOverhaul.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        createCrop((OCropBlock) COBlocks.PURPLE_CARROTS.get(), "purple_carrots", "purple_carrots",
                0, 0, 1, 1, 2, 2, 2, 3);
        createCrop((OCropBlock) COBlocks.YELLOW_CARROTS.get(), "yellow_carrots", "yellow_carrots",
                0, 0, 1, 1, 2, 2, 2, 3);
        createCrop((OCropBlock) COBlocks.PURPLE_POTATOES.get(), "purple_potatoes", "purple_potatoes",
                0, 0, 1, 1, 2, 2, 2, 3);
        createCrop((OCropBlock) COBlocks.RED_POTATOES.get(), "red_potatoes", "red_potatoes",
                0, 0, 1, 1, 2, 2, 2, 3);

    }

    public void createCrop(OCropBlock block, String modelNamePrefix, String textureNamePrefix, int... stageMap) {
        Property<Integer> ageProperty = block.getAgeProperty();
        int maxAge = Collections.max(ageProperty.getPossibleValues());

        if (stageMap == null || stageMap.length == 0) {
            stageMap = new int[maxAge + 1];
            for (int i = 0; i <= maxAge; i++) {
                stageMap[i] = i;
            }
        }

        if (stageMap.length != maxAge + 1) {
            throw new IllegalArgumentException("stageMap length (" + stageMap.length +
                    ") must match the number of crop growth stages (" + (maxAge + 1) + ")");
        }

        final int[] finalStageMap = stageMap;

        getVariantBuilder(block).forAllStates(state -> {
            int age = state.getValue(ageProperty);
            int stage = finalStageMap[age];
            String modelName = modelNamePrefix + "_stage" + stage;
            String texturePath = textureNamePrefix + "_stage" + stage;

            return ConfiguredModel.builder()
                    .modelFile(models().crop(modelName, new ResourceLocation(CropOverhaul.MODID, "block/" + texturePath))
                    .renderType("cutout"))
                    .build();
        });
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(CropOverhaul.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
