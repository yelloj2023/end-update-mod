package net.yelloj.endupdatemod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yelloj.endupdatemod.EndMod;
import net.yelloj.endupdatemod.item.custom.AlloyDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EndMod.MOD_ID);


    public static final RegistryObject<Item> TERMINITE_INGOT = ITEMS.register("terminite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TERMINITE = ITEMS.register("raw_terminite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALLOY_DETECTOR = ITEMS.register("alloy_detector",
            () -> new AlloyDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> ENDER_BERRY = ITEMS.register("ender_berry",
            () -> new Item(new Item.Properties().food(ModFoods.ENDER_BERRY)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
