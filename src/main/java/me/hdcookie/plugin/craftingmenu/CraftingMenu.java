package me.hdcookie.plugin.craftingmenu;

import me.hdcookie.plugin.craftingmenu.menus.CraftingMenuCommand;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class CraftingMenu extends JavaPlugin {
    private static CraftingMenu mainInstance;

    @Override
    public void onEnable() {
        mainInstance = this;
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(new SetItems(), this);
        Bukkit.getPluginManager().registerEvents(new CraftListener(), this);

        getCommand("craftingMenu").setExecutor(new CraftingMenuCommand());

    }

    @Override
    public void onDisable() {
        ItemStack air = new ItemStack(Material.AIR);

        for(Player player : Bukkit.getOnlinePlayers()){
            player.getOpenInventory().getTopInventory().setItem(1, air);
            player.getOpenInventory().getTopInventory().setItem(2, air);
            player.getOpenInventory().getTopInventory().setItem(3, air);
            player.getOpenInventory().getTopInventory().setItem(4, air);
        }
    }

    public static CraftingMenu getMainInstance(){
        return mainInstance;
    }
}
