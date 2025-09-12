package com.dragn0007.dragncrops.blocks.crop;

import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.blocks.crop.base.OCropBlock;
import com.dragn0007.dragncrops.items.COItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CornBlock extends OCropBlock {
   private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
           Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
           Block.box(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D),
           Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
           Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
           Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
           Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
           Block.box(0.0D, 0.0D, 0.0D, 16.0D, 18.0D, 16.0D),
           Block.box(0.0D, 0.0D, 0.0D, 16.0D, 24.0D, 16.0D)};

   public CornBlock(Properties p_51328_) {
      super(p_51328_);
   }

   @Override
   public BlockState getPlant(BlockGetter level, BlockPos pos) {
      return COBlocks.CORN.get().defaultBlockState();
   }

   public ItemLike getBaseSeedId() {
      return COItems.CORN_SEEDS.get();
   }

   public VoxelShape getShape(BlockState p_51330_, BlockGetter p_51331_, BlockPos p_51332_, CollisionContext p_51333_) {
      return SHAPE_BY_AGE[this.getAge(p_51330_)];
   }
}