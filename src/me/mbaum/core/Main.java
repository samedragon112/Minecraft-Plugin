package me.mbaum.core;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
    public void onEnable() {
		
    }
    
    @Override
    public void onDisable() {

    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("author")) { // If the player typed /basic then do the following...
    		//
    		return true;
    	} else if (cmd.getName().equalsIgnoreCase("basic2")) {
    		if (!(sender instanceof Player)) {
    			sender.sendMessage("This command can only be run by a player.");
    		} else {
    			Player player = (Player) sender;
    			// do something
    		}
    		return true;
    	}
    	return false;
    }
}
