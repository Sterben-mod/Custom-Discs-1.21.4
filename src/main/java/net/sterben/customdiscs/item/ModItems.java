package net.sterben.customdiscs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sterben.customdiscs.CustomDiscs1214;
import net.sterben.customdiscs.sound.ModSounds;

import java.util.function.Function;

public class ModItems {
    // Add Items Here
    public static final Item TELEPONO_MUSIC_DISC = registerItem("telepono_music_disc",
            Item::new, new Item.Settings().jukeboxPlayable(ModSounds.TELEPONO_KEY).maxCount(1));

    // Helper
    public static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registerKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CustomDiscs1214.MOD_ID, name));
        return Items.register(registerKey, factory, settings);
    }

    // Custom Item Group
    public static final RegistryKey<ItemGroup> CUSTOM_DISCS_GROUP_KEY =
            RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(CustomDiscs1214.MOD_ID, "custom_discs"));
    public static final ItemGroup CUSTOM_DISCS_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.TELEPONO_MUSIC_DISC))
            .displayName(Text.translatable("itemGroup.custom_discs"))
            .build();

    // Register the group.
    public static void registerModItems() {
        Registry.register(Registries.ITEM_GROUP, CUSTOM_DISCS_GROUP_KEY, CUSTOM_DISCS_GROUP);
            ItemGroupEvents.modifyEntriesEvent(CUSTOM_DISCS_GROUP_KEY).register(itemGroup -> {
                itemGroup.add(TELEPONO_MUSIC_DISC);
        });
    }
}


