package com.lyonic.gamermod.item;

import com.lyonic.gamermod.GamerMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GamerMod.MOD_ID);

    //Custom Items
    public static final RegistryObject<Item> RAW_GAMER_ESSENCE = ITEMS.register("raw_gamer_essence", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GAMER_STUFF_TAB)));
    public static final RegistryObject<Item> PURE_GAMER_ESSENCE = ITEMS.register("pure_gamer_essence", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GAMER_STUFF_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
