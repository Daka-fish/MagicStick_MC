package net.tv.twitch.chrono_fish.magicstick;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemStackData {
    static ItemStack flameSlash = new ItemStack(Material.GOLDEN_SWORD);

    public static ItemStack getFlameSlash(){
        ItemMeta flameMeta = flameSlash.getItemMeta();
        flameMeta.addEnchant(Enchantment.FIRE_ASPECT,1,true);
        flameMeta.setDisplayName("§cかえん斬り");
        flameSlash.setItemMeta(flameMeta);
        return flameSlash;
    }
}
