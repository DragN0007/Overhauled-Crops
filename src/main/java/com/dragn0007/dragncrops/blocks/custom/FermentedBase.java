package com.dragn0007.dragncrops.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class FermentedBase extends HorizontalDirectionalBlock {

    public static final IntegerProperty FERMENT_TIME = IntegerProperty.create("ferment_time", 0, 201);

    public IntegerProperty getFermentTimeProperty() {
        return FERMENT_TIME;
    }

    public int getMaxFermentTime() {
        return 200;
    }

    public int getFermentTime(BlockState state) {
        return state.getValue(this.getFermentTimeProperty());
    }

    public BlockState getStateForFermentTime(int i) {
        return this.defaultBlockState().setValue(this.getFermentTimeProperty(), Integer.valueOf(i));
    }

    public boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FERMENT_TIME).add(HorizontalDirectionalBlock.FACING);
    }

    public VoxelShape NORTH;
    public VoxelShape EAST;
    public VoxelShape SOUTH;
    public VoxelShape WEST;

    public FermentedBase(VoxelShape north, VoxelShape east, VoxelShape south, VoxelShape west, Properties properties) {
        super (properties);

        NORTH = north;
        EAST = east;
        SOUTH = south;
        WEST = west;

        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        return Block.canSupportCenter(pLevel, pPos.below(), Direction.UP);
    }

    public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext context) {
        switch(state.getValue(FACING)) {
            case NORTH:
                return NORTH;
            case EAST:
                return EAST;
            case SOUTH:
                return SOUTH;
            case WEST:
                return WEST;
            default:
                return NORTH;
        }

    }

    @Override
    public VoxelShape getCollisionShape(BlockState p_60572_, BlockGetter p_60573_, BlockPos p_60574_, CollisionContext p_60575_) {
        return super.getCollisionShape(p_60572_, p_60573_, p_60574_, p_60575_);
    }
}
