package me.hdcookie.plugin.craftingmenu;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class CraftListener implements Listener {
    @EventHandler
    public void event(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();

        //Waits 1 tick for the item to go back in the slot before it closes, minimising ghost items in the grid
        if(event.getRawSlot() == 1){
            event.setCancelled(true);
            Bukkit.getScheduler().runTaskLater(CraftingMenu.getMainInstance(), () -> {
                Bukkit.dispatchCommand(player, CraftingMenu.getMainInstance().getConfig().getString("ItemInfo.Item1.command"));   }, 1);

        }if(event.getRawSlot() == 2){
            event.setCancelled(true);
            Bukkit.getScheduler().runTaskLater(CraftingMenu.getMainInstance(), () -> {
                Bukkit.dispatchCommand(player, CraftingMenu.getMainInstance().getConfig().getString("ItemInfo.Item2.command"));   }, 1);

        }if(event.getRawSlot() == 3){
            event.setCancelled(true);
            Bukkit.getScheduler().runTaskLater(CraftingMenu.getMainInstance(), () -> {
                Bukkit.dispatchCommand(player, CraftingMenu.getMainInstance().getConfig().getString("ItemInfo.Item3.command"));   }, 1);

        }if(event.getRawSlot() == 4){
            event.setCancelled(true);
            Bukkit.getScheduler().runTaskLater(CraftingMenu.getMainInstance(), () -> {
                Bukkit.dispatchCommand(player, CraftingMenu.getMainInstance().getConfig().getString("ItemInfo.Item4.command"));   }, 1);

        }



    }
}

