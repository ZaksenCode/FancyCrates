package com.zaksen.fancydecorativeblocks.screen;

import com.zaksen.fancydecorativeblocks.FancyDecorativeBlocks;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FancyMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.CONTAINERS, FancyDecorativeBlocks.MOD_ID);

    public static final RegistryObject<MenuType<WoodCrateMenu>> WOOD_CRATE_MENU = registerMenuType(WoodCrateMenu::new, "wood_crate");
    public static final RegistryObject<MenuType<IronCrateMenu>> IRON_CRATE_MENU = registerMenuType(IronCrateMenu::new, "iron_crate");
    public static final RegistryObject<MenuType<CopperCrateMenu>> COPPER_CRATE_MENU = registerMenuType(CopperCrateMenu::new, "copper_crate");
    public static final RegistryObject<MenuType<GoldCrateMenu>> GOLD_CRATE_MENU = registerMenuType(GoldCrateMenu::new, "gold_crate");
    public static final RegistryObject<MenuType<DiamondCrateMenu>> DIAMOND_CRATE_MENU = registerMenuType(DiamondCrateMenu::new, "diamond_crate");
    public static final RegistryObject<MenuType<NetheriteCrateMenu>> NETHERITE_CRATE_MENU = registerMenuType(NetheriteCrateMenu::new, "netherite_crate");

    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name)
    {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }
    public static void register()
    {
        MENUS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
