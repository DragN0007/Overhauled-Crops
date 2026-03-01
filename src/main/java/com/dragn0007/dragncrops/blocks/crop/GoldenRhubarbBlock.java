package com.dragn0007.dragncrops.blocks.crop;

import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.blocks.crop.base.OCropBlock;
import com.dragn0007.dragncrops.items.COItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.Tags;

public class GoldenRhubarbBlock extends OCropBlock {
   private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D)};

   public GoldenRhubarbBlock(Properties p_51328_) {
      super(p_51328_);
   }

   @Override
   public BlockState getPlant(BlockGetter level, BlockPos pos) {
      return COBlocks.GOLDEN_RHUBARB.get().defaultBlockState();
   }

   public ItemLike getBaseSeedId() {
      return COItems.GOLDEN_RHUBARB.get();
   }

   public VoxelShape getShape(BlockState p_51330_, BlockGetter p_51331_, BlockPos p_51332_, CollisionContext p_51333_) {
      return SHAPE_BY_AGE[this.getAge(p_51330_)];
   }

   @Override
   public boolean mayPlaceOn(BlockState p_52302_, BlockGetter p_52303_, BlockPos p_52304_) {
      return p_52302_.is(Tags.Blocks.NETHERRACK) || p_52302_.is(Blocks.CRIMSON_NYLIUM);
   }

   @Override
   public void growCrops(Level level, BlockPos pos, BlockState state) {
      if (level.dimension() != Level.NETHER) {
         return;
      }
      super.growCrops(level, pos, state);
   }

   @Override
   public boolean canSurvive(BlockState state, LevelReader levelReader, BlockPos pos) {
      BlockPos blockpos = pos.below();
      if (state.getBlock() == this)
         return levelReader.getBlockState(blockpos).canSustainPlant(levelReader, blockpos, Direction.UP, this);
      return this.mayPlaceOn(levelReader.getBlockState(blockpos), levelReader, blockpos);
   }

   @Override
   public boolean isValidBonemealTarget(LevelReader reader, BlockPos pos, BlockState state, boolean p_52261_) {
      if (reader instanceof Level level && level.dimension() != Level.NETHER) {
         return false;
      }
      return super.isValidBonemealTarget(reader, pos, state, p_52261_);
   }
}