package com.dragn0007.dragncrops.compat.jade;

import com.dragn0007.dragncrops.blocks.custom.crafting.PotBlock;
import com.dragn0007.dragncrops.blocks.custom.crafting.TeapotBlock;
import com.dragn0007.dragncrops.blocks.custom.food.*;
import com.dragn0007.dragncrops.compat.jade.block.*;
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
        registration.registerBlockComponent(new CandiesTooltipProvider(), CandyBlock.class);
        registration.registerBlockComponent(new CansTooltipProvider(), CanBlock.class);
        registration.registerBlockComponent(new BottlesTooltipProvider(), MeadBottleBlock.class);
        registration.registerBlockComponent(new FermentTooltipProvider(), FermentedBase.class);
        registration.registerBlockComponent(new DryTooltipProvider(), DriedBase.class);
        registration.registerBlockComponent(new TeapotTooltipProvider(), TeapotBlock.class);
        registration.registerBlockComponent(new PotTooltipProvider(), PotBlock.class);
    }
}
