package me.hdcookie.plugin.craftingmenu.utilities;

import me.hdcookie.plugin.craftingmenu.CraftingMenu;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;

public class ItemStacks {
    public static ItemStack getItem1(){
        FileConfiguration config = CraftingMenu.getMainInstance().getConfig();

        ItemStack item1 = new ItemBuilder(Material.valueOf(config.getString("ItemInfo.Item1.material")))
                .setName(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item1.name")))
                .setLore(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item1.lore")))
                .setAmount(config.getInt("ItemInfo.Item1.amount"))
                .toItemStack();

        return item1;
    }
    public static ItemStack getItem2(){
        FileConfiguration config = CraftingMenu.getMainInstance().getConfig();

        ItemStack item2 = new ItemBuilder(Material.valueOf(config.getString("ItemInfo.Item2.material")))
                .setName(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item2.name")))
                .setLore(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item2.lore")))
                .setAmount(config.getInt("ItemInfo.Item2.amount"))
                .toItemStack();

        return item2;
    }
    public static ItemStack getItem3(){
        FileConfiguration config = CraftingMenu.getMainInstance().getConfig();

        ItemStack item3 = new ItemBuilder(Material.valueOf(config.getString("ItemInfo.Item3.material")))
                .setName(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item3.name")))
                .setLore(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item3.lore")))
                .setAmount(config.getInt("ItemInfo.Item3.amount"))
                .toItemStack();

        return item3;
    }
    public static ItemStack getItem4(){
        FileConfiguration config = CraftingMenu.getMainInstance().getConfig();

        ItemStack item4 = new ItemBuilder(Material.valueOf(config.getString("ItemInfo.Item3.material")))
                .setName(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item4.name")))
                .setLore(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item4.lore")))
                .setAmount(config.getInt("ItemInfo.Item4.amount"))
                .toItemStack();

        return item4;
    }
}
