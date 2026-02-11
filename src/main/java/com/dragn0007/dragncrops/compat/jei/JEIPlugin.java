package com.dragn0007.dragncrops.compat.jei;

import com.dragn0007.dragncrops.CropOverhaul;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.minecraft.resources.ResourceLocation;

@JeiPlugin
public class JEIPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(CropOverhaul.MODID, "dragncrops_jei");
    }
}