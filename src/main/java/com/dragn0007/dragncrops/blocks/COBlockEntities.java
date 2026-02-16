package com.dragn0007.dragncrops.blocks;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.blocks.custom.entity.PotBlockEntity;
import com.dragn0007.dragncrops.blocks.custom.entity.TeapotBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class COBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CropOverhaul.MODID);

    public static final RegistryObject<BlockEntityType<TeapotBlockEntity>> TEAPOT =
            BLOCK_ENTITIES.register("teapot_entity", () ->
                    BlockEntityType.Builder.of(TeapotBlockEntity::new,
                            COBlocks.BLACK_TEAPOT.get(), COBlocks.DEEPSLATE_TEAPOT.get(), COBlocks.GOLD_TEAPOT.get(),
                            COBlocks.IRON_TEAPOT.get(), COBlocks.STONE_TEAPOT.get(), COBlocks.TERRACOTTA_TEAPOT.get(),
                            COBlocks.WHITE_TEAPOT.get()
                            ).build(null));

    public static final RegistryObject<BlockEntityType<PotBlockEntity>> POT =
            BLOCK_ENTITIES.register("pot_entity", () ->
                    BlockEntityType.Builder.of(PotBlockEntity::new,
                            COBlocks.DEEPSLATE_POT.get(), COBlocks.IRON_POT.get(),
                            COBlocks.STONE_POT.get(), COBlocks.TERRACOTTA_POT.get()
                    ).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}