package com.zaksen.fancydecorativeblocks.blocks;

import net.minecraft.world.level.block.Block;

public abstract class BaseBlock extends Block {

    boolean HaveInventory = false;

    public BaseBlock(Properties properties) {
        super(properties);
    }

    @Override
    public String toString() {
        String regName = this.getRegistryName() != null ? this.getRegistryName().getPath() : "unregistered";
        return this.getClass().getSimpleName() + "[" + regName + "]";
    }

    protected boolean IsHaveInventory() {
        return this.HaveInventory;
    }

    protected void SetHaveInventory(boolean HaveInventory) {
        this.HaveInventory = HaveInventory;
    }
}
