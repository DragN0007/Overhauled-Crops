package com.dragn0007.dragncrops.blocks.custom;

import com.dragn0007.dragncrops.blocks.DecorRotator;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class GrainBlock extends DecorRotator implements SimpleWaterloggedBlock {

    public GrainBlock(Properties properties) {
        super(NORTH, EAST, SOUTH, WEST, Properties.copy(Blocks.HAY_BLOCK).sound(SoundType.GRASS).noOcclusion().strength(0.3f, 0.3f)
                .requiresCorrectToolForDrops().noCollission());
    }

    public boolean isPathfindable(BlockState p_53306_, BlockGetter p_53307_, BlockPos p_53308_, PathComputationType p_53309_) {
        return false;
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(0, 0, 0, 16, 4, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(0, 0, 0, 16, 4, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(0, 0, 0, 16, 4, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(0, 0, 0, 16, 4, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    @Override
    public boolean isCollisionShapeFullBlock(BlockState p_181242_, BlockGetter p_181243_, BlockPos p_181244_) {
        return false;
    }
}
