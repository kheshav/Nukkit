package com.nukkitx.server.metadata.serializer.block;

import com.nukkitx.api.block.BlockState;
import com.nukkitx.api.item.ItemType;
import com.nukkitx.api.metadata.Metadata;
import com.nukkitx.api.metadata.block.Crops;
import com.nukkitx.server.metadata.serializer.Serializer;

public class CropsSerializer implements Serializer {
    @Override
    public short readMetadata(BlockState state) {
        Crops crops = state.ensureMetadata(Crops.class);
        return (short) crops.getStage();
    }

    @Override
    public Metadata writeMetadata(ItemType type, short metadata) {
        return Crops.of(metadata);
    }
}
