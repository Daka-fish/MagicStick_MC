package net.tv.twitch.chrono_fish.magicstick;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class MagicEvent implements Listener {

    @EventHandler
    public void onStick(PlayerInteractEvent e){
        if(e.getAction() == Action.LEFT_CLICK_BLOCK || e.getAction() == Action.LEFT_CLICK_AIR){
            if(e.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.STICK)){
                MagicManager.strikeLightning(e.getPlayer());
            }
        }
        if(e.getAction() == Action.LEFT_CLICK_BLOCK || e.getAction() == Action.LEFT_CLICK_AIR){
            if(e.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.BLAZE_ROD)){
                MagicManager.explosion(e.getPlayer());
            }
        }
    }
}

