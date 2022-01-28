package me.hdcookie.plugin.craftingmenu;

import me.hdcookie.plugin.craftingmenu.utilities.ItemBuilder;
import me.hdcookie.plugin.craftingmenu.utilities.ItemStacks;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;

public class SetItems implements Listener {
    ItemStack item1 = ItemStacks.getItem1();
    ItemStack item2 = ItemStacks.getItem2();
    ItemStack cmd2 = ItemStacks.getItem3();
    ItemStack cmd3 = ItemStacks.getItem4();
    ItemStack air = new ItemStack(Material.AIR);


    @EventHandler
    public void event(InventoryCloseEvent event) {
        setItemsAir((Player) event.getPlayer());
    }

    public void setItemsAir(Player player){
        player.getOpenInventory().getTopInventory().setItem(1, air);
        player.getOpenInventory().getTopInventory().setItem(2, air);
        player.getOpenInventory().getTopInventory().setItem(3, air);
        player.getOpenInventory().getTopInventory().setItem(4, air);


        Bukkit.getScheduler().runTaskLater(CraftingMenu.getMainInstance(), () -> {
            player.getOpenInventory().getTopInventory().setItem(1, item1);
            player.getOpenInventory().getTopInventory().setItem(2, item2);
            player.getOpenInventory().getTopInventory().setItem(3, cmd2);
            player.getOpenInventory().getTopInventory().setItem(4, cmd3);

        }, 1);

    }

}