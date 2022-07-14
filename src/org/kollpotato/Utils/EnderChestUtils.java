package org.kollpotato.Utils;

import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;
import org.bukkit.Bukkit;

public class EnderChestUtils {
    public void OpenEnderChest(CommandSender sender) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.openInventory(player.getEnderChest());
        }
    }

    public void OpenEnderChest(CommandSender sender, String username) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Player playerByUsername = Bukkit.getPlayer(username);
            player.openInventory(playerByUsername.getEnderChest());
        }
    }
}
