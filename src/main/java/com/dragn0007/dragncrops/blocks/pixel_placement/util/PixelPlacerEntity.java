package com.dragn0007.dragncrops.blocks.pixel_placement.util;

import com.dragn0007.dragncrops.blocks.COBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PixelPlacerEntity extends BlockEntity {

    public final List<PixelPlacerData> pixelPlacerData = new ArrayList<>();

    public PixelPlacerEntity(BlockPos pos, BlockState state) {
        super(COBlocks.PIXEL_PLACER_ENTITY.get(), pos, state);
    }

    public void addPixelPlacer(Vec3 pos, Direction dir, PixelPlacer pixelPlacer) {
        this.pixelPlacerData.add(new PixelPlacerData(pos, dir, pixelPlacer));
        this.setChanged();
        this.level.sendBlockUpdated(this.getBlockPos(), this.getBlockState(), this.getBlockState(), 3);
    }

    public void removePixelPlacer(PixelPlacerData data) {
        this.pixelPlacerData.remove(data);
        this.setChanged();
        this.level.sendBlockUpdated(this.getBlockPos(), this.getBlockState(), this.getBlockState(), 3);
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        ListTag listTag = new ListTag();
        this.pixelPlacerData.forEach(d -> listTag.add(PixelPlacerData.pack(d)));
        tag.put("PixelPlacerData", listTag);
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        ListTag decorTag = (ListTag) tag.get("PixelPlacerData");

        this.pixelPlacerData.clear();
        decorTag.forEach(t -> this.pixelPlacerData.add(PixelPlacerData.unpack((CompoundTag) t)));
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag() {
        return this.saveWithoutMetadata();
    }

    public PixelPlacerData getClosestPixelPlacer(Entity entity) {
        Vec3 from = entity.getEyePosition();
        Vec3 rot = entity.getViewVector(1f).scale(8d);
        Vec3 to = from.add(rot);

        for(PixelPlacerData data : this.pixelPlacerData) {
            VoxelShape shape = data.pixelPlacer.getVoxelShape(data.dir).move(data.pos.x, data.pos.y, data.pos.z);
            BlockHitResult blockHitResult = shape.clip(from, to, this.getBlockPos());
            if(blockHitResult != null && blockHitResult.getType() != HitResult.Type.MISS) {
                return data;
            }
        }
        return null;
    }
}
