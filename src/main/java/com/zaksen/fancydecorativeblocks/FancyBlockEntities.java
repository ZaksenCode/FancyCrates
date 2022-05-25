package com.zaksen.fancydecorativeblocks;

import com.zaksen.fancydecorativeblocks.blocks.BaseStorageEntityBlock;
import com.zaksen.fancydecorativeblocks.blocks.WoodCrateEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FancyBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, FancyDecorativeBlocks.MOD_ID);

    public static final RegistryObject<BlockEntityType<WoodCrateEntity>> WOOD_CRATE = BLOCK_ENTITIES.register("wood_crate", () -> BlockEntityType.Builder.of(WoodCrateEntity::new, FancyBlocks.WOOD_CRATE.get()).build(null));

    public static void register() {
        BLOCK_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
