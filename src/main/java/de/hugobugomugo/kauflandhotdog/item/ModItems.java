package de.hugobugomugo.kauflandhotdog.item;

import de.hugobugomugo.kauflandhotdog.KauflandHotdog;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item KAUFLAND_HOTDOG = registerItem("kauflandhotdog",
            new Item(new FabricItemSettings()
                    .group(ItemGroup.FOOD)
                    .food(new FoodComponent.Builder()
                    .saturationModifier(0.6f)
                    .hunger(8)
                    .meat()
                    .build())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(KauflandHotdog.MOD_ID, name), item);
    }

    //public static final RegistryObject<Item> KAUFLAND_HOTDOG = ITEMS.register("kauflandhotdog",())

    public static void registerModItems() {
        KauflandHotdog.LOGGER.debug("Registering Items for",KauflandHotdog.MOD_ID);
    }
}
