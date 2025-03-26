package net.sterben.customdiscs.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.sterben.customdiscs.CustomDiscs1214;

public class ModSounds {
    // Add Songs Here
    // One Click Straight Songs
    public static final SoundEvent TELEPONO = registerSoundEvent("telepono");
    public static final RegistryKey<JukeboxSong> TELEPONO_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(CustomDiscs1214.MOD_ID, "telepono"));

    public static final SoundEvent MRT = registerSoundEvent("mrt");
    public static final RegistryKey<JukeboxSong> MRT_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(CustomDiscs1214.MOD_ID, "mrt"));

    public static final SoundEvent DAHAN_DAHAN = registerSoundEvent("dahan_dahan");
    public static final RegistryKey<JukeboxSong> DAHAN_DAHAN_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(CustomDiscs1214.MOD_ID, "dahan_dahan"));

    public static final SoundEvent SIGA = registerSoundEvent("siga");
    public static final RegistryKey<JukeboxSong> SIGA_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(CustomDiscs1214.MOD_ID, "siga"));

    // SUYEN Songs
    public static final SoundEvent BENTE = registerSoundEvent("bente");
    public static final RegistryKey<JukeboxSong> BENTE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(CustomDiscs1214.MOD_ID, "bente"));

    public static final SoundEvent SUYEN_IMNIDA = registerSoundEvent("suyen_imnida");
    public static final RegistryKey<JukeboxSong> SUYEN_IMNIDA_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(CustomDiscs1214.MOD_ID, "suyen_imnida"));

    public static final SoundEvent ISANG_LINGGO = registerSoundEvent("isang_linggo");
    public static final RegistryKey<JukeboxSong> ISANG_LINGGO_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(CustomDiscs1214.MOD_ID, "isang_linggo"));

    public static final SoundEvent SOMETHING_ABOUT_YOU = registerSoundEvent("something_about_you");
    public static final RegistryKey<JukeboxSong> SOMETHING_ABOUT_YOU_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(CustomDiscs1214.MOD_ID, "something_about_you"));

    public static final SoundEvent TAMPO = registerSoundEvent("tampo");
    public static final RegistryKey<JukeboxSong> TAMPO_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(CustomDiscs1214.MOD_ID, "tampo"));

    public static final SoundEvent TEKA_LANG = registerSoundEvent("teka_lang");
    public static final RegistryKey<JukeboxSong> TEKA_LANG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(CustomDiscs1214.MOD_ID, "teka_lang"));

    // Helper
    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(CustomDiscs1214.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerSounds() {
        CustomDiscs1214.LOGGER.info("Registering ModSounds" + CustomDiscs1214.MOD_ID);
    }
}
