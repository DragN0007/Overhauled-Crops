package com.dragn0007.dragncrops.recipe;

import com.dragn0007.dragncrops.CropOverhaul;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CORecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, CropOverhaul.MODID);

    public static final RegistryObject<RecipeSerializer<TeapotRecipe>> TEAPOT_SERIALIZER =
            SERIALIZERS.register("teapot", () -> TeapotRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}