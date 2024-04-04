package net.tv.twitch.chrono_fish.magicstick;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class MagicManager {
    public static void strikeLightning(Player player){
        player.getWorld().strikeLightning(getTargetLoc(player));
    }

    public static void explosion(Player player){player.getWorld().createExplosion(
            getTargetLoc(player),8.0f,false,true
    );}

    public static Location getTargetLoc(Player player){
        return player.getTargetBlock(null,100).getLocation();
    }
}
