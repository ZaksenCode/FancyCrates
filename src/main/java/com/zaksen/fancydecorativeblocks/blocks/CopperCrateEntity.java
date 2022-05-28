package com.zaksen.fancydecorativeblocks.blocks;

import com.zaksen.fancydecorativeblocks.FancyBlockEntities;
import com.zaksen.fancydecorativeblocks.screen.CopperCrateMenu;
import com.zaksen.fancydecorativeblocks.screen.IronCrateMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class CopperCrateEntity extends BaseStorageEntityBlock{
    public CopperCrateEntity(BlockPos BPos, BlockState BState) {
        super(FancyBlockEntities.COPPER_CRATE.get(), BPos, BState, 27, "Copper Crate");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int ContainerId, Inventory Inv, Player P) {
        return new CopperCrateMenu(ContainerId, Inv, this);
    }
}
