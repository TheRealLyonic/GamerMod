package com.lyonic.gamermod.block;

import com.lyonic.gamermod.GamerMod;
import com.lyonic.gamermod.item.ModCreativeModeTab;
import com.lyonic.gamermod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GamerMod.MOD_ID);

    //Custom Blocks
    public static final RegistryObject<Block> GAMER_BLOCK = registerBlock("gamer_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5.0f, 6.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModCreativeModeTab.GAMER_STUFF_TAB);
    public static final RegistryObject<Block> GAMER_ORE = registerBlock("gamer_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.0f, 3.0f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.GAMER_STUFF_TAB);
    public static final RegistryObject<Block> DEEPSLATE_GAMER_ORE = registerBlock("deepslate_gamer_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(4.5f, 3.0f).color(MaterialColor.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.GAMER_STUFF_TAB);

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        registerBlockItem(name, toReturn, tab);

        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

}
