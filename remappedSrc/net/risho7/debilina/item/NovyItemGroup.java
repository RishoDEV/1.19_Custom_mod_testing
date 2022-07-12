package net.risho7.debilina.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.risho7.debilina.debilina;

public class NovyItemGroup {
    public static final ItemGroup SOMARINY = FabricItemGroupBuilder.build(
            new Identifier(debilina.MOD_ID, "somariny"), () -> new ItemStack(NovyItem.PICACINA));
}
