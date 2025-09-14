package com.dragn0007.dragncrops.datagen;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.blocks.crop.base.OBushBlock;
import com.dragn0007.dragncrops.blocks.crop.base.OCropBlock;
import com.dragn0007.dragncrops.blocks.crop.base.FruitLeaves;
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
        simpleBlock(COBlocks.WILD_CARROTS.get(), models().cross(COBlocks.WILD_CARROTS.getId().getPath(),
                wildVanillaPlantTexture("carrots_stage3")).renderType("cutout"));

        simpleBlock(COBlocks.WILD_POTATOES.get(), models().cross(COBlocks.WILD_POTATOES.getId().getPath(),
                wildVanillaPlantTexture("potatoes_stage3")).renderType("cutout"));

//        simpleBlock(COBlocks.WILD_WHEAT.get(), models().cross(COBlocks.WILD_WHEAT.getId().getPath(),
//                wildVanillaPlantTexture("wheat_stage7")).renderType("cutout"));

        simpleBlock(COBlocks.WILD_BEETROOTS.get(), models().cross(COBlocks.WILD_BEETROOTS.getId().getPath(),
                wildVanillaPlantTexture("beetroots_stage3")).renderType("cutout"));


        createBush((OBushBlock) COBlocks.BLACKBERRIES.get(), "blackberries", "blackberries",
                0, 1, 2, 3, 4);

        createBush((OBushBlock) COBlocks.BLUEBERRIES.get(), "blueberries", "blueberries",
                0, 1, 2, 3, 4);

        createBush((OBushBlock) COBlocks.RASPBERRIES.get(), "raspberries", "raspberries",
                0, 1, 2, 3, 4);

        createBush((OBushBlock) COBlocks.WHITE_RASPBERRIES.get(), "white_raspberries", "white_raspberries",
                0, 1, 2, 3, 4);


        createCrop((OCropBlock) COBlocks.PURPLE_CARROTS.get(), "purple_carrots", "purple_carrots",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(COBlocks.WILD_PURPLE_CARROTS.get(), models().cross(COBlocks.WILD_PURPLE_CARROTS.getId().getPath(),
                wildPlantTexture("purple_carrots_stage3")).renderType("cutout"));

        createCrop((OCropBlock) COBlocks.YELLOW_CARROTS.get(), "yellow_carrots", "yellow_carrots",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(COBlocks.WILD_YELLOW_CARROTS.get(), models().cross(COBlocks.WILD_YELLOW_CARROTS.getId().getPath(),
                wildPlantTexture("yellow_carrots_stage3")).renderType("cutout"));

        createCrop((OCropBlock) COBlocks.PURPLE_POTATOES.get(), "purple_potatoes", "purple_potatoes",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(COBlocks.WILD_PURPLE_POTATOES.get(), models().cross(COBlocks.WILD_PURPLE_POTATOES.getId().getPath(),
                wildPlantTexture("purple_potatoes_stage3")).renderType("cutout"));

        createCrop((OCropBlock) COBlocks.RED_POTATOES.get(), "red_potatoes", "red_potatoes",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(COBlocks.WILD_RED_POTATOES.get(), models().cross(COBlocks.WILD_RED_POTATOES.getId().getPath(),
                wildPlantTexture("red_potatoes_stage3")).renderType("cutout"));

        createCrop((OCropBlock) COBlocks.CRANBERRIES.get(), "cranberries", "cranberries",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(COBlocks.WILD_CRANBERRIES.get(), models().cross(COBlocks.WILD_CRANBERRIES.getId().getPath(),
                wildPlantTexture("cranberries_stage3")).renderType("cutout"));

        createCrop((OCropBlock) COBlocks.STRAWBERRIES.get(), "strawberries", "strawberries",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(COBlocks.WILD_STRAWBERRIES.get(), models().cross(COBlocks.WILD_STRAWBERRIES.getId().getPath(),
                wildPlantTexture("strawberries_stage3")).renderType("cutout"));

        createCrop((OCropBlock) COBlocks.PEANUTS.get(), "peanuts", "peanuts",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(COBlocks.WILD_PEANUTS.get(), models().cross(COBlocks.WILD_PEANUTS.getId().getPath(),
                wildPlantTexture("peanuts_stage3")).renderType("cutout"));

        createCrop((OCropBlock) COBlocks.CUCUMBERS.get(), "cucumbers", "cucumbers",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(COBlocks.WILD_CUCUMBERS.get(), models().cross(COBlocks.WILD_CUCUMBERS.getId().getPath(),
                wildPlantTexture("cucumbers_stage3")).renderType("cutout"));

        createCrop((OCropBlock) COBlocks.GARLIC.get(), "garlic", "garlic",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(COBlocks.WILD_GARLIC.get(), models().cross(COBlocks.WILD_GARLIC.getId().getPath(),
                wildPlantTexture("garlic_stage3")).renderType("cutout"));

        createCrop((OCropBlock) COBlocks.RICE.get(), "rice", "rice",
                0, 0, 1, 1, 2, 2, 3, 4);
        simpleBlock(COBlocks.WILD_RICE.get(), models().cross(COBlocks.WILD_RICE.getId().getPath(),
                wildPlantTexture("rice_stage4")).renderType("cutout"));

        createCrop((OCropBlock) COBlocks.SUGAR_BEETS.get(), "sugar_beets", "sugar_beets",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(COBlocks.WILD_SUGAR_BEETS.get(), models().cross(COBlocks.WILD_SUGAR_BEETS.getId().getPath(),
                wildPlantTexture("sugar_beets_stage3")).renderType("cutout"));

        createCrop((OCropBlock) COBlocks.CILANTRO.get(), "cilantro", "cilantro",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(COBlocks.WILD_CILANTRO.get(), models().cross(COBlocks.WILD_CILANTRO.getId().getPath(),
                wildPlantTexture("cilantro_stage3")).renderType("cutout"));

        createCrop((OCropBlock) COBlocks.OREGANO.get(), "oregano", "oregano",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(COBlocks.WILD_OREGANO.get(), models().cross(COBlocks.WILD_OREGANO.getId().getPath(),
                wildPlantTexture("oregano_stage3")).renderType("cutout"));

        createCrop((OCropBlock) COBlocks.ROSEMARY.get(), "rosemary", "rosemary",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(COBlocks.WILD_ROSEMARY.get(), models().cross(COBlocks.WILD_ROSEMARY.getId().getPath(),
                wildPlantTexture("rosemary_stage3")).renderType("cutout"));


        createLeaves((FruitLeaves) COBlocks.RED_APPLE_LEAVES.get(), "red_apple_leaves", "red_apple_leaves",
                0, 1, 2, 3);

        createLeaves((FruitLeaves) COBlocks.YELLOW_APPLE_LEAVES.get(), "yellow_apple_leaves", "yellow_apple_leaves",
                0, 1, 2, 3);

        createLeaves((FruitLeaves) COBlocks.GREEN_APPLE_LEAVES.get(), "green_apple_leaves", "green_apple_leaves",
                0, 1, 2, 3);

//        createCrop((OCropBlock) COBlocks.CORN.get(), "corn", "corn",
//                0, 1, 2, 3, 4, 5, 6, 7);
//        simpleBlock(COBlocks.WILD_CORN.get(), models().cross(COBlocks.WILD_CORN.getId().getPath(),
//                wildPlantTexture("corn_stage7")).renderType("cutout"));

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

    public void createBush(OBushBlock block, String modelNamePrefix, String textureNamePrefix, int... stageMap) {
        Property<Integer> ageProperty = block.getAgeProperty();
        int maxAge = Collections.max(ageProperty.getPossibleValues());

        if (stageMap == null || stageMap.length == 0) {
            stageMap = new int[maxAge + 1];
            for (int i = 0; i <= maxAge; i++) {
                stageMap[i] = i;
            }
        }

        final int[] finalStageMap = stageMap;

        getVariantBuilder(block).forAllStates(state -> {
            int age = state.getValue(ageProperty);
            int stage = finalStageMap[age];
            String modelName = modelNamePrefix + "_stage" + stage;
            String texturePath = textureNamePrefix + "_stage" + stage;

            return ConfiguredModel.builder()
                    .modelFile(models().cross(modelName, new ResourceLocation(CropOverhaul.MODID, "block/" + texturePath))
                            .renderType("cutout"))
                    .build();
        });
    }

    public void createLeaves(FruitLeaves block, String modelNamePrefix, String textureNamePrefix, int... stageMap) {
        Property<Integer> ageProperty = block.getAgeProperty();
        int maxAge = Collections.max(ageProperty.getPossibleValues());

        if (stageMap == null || stageMap.length == 0) {
            stageMap = new int[maxAge + 1];
            for (int i = 0; i <= maxAge; i++) {
                stageMap[i] = i;
            }
        }

        final int[] finalStageMap = stageMap;

        getVariantBuilder(block).forAllStates(state -> {
            int age = state.getValue(ageProperty);
            int stage = finalStageMap[age];
            String modelName = modelNamePrefix + "_stage" + stage;
            String texturePath = textureNamePrefix + "_stage" + stage;

            return ConfiguredModel.builder()
                    .modelFile(models().cubeAll(modelName, new ResourceLocation(CropOverhaul.MODID, "block/" + texturePath))
                            .renderType("cutout"))
                    .build();
        });
    }

    public ResourceLocation wildPlantTexture(String getTextureName) {
        return new ResourceLocation(CropOverhaul.MODID,"block/" + getTextureName);
    }

    public ResourceLocation wildVanillaPlantTexture(String getTextureName) {
        return new ResourceLocation("block/" + getTextureName);
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(CropOverhaul.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
