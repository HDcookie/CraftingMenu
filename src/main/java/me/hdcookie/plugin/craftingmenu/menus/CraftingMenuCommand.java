package me.hdcookie.plugin.craftingmenu.menus;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.Inventory;

public class CraftingMenuCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;

            if(args.length != 1){
                sender.sendMessage("You're using this wrong");
            }
            if(args.length == 1 && args[0].equalsIgnoreCase("craft")){
                player.openWorkbench(player.getLocation(), true);
            }else if(args.length == 1 && args[0].equalsIgnoreCase("nothing")){

            }


        }

        return false;
    }
}
