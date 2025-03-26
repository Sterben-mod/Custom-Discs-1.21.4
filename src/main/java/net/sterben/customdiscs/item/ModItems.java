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
    // One Click Straight Songs
    public static final Item TELEPONO_MUSIC_DISC = registerItem("telepono_music_disc",
            Item::new, new Item.Settings().jukeboxPlayable(ModSounds.TELEPONO_KEY).maxCount(1));

    public static final Item MRT_MUSIC_DISC = registerItem("mrt_music_disc",
            Item::new, new Item.Settings().jukeboxPlayable(ModSounds.MRT_KEY).maxCount(1));

    public static final Item DAHAN_DAHAN_MUSIC_DISC = registerItem("dahan_dahan_music_disc",
            Item::new, new Item.Settings().jukeboxPlayable(ModSounds.DAHAN_DAHAN_KEY).maxCount(1));

    public static final Item SIGA_MUSIC_DISC = registerItem("siga_music_disc",
            Item::new, new Item.Settings().jukeboxPlayable(ModSounds.SIGA_KEY).maxCount(1));

    // SUYEN Songs
    public static final Item BENTE_MUSIC_DISC = registerItem("bente_music_disc",
            Item::new, new Item.Settings().jukeboxPlayable(ModSounds.BENTE_KEY).maxCount(1));

    public static final Item SUYEN_IMNIDA_MUSIC_DISC = registerItem("suyen_imnida_music_disc",
            Item::new, new Item.Settings().jukeboxPlayable(ModSounds.SUYEN_IMNIDA_KEY).maxCount(1));

    public static final Item ISANG_LINGGO_MUSIC_DISC = registerItem("isang_linggo_music_disc",
            Item::new, new Item.Settings().jukeboxPlayable(ModSounds.ISANG_LINGGO_KEY).maxCount(1));

    public static final Item SOMETHING_ABOUT_YOU_MUSIC_DISC = registerItem("something_about_you_music_disc",
            Item::new, new Item.Settings().jukeboxPlayable(ModSounds.SOMETHING_ABOUT_YOU_KEY).maxCount(1));

    public static final Item TAMPO_MUSIC_DISC = registerItem("tampo_music_disc",
            Item::new, new Item.Settings().jukeboxPlayable(ModSounds.TAMPO_KEY).maxCount(1));

    public static final Item TEKA_LANG_MUSIC_DISC = registerItem("teka_lang_music_disc",
            Item::new, new Item.Settings().jukeboxPlayable(ModSounds.TEKA_LANG_KEY).maxCount(1));

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
                // OCS
                itemGroup.add(MRT_MUSIC_DISC);
                itemGroup.add(DAHAN_DAHAN_MUSIC_DISC);
                itemGroup.add(TELEPONO_MUSIC_DISC);
                itemGroup.add(SIGA_MUSIC_DISC);
                // SUYEN
                itemGroup.add(BENTE_MUSIC_DISC);
                itemGroup.add(SUYEN_IMNIDA_MUSIC_DISC);
                itemGroup.add(ISANG_LINGGO_MUSIC_DISC);
                itemGroup.add(SOMETHING_ABOUT_YOU_MUSIC_DISC);
                itemGroup.add(TAMPO_MUSIC_DISC);
                itemGroup.add(TEKA_LANG_MUSIC_DISC);
        });
    }
}


