package net.risho7.debilina.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.risho7.debilina.debilina;
import net.risho7.debilina.item.NovyItemGroup;

public class NovyBlock {

    public static final Block BLOCK_OF_SOFIA = registerBlock("block_of_sofia",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f)), NovyItemGroup.SOMARINY);

    public static final Block SOFIA_ORE = registerBlock("sofia_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2f),
            UniformIntProvider.create(5, 9)), NovyItemGroup.SOMARINY);

    public static final Block BLOCK_OF_KOKOT = registerBlock("block_of_kokot",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f)), NovyItemGroup.SOMARINY);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(debilina.MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(debilina.MOD_ID, name ),
                new BlockItem(block, new FabricItemSettings().group(tab)));

    }

    public static void registerNovyBlock() {
        debilina.LOGGER.debug("Zaregistrovanie NovyBlock pre nove bloky " + debilina.MOD_ID);
    }
}
