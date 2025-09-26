package com.dragn0007.dragncrops.blocks.custom;

import com.dragn0007.dragncrops.blocks.DecorRotator;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class MeadJarBlock extends DecorRotator {

    public static final VoxelShape NORTH = Stream.of(
            Block.box(4, 0, 4, 12, 9, 12),
            Block.box(6.2, 11, 6.2, 9.8, 12, 9.8),
            Block.box(6.499999999999999, 9, 6.499999999999999, 9.5, 11, 9.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(4, 0, 4, 12, 9, 12),
            Block.box(6.2, 11, 6.2, 9.8, 12, 9.8),
            Block.box(6.499999999999999, 9, 6.499999999999999, 9.5, 11, 9.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(4, 0, 4, 12, 9, 12),
            Block.box(6.2, 11, 6.2, 9.8, 12, 9.8),
            Block.box(6.499999999999999, 9, 6.499999999999999, 9.5, 11, 9.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(4, 0, 4, 12, 9, 12),
            Block.box(6.2, 11, 6.2, 9.8, 12, 9.8),
            Block.box(6.499999999999999, 9, 6.499999999999999, 9.5, 11, 9.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public MeadJarBlock() {
        super(NORTH, EAST, SOUTH, WEST,
                Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.STONE).noCollission().noOcclusion().instabreak().pushReaction(PushReaction.DESTROY));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

}
