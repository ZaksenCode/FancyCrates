package com.zaksen.fancycrates.blocks;

import com.zaksen.fancycrates.FancyBlockEntities;
import com.zaksen.fancycrates.screen.NetheriteCrateMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class NetheriteCrateEntity extends BaseStorageEntityBlock{
    public NetheriteCrateEntity(BlockPos BPos, BlockState BState) {
        super(FancyBlockEntities.NETHERITE_CRATE.get(), BPos, BState, 91, "Netherite Crate");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int ContainerId, Inventory Inv, Player P) {
        return new NetheriteCrateMenu(ContainerId, Inv, this);
    }
}
