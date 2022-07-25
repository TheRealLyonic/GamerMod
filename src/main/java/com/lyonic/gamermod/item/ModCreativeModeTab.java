package com.lyonic.gamermod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab GAMER_STUFF_TAB = new CreativeModeTab("gamer_stuff_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PURE_GAMER_ESSENCE.get());
        }
    };

}
