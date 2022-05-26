package com.zaksen.fancydecorativeblocks.blocks;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class PolishedCobblestone extends BaseBlock {
    public PolishedCobblestone() {
        super(Properties.of(Material.STONE).sound(SoundType.STONE).destroyTime(2f).strength(2F).explosionResistance(6f).requiresCorrectToolForDrops());
    }
}
