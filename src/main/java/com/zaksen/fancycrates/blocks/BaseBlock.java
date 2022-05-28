package com.zaksen.fancycrates.blocks;

import net.minecraft.world.level.block.Block;

public abstract class BaseBlock extends Block {

    boolean HaveInventory = false;

    public BaseBlock(Properties properties) {
        super(properties);
    }

    protected boolean IsHaveInventory() {
        return this.HaveInventory;
    }

    protected void SetHaveInventory(boolean HaveInventory) {
        this.HaveInventory = HaveInventory;
    }
}
