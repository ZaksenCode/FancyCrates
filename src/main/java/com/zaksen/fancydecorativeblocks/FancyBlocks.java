package com.zaksen.fancydecorativeblocks;

import com.zaksen.fancydecorativeblocks.blocks.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class FancyBlocks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FancyDecorativeBlocks.MOD_ID);
    public static final RegistryObject<ElectroLamp> ELECTRO_LAMP;
    public static final RegistryObject<CrateFrame> CRATE_FRAME;
    public static final RegistryObject<WoodCrate> WOOD_CRATE;
    public static final RegistryObject<IronCrate> IRON_CRATE;
    public static final RegistryObject<CopperCrate> COPPER_CRATE;
    public static final RegistryObject<GoldCrate> GOLD_CRATE;
    public static final RegistryObject<DiamondCrate> DIAMOND_CRATE;
    public static final RegistryObject<NetheriteCrate> NETHERITE_CRATE;
    public static final RegistryObject<CobblestoneSmallTiles> COBBLESTONE_SMALL_TILES;
    public static final RegistryObject<CobblestoneHexagon> COBBLESTONE_HEXAGON;
    public static final RegistryObject<PolishedCobblestone> POLISHED_COBBLESTONE;

    static {
        ELECTRO_LAMP = BLOCKS.register("electrolamp", ElectroLamp::new);
        CRATE_FRAME = BLOCKS.register("crate_frame", CrateFrame::new);
        WOOD_CRATE = BLOCKS.register("wood_crate", WoodCrate::new);
        IRON_CRATE = BLOCKS.register("iron_crate", IronCrate::new);
        COPPER_CRATE = BLOCKS.register("copper_crate", CopperCrate::new);
        GOLD_CRATE = BLOCKS.register("gold_crate", GoldCrate::new);
        DIAMOND_CRATE = BLOCKS.register("diamond_crate", DiamondCrate::new);
        NETHERITE_CRATE = BLOCKS.register("netherite_crate", NetheriteCrate::new);
        COBBLESTONE_SMALL_TILES = BLOCKS.register("cobblestone_small_tiles", CobblestoneSmallTiles::new);
        COBBLESTONE_HEXAGON = BLOCKS.register("cobblestone_hexagon", CobblestoneHexagon::new);
        POLISHED_COBBLESTONE = BLOCKS.register("polished_cobblestone", PolishedCobblestone::new);
    }

    private FancyBlocks() {
    }

    public static void register() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
