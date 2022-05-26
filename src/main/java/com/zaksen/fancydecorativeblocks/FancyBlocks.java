package com.zaksen.fancydecorativeblocks;

import com.zaksen.fancydecorativeblocks.blocks.CobblestoneHexagon;
import com.zaksen.fancydecorativeblocks.blocks.CobblestoneSmallTiles;
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
    public static final RegistryObject<CobblestoneSmallTiles> COBBLESTONE_SMALL_TILES;
    public static final RegistryObject<CobblestoneHexagon> COBBLESTONE_HEXAGON;

    static {
        ELECTRO_LAMP = BLOCKS.register("electrolamp", ElectroLamp::new);
        WOOD_CRATE = BLOCKS.register("wood_crate", WoodCrate::new);
        COBBLESTONE_SMALL_TILES = BLOCKS.register("cobblestone_small_tiles", CobblestoneSmallTiles::new);
        COBBLESTONE_HEXAGON = BLOCKS.register("cobblestone_hexagon", CobblestoneHexagon::new);
    }

    private FancyBlocks() {
    }

    public static void register() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
