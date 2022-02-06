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
                .addLoreLine(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item1.lore.line1")))
                .addLoreLine(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item1.lore.line2")))
                .addLoreLine(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item1.lore.line3")))
                .addLoreLine(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item1.lore.line4")))
                .setAmount(config.getInt("ItemInfo.Item1.amount"))
                .toItemStack();

        return item1;
    }
    public static ItemStack getItem2(){
        FileConfiguration config = CraftingMenu.getMainInstance().getConfig();

        ItemStack item2 = new ItemBuilder(Material.valueOf(config.getString("ItemInfo.Item2.material")))
                .setName(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item2.name")))
                .addLoreLine(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item2.lore.line1")))
                .addLoreLine(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item2.lore.line2")))
                .addLoreLine(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item2.lore.line3")))
                .addLoreLine(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item2.lore.line4")))
                .setAmount(config.getInt("ItemInfo.Item2.amount"))
                .toItemStack();

        return item2;
    }
    public static ItemStack getItem3(){
        FileConfiguration config = CraftingMenu.getMainInstance().getConfig();

        ItemStack item3 = new ItemBuilder(Material.valueOf(config.getString("ItemInfo.Item3.material")))
                .setName(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item3.name")))
                .addLoreLine(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item3.lore.line1")))
                .addLoreLine(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item3.lore.line2")))
                .addLoreLine(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item3.lore.line3")))
                .addLoreLine(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item3.lore.line4")))
                .setAmount(config.getInt("ItemInfo.Item3.amount"))
                .toItemStack();

        return item3;
    }
    public static ItemStack getItem4(){
        FileConfiguration config = CraftingMenu.getMainInstance().getConfig();

        ItemStack item4 = new ItemBuilder(Material.valueOf(config.getString("ItemInfo.Item4.material")))
                .setName(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item4.name")))
                .addLoreLine(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item4.lore.line1")))
                .addLoreLine(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item4.lore.line2")))
                .addLoreLine(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item4.lore.line3")))
                .addLoreLine(ChatColor.translateAlternateColorCodes('&', config.getString("ItemInfo.Item4.lore.line4")))
                .setAmount(config.getInt("ItemInfo.Item4.amount"))
                .toItemStack();

        return item4;
    }
}
