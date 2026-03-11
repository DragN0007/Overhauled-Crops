package com.dragn0007.dragncrops.common.gui;

import com.dragn0007.dragncrops.blocks.custom.entity.DistillerBlockEntity;
import com.dragn0007.dragncrops.items.COItems;
import com.dragn0007.dragncrops.util.COTags;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.SimpleContainerData;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class DistillerMenu extends AbstractContainerMenu {

    private final Container container;
    private final ContainerData containerData;

    public DistillerMenu(int i, Inventory inventory, FriendlyByteBuf friendlyByteBuf) {
        this(i, inventory, new SimpleContainer(4), new SimpleContainerData(2));
    }

    public DistillerMenu(int i, Inventory inventory, Container container, ContainerData data) {
        super(COMenuTypes.DISTILLER_MENU.get(), i);
        checkContainerSize(inventory, 4);
        this.container = container;
        this.containerData = data;
        this.addDataSlots(data);

        this.addSlot(new Slot(this.container, DistillerBlockEntity.ADD_IN_SLOT, 56, 24) {
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                return itemStack.is(COTags.Items.BREWING_ADD_INS);
            }
        });
        this.addSlot(new Slot(this.container, DistillerBlockEntity.MASH_SLOT, 102, 24) {
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                return itemStack.is(COItems.MASH.get());
            }
        });
        this.addSlot(new Slot(this.container, DistillerBlockEntity.OUTPUT_SLOT, 79, 58) {
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                return false;
            }
        });
        this.addSlot(new Slot(this.container, DistillerBlockEntity.LIQUID_SLOT, 17, 17) {
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                return itemStack.is(COTags.Items.WATER);
            }
        });

        for(int y = 0; y < 3; y++) {
            for(int x = 0; x < 9; x++) {
                this.addSlot(new Slot(inventory, x + y * 9 + 9, 8 + x * 18, 84 + y * 18));
            }
        }
        for(int x = 0; x < 9; x++) {
            this.addSlot(new Slot(inventory, x, 8 + x * 18, 142));
        }
    }

    public int getBrewingTicks() {
        return this.containerData.get(0);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int slotId) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(slotId);
        if(slot.hasItem()) {
            itemStack = slot.getItem().copy();
            int containerSize = this.container.getContainerSize();

            if(slotId < containerSize) {
                if(!this.moveItemStackTo(itemStack, containerSize, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if(!this.moveItemStackTo(itemStack, 0, containerSize, false)) {
                return ItemStack.EMPTY;
            }

            if(itemStack.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }
        return itemStack;
    }

    @Override
    public boolean stillValid(Player player) {
        return this.container.stillValid(player);
    }
}
