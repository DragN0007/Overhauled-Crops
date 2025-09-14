package com.dragn0007.dragncrops.compat.jade.block;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.blocks.custom.CandyBlock;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;

public class CandiesTooltipProvider implements IBlockComponentProvider {

    public static final IntegerProperty CANDIES = CandyBlock.CANDIES;

    @Override
    public void appendTooltip(ITooltip tooltip, BlockAccessor accessor, IPluginConfig config) {
        if (accessor.getBlockState().hasProperty(CANDIES)) {
            int amount = accessor.getBlockState().getValue(CANDIES);
            if (amount == 1) {
                tooltip.add(Component.literal(amount + " Candy"));
            } else {
                tooltip.add(Component.literal(amount + " Candies"));
            }
        }
    }

    @Override
    public ResourceLocation getUid() {
        return new ResourceLocation(CropOverhaul.MODID, "candies");
    }
}
