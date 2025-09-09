package com.dragn0007.dragncrops.compat.jade.block;

import com.dragn0007.dragncrops.CropOverhaul;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;

public class FlailTooltipProvider implements IBlockComponentProvider {

    @Override
    public void appendTooltip(ITooltip tooltip, BlockAccessor accessor, IPluginConfig config) {
        tooltip.add(Component.literal("Break with a Flail to get Grain for Flour production."));
    }

    @Override
    public ResourceLocation getUid() {
        return new ResourceLocation(CropOverhaul.MODID, "flail_hint");
    }
}
