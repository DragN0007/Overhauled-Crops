package com.dragn0007.dragncrops.items;

import com.dragn0007.dragncrops.CropOverhaul;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class COItemGroup {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CropOverhaul.MODID);

    public static final RegistryObject<CreativeModeTab> CROP_OVERHAUL_GROUP = CREATIVE_MODE_TABS.register("overhauled_crops",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(COItems.CROP_OVERHAUL.get())).title(Component.translatable("itemGroup.overhauled_crops"))
                    .withSearchBar().displayItems((displayParameters, output) -> {

                        output.accept(Items.APPLE);
                        output.accept(COItems.YELLOW_APPLE.get());
                        output.accept(COItems.GREEN_APPLE.get());
                        output.accept(Items.CARROT);
                        output.accept(COItems.YELLOW_CARROT.get());
                        output.accept(COItems.PURPLE_CARROT.get());
                        output.accept(Items.POTATO);
                        output.accept(COItems.RED_POTATO.get());
                        output.accept(COItems.PURPLE_POTATO.get());
                        output.accept(Items.WHEAT);
                        output.accept(COItems.CORN.get());
                        output.accept(COItems.RICE.get());
                        output.accept(COItems.RYE.get());
                        output.accept(COItems.THORN_BARLEY.get());
                        output.accept(Items.MELON_SLICE);
                        output.accept(COItems.CANTALOUPE_SLICE.get());
                        output.accept(COItems.HONEYDEW_SLICE.get());
                        output.accept(COItems.CANTALOUPE.get());
                        output.accept(COItems.HONEYDEW.get());
                        output.accept(COItems.BLACKBERRY.get());
                        output.accept(COItems.BLUEBERRY.get());
                        output.accept(COItems.RASPBERRY.get());
                        output.accept(COItems.CRANBERRY.get());
                        output.accept(COItems.STRAWBERRY.get());
                        output.accept(COItems.CRIMSONBERRY.get());
                        output.accept(COItems.GOLDENBERRIES.get());
                        output.accept(COItems.PEANUT.get());
                        output.accept(COItems.CUCUMBER.get());
                        output.accept(COItems.GARLIC.get());
                        output.accept(COItems.GOLDEN_RHUBARB.get());
                        output.accept(COItems.SUGAR_BEET.get());
                        output.accept(COItems.CHERRIES.get());
                        output.accept(COItems.MANGO.get());
                        output.accept(COItems.COCONUT.get());
                        output.accept(COItems.LIME.get());
                        output.accept(COItems.PLUM.get());
                        output.accept(COItems.CILANTRO.get());
                        output.accept(COItems.OREGANO.get());
                        output.accept(COItems.ROSEMARY.get());
                        output.accept(COItems.ASHERB.get());

                        output.accept(COItems.CORN_SEEDS.get());
                        output.accept(COItems.RICE_SEEDS.get());
                        output.accept(COItems.RYE_SEEDS.get());
                        output.accept(COItems.CANTALOUPE_SEEDS.get());
                        output.accept(COItems.HONEYDEW_SEEDS.get());
                        output.accept(COItems.RED_APPLE_SEEDS.get());
                        output.accept(COItems.YELLOW_APPLE_SEEDS.get());
                        output.accept(COItems.GREEN_APPLE_SEEDS.get());
                        output.accept(COItems.LIME_SEEDS.get());
                        output.accept(COItems.MANGO_PIT.get());
                        output.accept(COItems.CHERRY_PIT.get());
                        output.accept(COItems.PLUM_PIT.get());

                        output.accept(COItems.FLAIL.get());
                        output.accept(COItems.EMPTY_CAN.get());
                        output.accept(COItems.GLASS_JAR.get());
                        output.accept(COItems.MEAT_MALLET.get());

                        output.accept(COItems.GRAIN.get());
                        output.accept(COItems.FLOUR.get());

                        output.accept(Items.BREAD);
                        output.accept(COItems.BLUEBERRY_BREAD.get());
                        output.accept(COItems.CRANBERRY_BREAD.get());
                        output.accept(COItems.CORN_BREAD.get());
                        output.accept(COItems.NUT_BREAD.get());
                        output.accept(COItems.POTATO_BREAD.get());
                        output.accept(COItems.RICE_BREAD.get());
                        output.accept(COItems.RYE_BREAD.get());
                        output.accept(COItems.WHITE_BREAD.get());
                        output.accept(COItems.THORN_BARLEY_BREAD.get());

                        output.accept(COItems.CANNED_CARROTS.get());
                        output.accept(COItems.CANNED_POTATOES.get());
                        output.accept(COItems.CANNED_BEETS.get());
                        output.accept(COItems.CANNED_VEGETABLES.get());
                        output.accept(COItems.CANNED_FRUIT.get());
                        output.accept(COItems.CANNED_BEEF.get());
                        output.accept(COItems.CANNED_MUSHROOMS.get());

                        output.accept(COItems.UNFERMENTED_PICKLES.get());
                        output.accept(COItems.FERMENTED_PICKLES.get());
                        output.accept(COItems.STOCK.get());
                        output.accept(COItems.VEGETABLE_SOUP.get());
                        output.accept(COItems.MEAT_AND_VEGETABLE_STEW.get());

                        output.accept(COItems.BEEF_SAUSAGE.get());
                        output.accept(COItems.DRIED_BEEF_SAUSAGE.get());
                        output.accept(COItems.COOKED_BEEF_SAUSAGE.get());
                        output.accept(COItems.CHICKEN_SAUSAGE.get());
                        output.accept(COItems.DRIED_CHICKEN_SAUSAGE.get());
                        output.accept(COItems.COOKED_CHICKEN_SAUSAGE.get());
                        output.accept(COItems.PORK_SAUSAGE.get());
                        output.accept(COItems.DRIED_PORK_SAUSAGE.get());
                        output.accept(COItems.COOKED_PORK_SAUSAGE.get());
                        output.accept(COItems.MUTTON_SAUSAGE.get());
                        output.accept(COItems.DRIED_MUTTON_SAUSAGE.get());
                        output.accept(COItems.COOKED_MUTTON_SAUSAGE.get());
                        output.accept(COItems.FISH_SAUSAGE.get());
                        output.accept(COItems.DRIED_FISH_SAUSAGE.get());
                        output.accept(COItems.COOKED_FISH_SAUSAGE.get());
                        output.accept(COItems.GENERIC_SAUSAGE.get());
                        output.accept(COItems.DRIED_GENERIC_SAUSAGE.get());
                        output.accept(COItems.COOKED_GENERIC_SAUSAGE.get());
                        if (ModList.get().isLoaded("dragnlivestock") || ModList.get().isLoaded("dragnexpansion")) {
                            output.accept(COItems.GAME_SAUSAGE.get());
                            output.accept(COItems.DRIED_GAME_SAUSAGE.get());
                            output.accept(COItems.COOKED_GAME_SAUSAGE.get());
                        }

                        output.accept(COItems.APPLE_JAM.get());
                        output.accept(COItems.BLACKBERRY_JAM.get());
                        output.accept(COItems.BLUEBERRY_JAM.get());
                        output.accept(COItems.CANTALOUPE_JAM.get());
                        output.accept(COItems.CHERRY_JAM.get());
                        output.accept(COItems.CRANBERRY_JAM.get());
                        output.accept(COItems.CRIMSONBERRY_JAM.get());
                        output.accept(COItems.GOLDENBERRY_JAM.get());
                        output.accept(COItems.MANGO_JAM.get());
                        output.accept(COItems.MELON_JAM.get());
                        output.accept(COItems.PLUM_JAM.get());
                        output.accept(COItems.RASPBERRY_JAM.get());
                        output.accept(COItems.STRAWBERRY_JAM.get());
                        output.accept(COItems.WATERMELON_JAM.get());

                        output.accept(COItems.APPLE_TART.get());
                        output.accept(COItems.BLACKBERRY_TART.get());
                        output.accept(COItems.BLUEBERRY_TART.get());
                        output.accept(COItems.CANTALOUPE_TART.get());
                        output.accept(COItems.CHERRY_TART.get());
                        output.accept(COItems.CRANBERRY_TART.get());
                        output.accept(COItems.CRIMSONBERRY_TART.get());
                        output.accept(COItems.GOLDENBERRY_TART.get());
                        output.accept(COItems.MANGO_TART.get());
                        output.accept(COItems.MELON_TART.get());
                        output.accept(COItems.PLUM_TART.get());
                        output.accept(COItems.RASPBERRY_TART.get());
                        output.accept(COItems.STRAWBERRY_TART.get());
                        output.accept(COItems.WATERMELON_TART.get());

                        output.accept(COItems.APPLE_CANDY.get());
                        output.accept(COItems.BLACKBERRY_CANDY.get());
                        output.accept(COItems.BLUEBERRY_CANDY.get());
                        output.accept(COItems.CANTALOUPE_CANDY.get());
                        output.accept(COItems.CHERRY_CANDY.get());
                        output.accept(COItems.CRANBERRY_CANDY.get());
                        output.accept(COItems.CRIMSONBERRY_CANDY.get());
                        output.accept(COItems.GOLDENBERRY_CANDY.get());
                        output.accept(COItems.MANGO_CANDY.get());
                        output.accept(COItems.MELON_CANDY.get());
                        output.accept(COItems.PLUM_CANDY.get());
                        output.accept(COItems.RASPBERRY_CANDY.get());
                        output.accept(COItems.STRAWBERRY_CANDY.get());
                        output.accept(COItems.WATERMELON_CANDY.get());

                        output.accept(COItems.APPLE_GELATIN.get());
                        output.accept(COItems.BLACKBERRY_GELATIN.get());
                        output.accept(COItems.BLUEBERRY_GELATIN.get());
                        output.accept(COItems.CANTALOUPE_GELATIN.get());
                        output.accept(COItems.CHERRY_GELATIN.get());
                        output.accept(COItems.CRANBERRY_GELATIN.get());
                        output.accept(COItems.CRIMSONBERRY_GELATIN.get());
                        output.accept(COItems.GOLDENBERRY_GELATIN.get());
                        output.accept(COItems.MANGO_GELATIN.get());
                        output.accept(COItems.MELON_GELATIN.get());
                        output.accept(COItems.PLUM_GELATIN.get());
                        output.accept(COItems.RASPBERRY_GELATIN.get());
                        output.accept(COItems.STRAWBERRY_GELATIN.get());
                        output.accept(COItems.WATERMELON_GELATIN.get());

                        output.accept(COItems.APPLE_COCKTAIL.get());
                        output.accept(COItems.BLACKBERRY_COCKTAIL.get());
                        output.accept(COItems.BLUEBERRY_COCKTAIL.get());
                        output.accept(COItems.CANTALOUPE_COCKTAIL.get());
                        output.accept(COItems.CHERRY_COCKTAIL.get());
                        output.accept(COItems.CRANBERRY_COCKTAIL.get());
                        output.accept(COItems.CRIMSONBERRY_COCKTAIL.get());
                        output.accept(COItems.GOLDENBERRY_COCKTAIL.get());
                        output.accept(COItems.MANGO_COCKTAIL.get());
                        output.accept(COItems.MELON_COCKTAIL.get());
                        output.accept(COItems.PLUM_COCKTAIL.get());
                        output.accept(COItems.RASPBERRY_COCKTAIL.get());
                        output.accept(COItems.STRAWBERRY_COCKTAIL.get());
                        output.accept(COItems.WATERMELON_COCKTAIL.get());

                        output.accept(COItems.APPLE_PIE.get());
                        output.accept(COItems.BLACKBERRY_PIE.get());
                        output.accept(COItems.BLUEBERRY_PIE.get());
                        output.accept(COItems.CHERRY_PIE.get());
                        output.accept(COItems.CRANBERRY_PIE.get());
                        output.accept(COItems.CRIMSONBERRY_PIE.get());
                        output.accept(COItems.GOLDENBERRY_PIE.get());
                        output.accept(COItems.GOLDEN_RHUBARB_PIE.get());
                        output.accept(COItems.PLUM_PIE.get());
                        output.accept(COItems.RASPBERRY_PIE.get());
                        output.accept(COItems.STRAWBERRY_PIE.get());
                        output.accept(COItems.COCONUT_PIE.get());
                        output.accept(COItems.BEETROOT_PIE.get());
                        output.accept(COItems.KEY_LIME_PIE.get());

                        output.accept(COItems.TEA.get());
                        output.accept(COItems.APPLE_TEA.get());
                        output.accept(COItems.BLACKBERRY_TEA.get());
                        output.accept(COItems.BLUEBERRY_TEA.get());
                        output.accept(COItems.CANTALOUPE_TEA.get());
                        output.accept(COItems.CHERRY_TEA.get());
                        output.accept(COItems.CRANBERRY_TEA.get());
                        output.accept(COItems.CRIMSONBERRY_TEA.get());
                        output.accept(COItems.GOLDENBERRY_TEA.get());
                        output.accept(COItems.MANGO_TEA.get());
                        output.accept(COItems.MELON_TEA.get());
                        output.accept(COItems.PLUM_GELATIN.get());
                        output.accept(COItems.RASPBERRY_TEA.get());
                        output.accept(COItems.STRAWBERRY_TEA.get());
                        output.accept(COItems.WATERMELON_TEA.get());

                        output.accept(COItems.APPLE_MEAD.get());
                        output.accept(COItems.BLACKBERRY_MEAD.get());
                        output.accept(COItems.BLUEBERRY_MEAD.get());
                        output.accept(COItems.CANTALOUPE_MEAD.get());
                        output.accept(COItems.CHERRY_MEAD.get());
                        output.accept(COItems.CRANBERRY_MEAD.get());
                        output.accept(COItems.CRIMSONBERRY_MEAD.get());
                        output.accept(COItems.GOLDENBERRY_MEAD.get());
                        output.accept(COItems.MANGO_MEAD.get());
                        output.accept(COItems.MELON_MEAD.get());
                        output.accept(COItems.PLUM_MEAD.get());
                        output.accept(COItems.RASPBERRY_MEAD.get());
                        output.accept(COItems.STRAWBERRY_MEAD.get());
                        output.accept(COItems.WATERMELON_MEAD.get());
                        output.accept(COItems.HONEY_MEAD.get());
                        output.accept(COItems.MAGMA_CREAM_MEAD.get());
                        output.accept(COItems.BEETROOT_MEAD.get());
                        output.accept(COItems.UNFERMENTED_APPLE_MEAD.get());
                        output.accept(COItems.UNFERMENTED_BLACKBERRY_MEAD.get());
                        output.accept(COItems.UNFERMENTED_BLUEBERRY_MEAD.get());
                        output.accept(COItems.UNFERMENTED_CANTALOUPE_MEAD.get());
                        output.accept(COItems.UNFERMENTED_CHERRY_MEAD.get());
                        output.accept(COItems.UNFERMENTED_CRANBERRY_MEAD.get());
                        output.accept(COItems.UNFERMENTED_CRIMSONBERRY_MEAD.get());
                        output.accept(COItems.UNFERMENTED_GOLDENBERRY_MEAD.get());
                        output.accept(COItems.UNFERMENTED_MANGO_MEAD.get());
                        output.accept(COItems.UNFERMENTED_MELON_MEAD.get());
                        output.accept(COItems.UNFERMENTED_RASPBERRY_MEAD.get());
                        output.accept(COItems.UNFERMENTED_PLUM_MEAD.get());
                        output.accept(COItems.UNFERMENTED_STRAWBERRY_MEAD.get());
                        output.accept(COItems.UNFERMENTED_WATERMELON_MEAD.get());
                        output.accept(COItems.UNFERMENTED_HONEY_MEAD.get());
                        output.accept(COItems.UNFERMENTED_MAGMA_CREAM_MEAD.get());
                        output.accept(COItems.UNFERMENTED_BEETROOT_MEAD.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
