package net.tv.twitch.chrono_fish.magicstick;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;

public class MagicManager {
    public static void strikeLightning(Player player){
        player.getWorld().strikeLightning(getTargetLoc(player));
    }

    public static void explosion(Player player){player.getWorld().createExplosion(getTargetLoc(player),5.0f,false,true);}

    public static void fireBall(Player player){
        Fireball fireball = (Fireball) player.getWorld().spawnEntity(player.getLocation().add(0,1.5,0), EntityType.FIREBALL);
        fireball.setShooter(player);
        fireball.setYield(0);
    }

    public static void frameSlash(Player player){
        player.getInventory().addItem(ItemStackData.getFlameSlash());
    }

    public static Location getTargetLoc(Player player){
        return player.getTargetBlock(null,100).getLocation();
    }

}
