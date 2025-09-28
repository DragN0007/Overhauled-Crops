package com.dragn0007.dragncrops.compat.jade.block;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.blocks.custom.FermentedBase;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;

public class FermentTooltipProvider implements IBlockComponentProvider {

    public static final IntegerProperty AGE_TIME = FermentedBase.FERMENT_TIME;

    @Override
    public void appendTooltip(ITooltip tooltip, BlockAccessor accessor, IPluginConfig config) {
        if (accessor.getBlockState().hasProperty(AGE_TIME)) {
            int time = accessor.getBlockState().getValue(AGE_TIME);
            if (accessor.getBlock() instanceof FermentedBase block) {
                int max = block.getMaxFermentTime();
                int timeFromMax = (max - time);
                int total = ((max - timeFromMax) / 2);
                tooltip.add(Component.literal(total + "% Fermented"));
            }
        }
    }

    @Override
    public ResourceLocation getUid() {
        return new ResourceLocation(CropOverhaul.MODID, "ferment_time");
    }
}
