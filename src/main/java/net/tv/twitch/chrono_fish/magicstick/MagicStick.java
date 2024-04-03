package net.tv.twitch.chrono_fish.magicstick;

import org.bukkit.plugin.java.JavaPlugin;

public final class MagicStick extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("li").setExecutor(new CommandManager());
        getServer().getPluginManager().registerEvents(new MagicEvent(),this);
    }
}
