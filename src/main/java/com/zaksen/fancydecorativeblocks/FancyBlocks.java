package com.zaksen.fancydecorativeblocks;

import com.zaksen.fancydecorativeblocks.blocks.ElectroLamp;
import com.zaksen.fancydecorativeblocks.blocks.WoodCrate;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class FancyBlocks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FancyDecorativeBlocks.MOD_ID);
    public static final RegistryObject<ElectroLamp> ELECTRO_LAMP;
    public static final RegistryObject<WoodCrate> WOOD_CRATE;

    static {
        ELECTRO_LAMP = BLOCKS.register("electrolamp", ElectroLamp::new);
        WOOD_CRATE = BLOCKS.register("wood_crate", WoodCrate::new);
    }

    private FancyBlocks() {
    }

    public static void register() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
