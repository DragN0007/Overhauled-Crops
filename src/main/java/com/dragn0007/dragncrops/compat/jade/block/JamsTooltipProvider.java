package com.dragn0007.dragncrops.compat.jade.block;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.blocks.custom.JamJarBlock;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;

public class JamsTooltipProvider implements IBlockComponentProvider {

    public static final IntegerProperty JAM_JARS = JamJarBlock.JAM_JARS;

    @Override
    public void appendTooltip(ITooltip tooltip, BlockAccessor accessor, IPluginConfig config) {
        if (accessor.getBlockState().hasProperty(JAM_JARS)) {
            int amount = accessor.getBlockState().getValue(JAM_JARS);
            tooltip.add(Component.literal(amount + " Jar(s)"));
        }
    }

    @Override
    public ResourceLocation getUid() {
        return new ResourceLocation(CropOverhaul.MODID, "jars");
    }
}
