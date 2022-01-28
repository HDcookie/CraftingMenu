package me.hdcookie.plugin.craftingmenu;

import org.bukkit.Bukkit;
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

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static CraftingMenu getMainInstance(){
        return mainInstance;
    }
}
