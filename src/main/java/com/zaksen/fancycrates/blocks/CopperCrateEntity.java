package com.zaksen.fancycrates.blocks;

import com.zaksen.fancycrates.FancyBlockEntities;
import com.zaksen.fancycrates.screen.CopperCrateMenu;
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
