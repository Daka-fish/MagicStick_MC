package net.tv.twitch.chrono_fish.magicstick;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemStackData {
    static Material goldSword = Material.GOLDEN_SWORD;

    public static ItemStack getFlameSlash(){
        ItemStack flameSlash = new ItemStack(goldSword);
        ItemMeta flameMeta = flameSlash.getItemMeta();
        Damageable flameDamage = (Damageable) flameMeta;
        flameDamage.setDamage(goldSword.getMaxDurability()-1);
        flameMeta.addEnchant(Enchantment.FIRE_ASPECT,1,true);
        flameMeta.setDisplayName("§cかえん斬り");
        flameSlash.setItemMeta(flameMeta);
        return flameSlash;
    }
}
