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
    public static final SoundEvent TELEPONO = registerSoundEvent("telepono");
    public static final RegistryKey<JukeboxSong> TELEPONO_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(CustomDiscs1214.MOD_ID, "telepono"));

    // Helper
    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(CustomDiscs1214.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerSounds() {
        CustomDiscs1214.LOGGER.info("Registering ModSounds" + CustomDiscs1214.MOD_ID);
    }
}
