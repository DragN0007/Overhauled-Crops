package com.dragn0007.dragncrops.blocks;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.blocks.crop.PurpleCarrotBlock;
import com.dragn0007.dragncrops.blocks.crop.PurplePotatoBlock;
import com.dragn0007.dragncrops.blocks.crop.RedPotatoBlock;
import com.dragn0007.dragncrops.blocks.crop.YellowCarrotBlock;
import com.dragn0007.dragncrops.blocks.custom.AppleBlock;
import com.dragn0007.dragncrops.blocks.custom.BreadBlock;
import com.dragn0007.dragncrops.blocks.custom.GrainBlock;
import com.dragn0007.dragncrops.blocks.custom.JamJarBlock;
import com.dragn0007.dragncrops.items.COItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class COBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, CropOverhaul.MODID);

    public static final RegistryObject<Block> YELLOW_CARROTS = registerBlockWithoutItem("yellow_carrots",
            () -> new YellowCarrotBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> PURPLE_CARROTS = registerBlockWithoutItem("purple_carrots",
            () -> new PurpleCarrotBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> RED_POTATOES = registerBlockWithoutItem("red_potatoes",
            () -> new RedPotatoBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES).noCollission()));
    public static final RegistryObject<Block> PURPLE_POTATOES = registerBlockWithoutItem("purple_potatoes",
            () -> new PurplePotatoBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES).noCollission()));

    public static final RegistryObject<Block> WHEAT_GRAIN = registerBlockWithoutItem("wheat_grain",
            ()-> new GrainBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).sound(SoundType.GRASS).noOcclusion().strength(0.5f, 0.5f)
                    .requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> RYE_GRAIN = registerBlockWithoutItem("rye_grain",
            ()-> new GrainBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).sound(SoundType.GRASS).noOcclusion().strength(0.5f, 0.5f)
                    .requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> RICE_GRAIN = registerBlockWithoutItem("rice_grain",
            ()-> new GrainBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).sound(SoundType.GRASS).noOcclusion().strength(0.5f, 0.5f)
                    .requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> CORN_GRAIN = registerBlockWithoutItem("corn_grain",
            ()-> new GrainBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).sound(SoundType.GRASS).noOcclusion().strength(0.5f, 0.5f)
                    .requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<Block> RED_APPLE = registerBlockWithoutItem("red_apple", AppleBlock::new);
    public static final RegistryObject<Block> YELLOW_APPLE = registerBlockWithoutItem("yellow_apple", AppleBlock::new);
    public static final RegistryObject<Block> GREEN_APPLE = registerBlockWithoutItem("green_apple", AppleBlock::new);

    public static final RegistryObject<Block> BREAD = registerBlockWithoutItem("bread", BreadBlock::new);
    public static final RegistryObject<Block> BLUEBERRY_BREAD = registerBlockWithoutItem("blueberry_bread", BreadBlock::new);
    public static final RegistryObject<Block> CRANBERRY_BREAD = registerBlockWithoutItem("cranberry_bread", BreadBlock::new);
    public static final RegistryObject<Block> NUT_BREAD = registerBlockWithoutItem("nut_bread", BreadBlock::new);
    public static final RegistryObject<Block> RYE_BREAD = registerBlockWithoutItem("rye_bread", BreadBlock::new);
    public static final RegistryObject<Block> WHITE_BREAD = registerBlockWithoutItem("white_bread", BreadBlock::new);

    public static final RegistryObject<Block> APPLE_JAM = registerBlockWithoutItem("apple_jam", JamJarBlock::new);
    public static final RegistryObject<Block> BLACKBERRY_JAM = registerBlockWithoutItem("blackberry_jam", JamJarBlock::new);
    public static final RegistryObject<Block> BLUEBERRY_JAM = registerBlockWithoutItem("blueberry_jam", JamJarBlock::new);
    public static final RegistryObject<Block> CANTALOUPE_JAM = registerBlockWithoutItem("cantaloupe_jam", JamJarBlock::new);
    public static final RegistryObject<Block> CHERRY_JAM = registerBlockWithoutItem("cherry_jam", JamJarBlock::new);
    public static final RegistryObject<Block> CRANBERRY_JAM = registerBlockWithoutItem("cranberry_jam", JamJarBlock::new);
    public static final RegistryObject<Block> MANGO_JAM = registerBlockWithoutItem("mango_jam", JamJarBlock::new);
    public static final RegistryObject<Block> MELON_JAM = registerBlockWithoutItem("melon_jam", JamJarBlock::new);
    public static final RegistryObject<Block> RASPBERRY_JAM = registerBlockWithoutItem("raspberry_jam", JamJarBlock::new);
    public static final RegistryObject<Block> STRAWBERRY_JAM = registerBlockWithoutItem("strawberry_jam", JamJarBlock::new);
    public static final RegistryObject<Block> WATERMELON_JAM = registerBlockWithoutItem("watermelon_jam", JamJarBlock::new);

    public static <T extends Block>RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }
    public static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        COItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
