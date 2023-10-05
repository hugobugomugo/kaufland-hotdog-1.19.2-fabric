package de.hugobugomugo.kauflandhotdog;

import de.hugobugomugo.kauflandhotdog.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KauflandHotdog implements ModInitializer {
	public static final String MOD_ID = "kauflandhotdog";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}