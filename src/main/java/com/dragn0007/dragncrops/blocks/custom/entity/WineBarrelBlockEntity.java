package com.dragn0007.dragncrops.blocks.custom.entity;

import com.dragn0007.dragncrops.blocks.COBlockEntities;
import com.dragn0007.dragncrops.common.gui.PotMenu;
import com.dragn0007.dragncrops.common.gui.WineBarrelMenu;
import com.dragn0007.dragncrops.items.COItems;
import com.dragn0007.dragncrops.util.COTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class WineBarrelBlockEntity extends BaseContainerBlockEntity implements WorldlyContainer {
   public NonNullList<ItemStack> items = NonNullList.withSize(5, ItemStack.EMPTY);
   int brewTime;
   public static final int ADD_IN_SLOT = 0;
   public static final int GRAPE_SLOT = 1;
   public static final int GRAIN_SLOT = 2;
   public static final int OUTPUT_SLOT = 3;
   public static final int LIQUID_SLOT = 4;
   public ItemStack brewingCurrently = null;

   protected final ContainerData dataAccess = new ContainerData() {
      public int get(int slot) {
          if (slot == ADD_IN_SLOT || slot == GRAPE_SLOT || slot == GRAIN_SLOT) {
              return WineBarrelBlockEntity.this.brewTime;
          }
          return 0;
      }

      public void set(int i, int value) {
         if (i == ADD_IN_SLOT || i == GRAPE_SLOT || i == GRAIN_SLOT) {
           WineBarrelBlockEntity.this.brewTime = value;
         }
      }

      public int getCount() {
         return 3;
      }
   };

   public WineBarrelBlockEntity(BlockPos pos, BlockState state) {
      super(COBlockEntities.WINE_BARREL.get(), pos, state);
   }

   protected Component getDefaultName() {
      return Component.translatable("blockentities.dragncrops.wine_barrel");
   }

   public int getContainerSize() {
      return this.items.size();
   }

   public boolean isEmpty() {
      for(ItemStack itemstack : this.items) {
         if (!itemstack.isEmpty()) {
            return false;
         }
      }

      return true;
   }

   public static void serverTick(Level level, BlockPos pos, BlockState state, WineBarrelBlockEntity entity) {

      ItemStack addInSlotItem = entity.getItem(ADD_IN_SLOT);
      ItemStack grapeSlotItem = entity.getItem(GRAPE_SLOT);
      ItemStack grainSlotItem = entity.getItem(GRAIN_SLOT);
      ItemStack outputSlotItem = entity.getItem(OUTPUT_SLOT);
      ItemStack liquidSlotItem = entity.getItem(LIQUID_SLOT);
      ItemStack potentialOutput = null;

      if (entity.brewingCurrently != null && entity.brewTime > 0) {
         --entity.brewTime;
         if (entity.brewTime == 0) {
            if (outputSlotItem.isEmpty()) {
               entity.setItem(OUTPUT_SLOT, entity.brewingCurrently);
            } else {
               outputSlotItem.grow(1);
            }
            entity.brewingCurrently = null;
            setChanged(level, pos, state);
         }
      } else if (entity.brewTime <= 0) {
         if (!grapeSlotItem.isEmpty() && !grainSlotItem.isEmpty() && !liquidSlotItem.isEmpty()) {
            if (addInSlotItem.is(COTags.Items.APPLES)) {
               potentialOutput = COItems.APPLE_WINE.get().getDefaultInstance();
            } else if (addInSlotItem.is(COItems.BLACKBERRY.get())) {
               potentialOutput = COItems.BLACKBERRY_WINE.get().getDefaultInstance();
            } else if (addInSlotItem.is(COItems.BLUEBERRY.get())) {
               potentialOutput = COItems.BLUEBERRY_WINE.get().getDefaultInstance();
            } else if (addInSlotItem.is(COItems.CANTALOUPE_SLICE.get())) {
               potentialOutput = COItems.CANTALOUPE_WINE.get().getDefaultInstance();
            } else if (addInSlotItem.is(COItems.CHERRIES.get())) {
               potentialOutput = COItems.CHERRY_WINE.get().getDefaultInstance();
            } else if (addInSlotItem.is(COItems.CRANBERRY.get())) {
               potentialOutput = COItems.CRANBERRY_WINE.get().getDefaultInstance();
            } else if (addInSlotItem.is(COItems.CRIMSONBERRY.get())) {
               potentialOutput = COItems.CRIMSONBERRY_WINE.get().getDefaultInstance();
            } else if (addInSlotItem.is(COItems.GOLDENBERRIES.get())) {
               potentialOutput = COItems.GOLDENBERRY_WINE.get().getDefaultInstance();
            } else if (addInSlotItem.is(COItems.HONEYDEW_SLICE.get())) {
               potentialOutput = COItems.MELON_WINE.get().getDefaultInstance();
            } else if (addInSlotItem.is(COItems.MANGO.get())) {
               potentialOutput = COItems.MANGO_WINE.get().getDefaultInstance();
            } else if (addInSlotItem.is(COItems.PLUM.get())) {
               potentialOutput = COItems.PLUM_WINE.get().getDefaultInstance();
            } else if (addInSlotItem.is(COItems.RASPBERRY.get())) {
               potentialOutput = COItems.RASPBERRY_WINE.get().getDefaultInstance();
            } else if (addInSlotItem.is(COItems.STRAWBERRY.get())) {
               potentialOutput = COItems.STRAWBERRY_WINE.get().getDefaultInstance();
            } else if (addInSlotItem.is(Items.MELON_SLICE)) {
               potentialOutput = COItems.WATERMELON_WINE.get().getDefaultInstance();
            } else if (addInSlotItem.isEmpty()) {
               potentialOutput = COItems.GRAPE_WINE.get().getDefaultInstance();
            }
         }

         if ((potentialOutput == null) || (!outputSlotItem.isEmpty() && !potentialOutput.is(outputSlotItem.getItem())) || (outputSlotItem.getCount() == outputSlotItem.getMaxStackSize())) {
            return;
         }

         entity.brewingCurrently = potentialOutput;
         ItemStack remainder = liquidSlotItem.getCraftingRemainingItem();

         if (addInSlotItem.is(COTags.Items.BREWING_ADD_INS)) {
            grapeSlotItem.shrink(1);
            addInSlotItem.shrink(1);
            grainSlotItem.shrink(1);
            if (liquidSlotItem.isEmpty())
               entity.setItem(LIQUID_SLOT, remainder);
         } else if (addInSlotItem.isEmpty()) {
            grapeSlotItem.shrink(1);
            grainSlotItem.shrink(1);
            if (liquidSlotItem.isEmpty())
               entity.setItem(LIQUID_SLOT, remainder);
         }
         entity.brewTime = 12000;
         setChanged(level, pos, state);
      }
   }

   public final ItemStackHandler itemHandler = new ItemStackHandler(4) {
      @Override
      protected void onContentsChanged(int slot) {
         setChanged();
         if(!level.isClientSide()) {
            level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 2);
         }
      }

      @Override
      public boolean isItemValid(int slot, @NotNull ItemStack stack) {
         return switch (slot) {
            case ADD_IN_SLOT -> stack.is(COTags.Items.BREWING_ADD_INS);
            case GRAPE_SLOT -> stack.is(COItems.GRAPES.get());
            case GRAIN_SLOT -> stack.is(COItems.GRAIN.get());
            case OUTPUT_SLOT -> false;
            case LIQUID_SLOT -> stack.is(COTags.Items.WATER);
            default -> super.isItemValid(slot, stack);
         };
      }
   };

   @Nullable
   @Override
   public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
      return new WineBarrelMenu(pContainerId, pPlayerInventory, this, dataAccess);
   }

   public void load(CompoundTag tag) {
      super.load(tag);
      this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
      ContainerHelper.loadAllItems(tag, this.items);
      this.brewTime = tag.getShort("BrewTime");
      if (tag.contains("BrewingCurrently")) {
         CompoundTag compoundTag = (CompoundTag) tag.get("BrewingCurrently");
         this.brewingCurrently = ItemStack.of(compoundTag);
      }
   }

   protected void saveAdditional(CompoundTag tag) {
      super.saveAdditional(tag);
      tag.putShort("BrewTime", (short) this.brewTime);
      if (brewingCurrently != null) {
         CompoundTag compoundTag = new CompoundTag();
         this.brewingCurrently.save(compoundTag);
         tag.put("BrewingCurrently", compoundTag);
      }
      ContainerHelper.saveAllItems(tag, this.items);
   }

   public ItemStack getItem(int i) {
      return i >= 0 && i < this.items.size() ? this.items.get(i) : ItemStack.EMPTY;
   }

   public ItemStack removeItem(int i, int dunno) {
      return ContainerHelper.removeItem(this.items, i, dunno);
   }

   public ItemStack removeItemNoUpdate(int i) {
      return ContainerHelper.takeItem(this.items, i);
   }

   public void setItem(int p_58993_, ItemStack p_58994_) {
      if (p_58993_ >= 0 && p_58993_ < this.items.size()) {
         this.items.set(p_58993_, p_58994_);
      }

   }

   public boolean stillValid(Player player) {
      return Container.stillValidBlockEntity(this, player);
   }

   public void clearContent() {
      this.items.clear();
   }

   protected AbstractContainerMenu createMenu(int p_58990_, Inventory p_58991_) {
      return new PotMenu(p_58990_, p_58991_, this, this.dataAccess);
   }

   net.minecraftforge.common.util.LazyOptional<? extends net.minecraftforge.items.IItemHandler>[] handlers =
           net.minecraftforge.items.wrapper.SidedInvWrapper.create(this, Direction.UP, Direction.DOWN, Direction.NORTH);

   @Override
   public <T> net.minecraftforge.common.util.LazyOptional<T> getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, @Nullable Direction facing) {
      if (capability == net.minecraftforge.common.capabilities.ForgeCapabilities.ITEM_HANDLER && facing != null && !this.remove) {
          return switch (facing) {
              case UP -> handlers[0].cast();
              case DOWN -> handlers[1].cast();
              default -> handlers[2].cast();
          };
      }
      return super.getCapability(capability, facing);
   }

   @Override
   public void invalidateCaps() {
      super.invalidateCaps();
      for (int x = 0; x < handlers.length; x++)
        handlers[x].invalidate();
   }

   @Override
   public void reviveCaps() {
      super.reviveCaps();
      this.handlers = net.minecraftforge.items.wrapper.SidedInvWrapper.create(this, Direction.UP, Direction.DOWN, Direction.NORTH);
   }

   @Override
   public int[] getSlotsForFace(Direction p_19238_) {
      return new int[0];
   }

   @Override
   public boolean canPlaceItemThroughFace(int p_19235_, ItemStack p_19236_, @org.jetbrains.annotations.Nullable Direction p_19237_) {
      return false;
   }

   @Override
   public boolean canTakeItemThroughFace(int p_19239_, ItemStack p_19240_, Direction p_19241_) {
      return false;
   }
}