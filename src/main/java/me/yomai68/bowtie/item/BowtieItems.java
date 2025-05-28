package me.yomai68.bowtie.item;

import me.yomai68.bowtie.Bowtie;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BowtieItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Bowtie.MODID);

    public static final DeferredItem<Item> MANURE = ITEMS.register("manure",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANTLER = ITEMS.register("antler",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
