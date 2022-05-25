package com.zaksen.fancydecorativeblocks;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.item.CreativeModeTab;

@Mod("fancydecorativeblocks")
public class FancyDecorativeBlocks
{
    public static final String MOD_ID = "fancydecorativeblocks";

    public static final CreativeModeTab BLOCK_GROUP = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.STONECUTTER);
        }
    };

    public FancyDecorativeBlocks()
    {
        FancyBlocks.register();
        FancyItems.register();
    }
}
