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
import com.dragn0007.dragncrops.world.tree.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
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
    public static final RegistryObject<Block> CUCUMBERS = registerBlockWithoutItem("cucumbers",
            () -> new CucumbersBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission()));
    public static final RegistryObject<Block> WILD_CUCUMBERS = registerBlockWithoutItem("wild_cucumber",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));
    public static final RegistryObject<Block> GARLIC = registerBlockWithoutItem("garlic",
            () -> new GarlicBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission()));
    public static final RegistryObject<Block> WILD_GARLIC = registerBlockWithoutItem("wild_garlic",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));
    public static final RegistryObject<Block> RICE = registerBlockWithoutItem("rice",
            () -> new RiceBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission()));
    public static final RegistryObject<Block> WILD_RICE = registerBlockWithoutItem("wild_rice",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));
    public static final RegistryObject<Block> SUGAR_BEETS = registerBlockWithoutItem("sugar_beets",
            () -> new SugarBeetsBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission()));
    public static final RegistryObject<Block> WILD_SUGAR_BEETS = registerBlockWithoutItem("wild_sugar_beets",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));
    public static final RegistryObject<Block> CANTALOUPE = registerBlockWithoutItem("cantaloupe",
            () -> new CantaloupeBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission()));
    public static final RegistryObject<Block> WILD_CANTALOUPE = registerBlockWithoutItem("wild_cantaloupe",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));
    public static final RegistryObject<Block> HONEYDEW = registerBlockWithoutItem("honeydew",
            () -> new HoneydewBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission()));
    public static final RegistryObject<Block> WILD_HONEYDEW = registerBlockWithoutItem("wild_honeydew",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));
    public static final RegistryObject<Block> CILANTRO = registerBlockWithoutItem("cilantro",
            () -> new CilantroBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission()));
    public static final RegistryObject<Block> WILD_CILANTRO = registerBlockWithoutItem("wild_cilantro",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));
    public static final RegistryObject<Block> OREGANO = registerBlockWithoutItem("oregano",
            () -> new OreganoBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission()));
    public static final RegistryObject<Block> WILD_OREGANO = registerBlockWithoutItem("wild_oregano",
            () -> new WildCropBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission()));
    public static final RegistryObject<Block> ROSEMARY = registerBlockWithoutItem("rosemary",
            () -> new RosemaryBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission()));
    public static final RegistryObject<Block> WILD_ROSEMARY = registerBlockWithoutItem("wild_rosemary",
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

    public static final RegistryObject<Block> CANNED_CARROTS = registerBlockWithoutItem("canned_carrots", CanBlock::new);
    public static final RegistryObject<Block> CANNED_POTATOES = registerBlockWithoutItem("canned_potatoes", CanBlock::new);
    public static final RegistryObject<Block> CANNED_BEETS = registerBlockWithoutItem("canned_beets", CanBlock::new);
    public static final RegistryObject<Block> CANNED_VEGETABLES = registerBlockWithoutItem("canned_vegetables", CanBlock::new);
    public static final RegistryObject<Block> CANNED_FRUIT = registerBlockWithoutItem("canned_fruit", CanBlock::new);
    public static final RegistryObject<Block> CANNED_BEEF = registerBlockWithoutItem("canned_beef", CanBlock::new);

    public static final RegistryObject<Block> UNFERMENTED_PICKLES = registerBlockWithoutItem("unfermented_pickles", UnfermentedPickles::new);
    public static final RegistryObject<Block> FERMENTED_PICKLES = registerBlockWithoutItem("fermented_pickles", JarBlock::new);
    public static final RegistryObject<Block> STOCK = registerBlockWithoutItem("stock", JarBlock::new);
    public static final RegistryObject<Block> VEGETABLE_SOUP = registerBlockWithoutItem("vegetable_soup", JarBlock::new);
    public static final RegistryObject<Block> MEAT_AND_VEGETABLE_STEW = registerBlockWithoutItem("meat_and_vegetable_stew", JarBlock::new);

    public static final RegistryObject<Block> BEEF_SAUSAGE = registerBlockWithoutItem("beef_sausage", UndriedBeefSausage::new);
    public static final RegistryObject<Block> DRIED_BEEF_SAUSAGE = registerBlockWithoutItem("dried_beef_sausage", SausageBlock::new);
    public static final RegistryObject<Block> CHICKEN_SAUSAGE = registerBlockWithoutItem("chicken_sausage", UndriedChickenSausage::new);
    public static final RegistryObject<Block> DRIED_CHICKEN_SAUSAGE = registerBlockWithoutItem("dried_chicken_sausage", SausageBlock::new);
    public static final RegistryObject<Block> PORK_SAUSAGE = registerBlockWithoutItem("pork_sausage", UndriedPorkSausage::new);
    public static final RegistryObject<Block> DRIED_PORK_SAUSAGE = registerBlockWithoutItem("dried_pork_sausage", SausageBlock::new);
    public static final RegistryObject<Block> MUTTON_SAUSAGE = registerBlockWithoutItem("mutton_sausage", UndriedMuttonSausage::new);
    public static final RegistryObject<Block> DRIED_MUTTON_SAUSAGE = registerBlockWithoutItem("dried_mutton_sausage", SausageBlock::new);
    public static final RegistryObject<Block> FISH_SAUSAGE = registerBlockWithoutItem("fish_sausage", UndriedFishSausage::new);
    public static final RegistryObject<Block> DRIED_FISH_SAUSAGE = registerBlockWithoutItem("dried_fish_sausage", SausageBlock::new);
    public static final RegistryObject<Block> GENERIC_SAUSAGE = registerBlockWithoutItem("generic_sausage", UndriedGenericSausage::new);
    public static final RegistryObject<Block> DRIED_GENERIC_SAUSAGE = registerBlockWithoutItem("dried_generic_sausage", SausageBlock::new);
    public static final RegistryObject<Block> GAME_SAUSAGE = registerBlockWithoutItem("game_sausage", UndriedGameSausage::new);
    public static final RegistryObject<Block> DRIED_GAME_SAUSAGE = registerBlockWithoutItem("dried_game_sausage", SausageBlock::new);

    public static final RegistryObject<Block> UNFERMENTED_HONEY_MEAD = registerBlockWithoutItem("unfermented_honey_mead", UnfermentedHoneyMead::new);
    public static final RegistryObject<Block> FERMENTED_HONEY_MEAD = registerBlockWithoutItem("fermented_honey_mead", MeadJarBlock::new);
    public static final RegistryObject<Block> UNFERMENTED_APPLE_MEAD = registerBlockWithoutItem("unfermented_apple_mead", UnfermentedAppleMead::new);
    public static final RegistryObject<Block> FERMENTED_APPLE_MEAD = registerBlockWithoutItem("fermented_apple_mead", MeadJarBlock::new);
    public static final RegistryObject<Block> UNFERMENTED_BLACKBERRY_MEAD = registerBlockWithoutItem("unfermented_blackberry_mead", UnfermentedBlackberryMead::new);
    public static final RegistryObject<Block> FERMENTED_BLACKBERRY_MEAD = registerBlockWithoutItem("fermented_blackberry_mead", MeadJarBlock::new);
    public static final RegistryObject<Block> UNFERMENTED_BLUEBERRY_MEAD = registerBlockWithoutItem("unfermented_blueberry_mead", UnfermentedBlueberryMead::new);
    public static final RegistryObject<Block> FERMENTED_BLUEBERRY_MEAD = registerBlockWithoutItem("fermented_blueberry_mead", MeadJarBlock::new);
    public static final RegistryObject<Block> UNFERMENTED_CANTALOUPE_MEAD = registerBlockWithoutItem("unfermented_cantaloupe_mead", UnfermentedCantaloupeMead::new);
    public static final RegistryObject<Block> FERMENTED_CANTALOUPE_MEAD = registerBlockWithoutItem("fermented_cantaloupe_mead", MeadJarBlock::new);
    public static final RegistryObject<Block> UNFERMENTED_CHERRY_MEAD = registerBlockWithoutItem("unfermented_cherry_mead", UnfermentedCherryMead::new);
    public static final RegistryObject<Block> FERMENTED_CHERRY_MEAD = registerBlockWithoutItem("fermented_cherry_mead", MeadJarBlock::new);
    public static final RegistryObject<Block> UNFERMENTED_CRANBERRY_MEAD = registerBlockWithoutItem("unfermented_cranberry_mead", UnfermentedCranberryMead::new);
    public static final RegistryObject<Block> FERMENTED_CRANBERRY_MEAD = registerBlockWithoutItem("fermented_cranberry_mead", MeadJarBlock::new);
    public static final RegistryObject<Block> UNFERMENTED_MANGO_MEAD = registerBlockWithoutItem("unfermented_mango_mead", UnfermentedMangoMead::new);
    public static final RegistryObject<Block> FERMENTED_MANGO_MEAD = registerBlockWithoutItem("fermented_mango_mead", MeadJarBlock::new);
    public static final RegistryObject<Block> UNFERMENTED_MELON_MEAD = registerBlockWithoutItem("unfermented_melon_mead", UnfermentedMelonMead::new);
    public static final RegistryObject<Block> FERMENTED_MELON_MEAD = registerBlockWithoutItem("fermented_melon_mead", MeadJarBlock::new);
    public static final RegistryObject<Block> UNFERMENTED_RASPBERRY_MEAD = registerBlockWithoutItem("unfermented_raspberry_mead", UnfermentedRaspberryMead::new);
    public static final RegistryObject<Block> FERMENTED_RASPBERRY_MEAD = registerBlockWithoutItem("fermented_raspberry_mead", MeadJarBlock::new);
    public static final RegistryObject<Block> UNFERMENTED_STRAWBERRY_MEAD = registerBlockWithoutItem("unfermented_strawberry_mead", UnfermentedStrawberryMead::new);
    public static final RegistryObject<Block> FERMENTED_STRAWBERRY_MEAD = registerBlockWithoutItem("fermented_strawberry_mead", MeadJarBlock::new);
    public static final RegistryObject<Block> UNFERMENTED_WATERMELON_MEAD = registerBlockWithoutItem("unfermented_watermelon_mead", UnfermentedWatermelonMead::new);
    public static final RegistryObject<Block> FERMENTED_WATERMELON_MEAD = registerBlockWithoutItem("fermented_watermelon_mead", MeadJarBlock::new);
    public static final RegistryObject<Block> UNFERMENTED_MAGMA_CREAM_MEAD = registerBlockWithoutItem("unfermented_magma_cream_mead", UnfermentedMagmaCreamMead::new);
    public static final RegistryObject<Block> FERMENTED_MAGMA_CREAM_MEAD = registerBlockWithoutItem("fermented_magma_cream_mead", MeadJarBlock::new);
    public static final RegistryObject<Block> UNFERMENTED_BEETROOT_MEAD = registerBlockWithoutItem("unfermented_beetroot_mead", UnfermentedBeetrootMead::new);
    public static final RegistryObject<Block> FERMENTED_BEETROOT_MEAD = registerBlockWithoutItem("fermented_beetroot_mead", MeadJarBlock::new);

    public static final RegistryObject<Block> HONEY_MEAD = registerBlockWithoutItem("honey_mead", MeadBottleBlock::new);
    public static final RegistryObject<Block> APPLE_MEAD = registerBlockWithoutItem("apple_mead", MeadBottleBlock::new);
    public static final RegistryObject<Block> BLACKBERRY_MEAD = registerBlockWithoutItem("blackberry_mead", MeadBottleBlock::new);
    public static final RegistryObject<Block> BLUEBERRY_MEAD = registerBlockWithoutItem("blueberry_mead", MeadBottleBlock::new);
    public static final RegistryObject<Block> CANTALOUPE_MEAD = registerBlockWithoutItem("cantaloupe_mead", MeadBottleBlock::new);
    public static final RegistryObject<Block> CHERRY_MEAD = registerBlockWithoutItem("cherry_mead", MeadBottleBlock::new);
    public static final RegistryObject<Block> CRANBERRY_MEAD = registerBlockWithoutItem("cranberry_mead", MeadBottleBlock::new);
    public static final RegistryObject<Block> MANGO_MEAD = registerBlockWithoutItem("mango_mead", MeadBottleBlock::new);
    public static final RegistryObject<Block> MELON_MEAD = registerBlockWithoutItem("melon_mead", MeadBottleBlock::new);
    public static final RegistryObject<Block> RASPBERRY_MEAD = registerBlockWithoutItem("raspberry_mead", MeadBottleBlock::new);
    public static final RegistryObject<Block> STRAWBERRY_MEAD = registerBlockWithoutItem("strawberry_mead", MeadBottleBlock::new);
    public static final RegistryObject<Block> WATERMELON_MEAD = registerBlockWithoutItem("watermelon_mead", MeadBottleBlock::new);
    public static final RegistryObject<Block> MAGMA_CREAM_MEAD = registerBlockWithoutItem("magma_cream_mead", MeadBottleBlock::new);
    public static final RegistryObject<Block> BEETROOT_MEAD = registerBlockWithoutItem("beetroot_mead", MeadBottleBlock::new);

    public static final RegistryObject<Block> RED_APPLE_SAPLING = registerBlockWithoutItem("red_apple_sapling",
            () -> new SaplingBlock(new RedAppleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> RED_APPLE_LEAVES = registerBlock("red_apple_leaves",
            () -> new RedAppleLeaves(Block.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> YELLOW_APPLE_SAPLING = registerBlockWithoutItem("yellow_apple_sapling",
            () -> new SaplingBlock(new YellowAppleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> YELLOW_APPLE_LEAVES = registerBlock("yellow_apple_leaves",
            () -> new YellowAppleLeaves(Block.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> GREEN_APPLE_SAPLING = registerBlockWithoutItem("green_apple_sapling",
            () -> new SaplingBlock(new GreenAppleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> GREEN_APPLE_LEAVES = registerBlock("green_apple_leaves",
            () -> new GreenAppleLeaves(Block.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> COCONUT_SAPLING = registerBlockWithoutItem("coconut_sapling",
            () -> new SaplingBlock(new CoconutTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> COCONUT_LEAVES = registerBlock("coconut_leaves",
            () -> new CoconutLeaves(Block.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> MANGO_SAPLING = registerBlockWithoutItem("mango_sapling",
            () -> new SaplingBlock(new MangoTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> MANGO_LEAVES = registerBlock("mango_leaves",
            () -> new MangoLeaves(Block.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> LIME_SAPLING = registerBlockWithoutItem("lime_sapling",
            () -> new SaplingBlock(new LimeTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> LIME_LEAVES = registerBlock("lime_leaves",
            () -> new LimeLeaves(Block.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> CHERRY_SAPLING = registerBlockWithoutItem("cherry_sapling",
            () -> new SaplingBlock(new CherryTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> CHERRY_LEAVES = registerBlock("cherry_leaves",
            () -> new CherryLeaves(Block.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));

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
