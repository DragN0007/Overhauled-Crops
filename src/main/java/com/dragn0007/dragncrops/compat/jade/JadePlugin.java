package com.dragn0007.dragncrops.compat.jade;

import com.dragn0007.dragncrops.blocks.custom.AppleBlock;
import com.dragn0007.dragncrops.blocks.custom.GrainBlock;
import com.dragn0007.dragncrops.blocks.custom.JamJarBlock;
import com.dragn0007.dragncrops.compat.jade.block.ApplesTooltipProvider;
import com.dragn0007.dragncrops.compat.jade.block.FlailTooltipProvider;
import com.dragn0007.dragncrops.compat.jade.block.JamsTooltipProvider;
import snownee.jade.api.IWailaClientRegistration;
import snownee.jade.api.IWailaPlugin;
import snownee.jade.api.WailaPlugin;

@WailaPlugin
public class JadePlugin implements IWailaPlugin {



    @Override
    public void registerClient(IWailaClientRegistration registration) {
        registration.registerBlockComponent(new FlailTooltipProvider(), GrainBlock.class);
        registration.registerBlockComponent(new JamsTooltipProvider(), JamJarBlock.class);
        registration.registerBlockComponent(new ApplesTooltipProvider(), AppleBlock.class);
    }
}
