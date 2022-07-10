package net.risho7.debilina;

import net.fabricmc.api.ModInitializer;
import net.risho7.debilina.block.NovyBlock;
import net.risho7.debilina.item.NovyItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class debilina implements ModInitializer {
	public static final String MOD_ID = "debilina";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		NovyItem.registerNovyItem();
		NovyBlock.registerNovyBlock();
	}
}
