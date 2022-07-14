package org.kollpotato;

import org.bukkit.plugin.java.JavaPlugin;
import org.kollpotato.Commands.*;

public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("enderchest")
            .setExecutor(new EnderChestCommand());
    }

    @Override
    public void onDisable() {

    }
}
