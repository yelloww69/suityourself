package net.yellow.mcsuityourself.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yellow.mcsuityourself.SuitYourself;
import net.yellow.mcsuityourself.item.custom.MetalDetectorItem;
import net.yellow.mcsuityourself.item.custom.TestGunItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SuitYourself.MOD_ID);

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(2000)));

    public static final RegistryObject<Item> TEST_GUN = ITEMS.register("test_gun",
            () -> new TestGunItem(new Item.Properties().durability(2000)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
