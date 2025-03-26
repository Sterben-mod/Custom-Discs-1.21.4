package net.sterben.customdiscs.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.command.ControlFlowAware;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.world.GameMode;

public class YozorazCommand {

    // Excludes Username with this IGN
    private static final String EXCLUDED_PLAYER = "Merikh";

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(
                LiteralArgumentBuilder.<ServerCommandSource>literal("yozorazcmd") // The command players can use
                        .requires(source -> {
                            ServerPlayerEntity player = source.getPlayer();
                            return player != null && !EXCLUDED_PLAYER.equals(player.getGameProfile().getName());
                        })
                        .executes(context -> executeCommand(context.getSource()))
        );
    }

    private static int executeCommand(ServerCommandSource source) {
        ServerPlayerEntity player = source.getPlayer();
        if (player != null) {
            GameMode currentMode = player.interactionManager.getGameMode();

            if (currentMode == GameMode.CREATIVE) {
                player.changeGameMode(GameMode.SURVIVAL);
                player.sendMessage(Text.literal("Switched to Survival"), false);
            } else {
                player.changeGameMode(GameMode.CREATIVE);
                player.sendMessage(Text.literal("Switched to Creative"), false);
            }
        }
        return ControlFlowAware.Command.SINGLE_SUCCESS;
    }
}
