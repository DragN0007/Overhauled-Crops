package com.dragn0007.dragncrops.blocks;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.blocks.crop.*;
import com.dragn0007.dragncrops.blocks.crop.base.WildCropBlock;
import com.dragn0007.dragncrops.blocks.custom.*;
import com.dragn0007.dragncrops.blocks.pixel_placement.util.PixelPlacer;
import com.dragn0007.dragncrops.blocks.pixel_placement.util.PixelPlacerContainer;
import com.dragn0007.dragncrops.blocks.pixel_placement.util.PixelPlacerEntity;
import com.dragn0007.dragncrops.blocks.pixel_placement.util.PixelPlacerItem;
import com.dragn0007.dragncrops.items.COItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class COBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, CropOverhaul.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES
            = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CropOverhaul.MODID);

    public static final RegistryObject<Block> BLACKBERRIES = registerBlockWithoutItem("blackberries",
            () -> new BlackberryBushBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).noCollission()));
    public static final RegistryObject<Block> BLUEBERRIES = registerBlockWithoutItem("blueberries",
            () -> new BlueberryBushBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).noCollission()));
    public static final RegistryObject<Block> RASPBERRIES = registerBlockWithoutItem("raspberries",
            () -> new RaspberryBushBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).noCollission()));
    public static final RegistryObject<Block> WHITE_RASPBERRIES = registerBlockWithoutItem("white_raspberries",
            () -> new WhiteRaspberryBushBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).noCollission()));

    public static final RegistryObject<Block> WILD_CARROTS = registerBlockWithoutItem("wild_carrots",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_POTATOES = registerBlockWithoutItem("wild_potatoes",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_WHEAT = registerBlockWithoutItem("wild_wheat",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));
    public static final RegistryObject<Block> WILD_BEETROOTS = registerBlockWithoutItem("wild_beetroots",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));

    public static final RegistryObject<Block> YELLOW_CARROTS = registerBlockWithoutItem("yellow_carrots",
            () -> new YellowCarrotBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_YELLOW_CARROTS = registerBlockWithoutItem("wild_yellow_carrots",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));
    public static final RegistryObject<Block> PURPLE_CARROTS = registerBlockWithoutItem("purple_carrots",
            () -> new PurpleCarrotBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_PURPLE_CARROTS = registerBlockWithoutItem("wild_purple_carrots",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));
    public static final RegistryObject<Block> RED_POTATOES = registerBlockWithoutItem("red_potatoes",
            () -> new RedPotatoBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES).noCollission()));
    public static final RegistryObject<Block> WILD_RED_POTATOES = registerBlockWithoutItem("wild_red_potatoes",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));
    public static final RegistryObject<Block> PURPLE_POTATOES = registerBlockWithoutItem("purple_potatoes",
            () -> new PurplePotatoBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES).noCollission()));
    public static final RegistryObject<Block> WILD_PURPLE_POTATOES = registerBlockWithoutItem("wild_purple_potatoes",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));


    public static final RegistryObject<Block> CORN = registerBlockWithoutItem("corn",
            () -> new CornBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission()));
    public static final RegistryObject<Block> WILD_CORN = registerBlockWithoutItem("wild_corn",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));

    public static final RegistryObject<Block> RYE = registerBlockWithoutItem("rye",
            () -> new RyeBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission()));
    public static final RegistryObject<Block> WILD_RYE = registerBlockWithoutItem("wild_rye",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));
    public static final RegistryObject<Block> CRANBERRIES = registerBlockWithoutItem("cranberries",
            () -> new CranberryBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission()));
    public static final RegistryObject<Block> WILD_CRANBERRIES = registerBlockWithoutItem("wild_cranberries",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));
    public static final RegistryObject<Block> STRAWBERRIES = registerBlockWithoutItem("strawberries",
            () -> new StrawberryBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission()));
    public static final RegistryObject<Block> WILD_STRAWBERRIES = registerBlockWithoutItem("wild_strawberries",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));
    public static final RegistryObject<Block> PEANUTS = registerBlockWithoutItem("peanuts",
            () -> new PeanutBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission()));
    public static final RegistryObject<Block> WILD_PEANUTS = registerBlockWithoutItem("wild_peanuts",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));

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

    public static final RegistryObject<TartBlock> APPLE_TART = registerPixelPlacerWithoutItem("apple_tart", TartBlock::new);
    public static final RegistryObject<TartBlock> BLACKBERRY_TART = registerPixelPlacerWithoutItem("blackberry_tart", TartBlock::new);
    public static final RegistryObject<TartBlock> BLUEBERRY_TART = registerPixelPlacerWithoutItem("blueberry_tart", TartBlock::new);
    public static final RegistryObject<TartBlock> CANTALOUPE_TART = registerPixelPlacerWithoutItem("cantaloupe_tart", TartBlock::new);
    public static final RegistryObject<TartBlock> CHERRY_TART = registerPixelPlacerWithoutItem("cherry_tart", TartBlock::new);
    public static final RegistryObject<TartBlock> CRANBERRY_TART = registerPixelPlacerWithoutItem("cranberry_tart", TartBlock::new);
    public static final RegistryObject<TartBlock> MANGO_TART = registerPixelPlacerWithoutItem("mango_tart", TartBlock::new);
    public static final RegistryObject<TartBlock> MELON_TART = registerPixelPlacerWithoutItem("melon_tart", TartBlock::new);
    public static final RegistryObject<TartBlock> RASPBERRY_TART = registerPixelPlacerWithoutItem("raspberry_tart", TartBlock::new);
    public static final RegistryObject<TartBlock> STRAWBERRY_TART = registerPixelPlacerWithoutItem("strawberry_tart", TartBlock::new);
    public static final RegistryObject<TartBlock> WATERMELON_TART = registerPixelPlacerWithoutItem("watermelon_tart", TartBlock::new);

    public static final RegistryObject<Block> APPLE_CANDY = registerBlockWithoutItem("apple_candy", CandyBlock::new);
    public static final RegistryObject<Block> BLACKBERRY_CANDY = registerBlockWithoutItem("blackberry_candy", CandyBlock::new);
    public static final RegistryObject<Block> BLUEBERRY_CANDY = registerBlockWithoutItem("blueberry_candy", CandyBlock::new);
    public static final RegistryObject<Block> CANTALOUPE_CANDY = registerBlockWithoutItem("cantaloupe_candy", CandyBlock::new);
    public static final RegistryObject<Block> CHERRY_CANDY = registerBlockWithoutItem("cherry_candy", CandyBlock::new);
    public static final RegistryObject<Block> CRANBERRY_CANDY = registerBlockWithoutItem("cranberry_candy", CandyBlock::new);
    public static final RegistryObject<Block> MANGO_CANDY = registerBlockWithoutItem("mango_candy", CandyBlock::new);
    public static final RegistryObject<Block> MELON_CANDY = registerBlockWithoutItem("melon_candy", CandyBlock::new);
    public static final RegistryObject<Block> RASPBERRY_CANDY = registerBlockWithoutItem("raspberry_candy", CandyBlock::new);
    public static final RegistryObject<Block> STRAWBERRY_CANDY = registerBlockWithoutItem("strawberry_candy", CandyBlock::new);
    public static final RegistryObject<Block> WATERMELON_CANDY = registerBlockWithoutItem("watermelon_candy", CandyBlock::new);


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

    public static final RegistryObject<PixelPlacerContainer> PIXEL_PLACER_CONTAINER = BLOCKS.register("pixel_placer_container", PixelPlacerContainer::new);

    public static final RegistryObject<BlockEntityType<PixelPlacerEntity>> PIXEL_PLACER_ENTITY = BLOCK_ENTITIES.register("pixel_placer_container",
            () -> BlockEntityType.Builder.of(PixelPlacerEntity::new, PIXEL_PLACER_CONTAINER.get()).build(null));

    protected static <T extends PixelPlacer>RegistryObject<T> registerPixelPlacer(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        COItems.ITEMS.register(name, () -> new PixelPlacerItem(toReturn.get(), new Item.Properties()));
        return toReturn;
    }

    protected static <T extends PixelPlacer>RegistryObject<T> registerPixelPlacerWithoutItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        BLOCK_ENTITIES.register(eventBus);
    }
}
