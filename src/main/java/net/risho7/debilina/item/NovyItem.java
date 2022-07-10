package net.risho7.debilina.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.risho7.debilina.debilina;

public class NovyItem {
    public static final Item KOKOTINA = registerItem("kokotina",
            new Item(new FabricItemSettings().group(NovyItemGroup.SOMARINY)));
    public static final Item PICACINA = registerItem("picacina",
            new Item(new FabricItemSettings().group(NovyItemGroup.SOMARINY)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM,new Identifier(debilina.MOD_ID, name), item);
    }

    public static void registerNovyItem() {
        debilina.LOGGER.debug("Zaregistruje modovane itemy pre" + debilina.MOD_ID);
    }
}
