package net.sterben.customdiscs;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.sterben.customdiscs.command.YozorazCommand;
import net.sterben.customdiscs.item.ModItems;
import net.sterben.customdiscs.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomDiscs1214 implements ModInitializer {
	public static final String MOD_ID = "customdiscs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModSounds.registerSounds();

		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated, environment) -> {
			YozorazCommand.register(dispatcher);
		});
	}
}