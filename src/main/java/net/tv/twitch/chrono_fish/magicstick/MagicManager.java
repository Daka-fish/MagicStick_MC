package net.tv.twitch.chrono_fish.magicstick;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class MagicManager {
    public static void strikeLightning(Player player, Location loc){
        player.getWorld().strikeLightning(loc);
    }

    public static Location getTargetLoc(Player player){
        return player.getTargetBlock(null,100).getLocation();
    }
}