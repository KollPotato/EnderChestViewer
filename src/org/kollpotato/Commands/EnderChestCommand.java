package org.kollpotato.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.kollpotato.Utils.EnderChestUtils;

public class EnderChestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 1)  new EnderChestUtils().OpenEnderChest(sender, args[0]);
        else new EnderChestUtils().OpenEnderChest(sender);
        return true;
    }
}
