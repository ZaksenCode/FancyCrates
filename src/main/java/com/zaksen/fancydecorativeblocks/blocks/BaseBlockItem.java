package com.zaksen.fancydecorativeblocks.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class BaseBlockItem extends BlockItem
{
    private final BaseBlock block;
    public BaseBlockItem(BaseBlock BlockToItem, Properties ItemProperties)
    {
        super(BlockToItem, ItemProperties);

        this.block = BlockToItem;
    }
}
