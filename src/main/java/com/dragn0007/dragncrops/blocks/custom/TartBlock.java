package com.dragn0007.dragncrops.blocks.custom;

import com.dragn0007.dragncrops.blocks.pixel_placement.util.PixelPlacer;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TartBlock extends PixelPlacer {
    private static final VoxelShape SHAPE = Shapes.or(
            Block.box(-3, 0, -3, 3, 2, 3)
    );

    public TartBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).strength(0.2F).noOcclusion());
    }

    @Override
    public VoxelShape getVoxelShape(Direction direction) {
        return SHAPE;
    }
}
