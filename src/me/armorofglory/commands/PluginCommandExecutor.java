package me.armorofglory.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.armorofglory.Main;
import me.armorofglory.utils.ChatUtils;

public class PluginCommandExecutor implements CommandExecutor {

	public PluginCommandExecutor(Main main) {
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]){
		
		if(cmd.getName().equalsIgnoreCase("farm") && sender instanceof Player) {
			if(args.length == 0) {
				help.onCommand(sender, cmd, label, args);
				return true;
			}
			
			if(args.length == 1) {
				if(args[0].equalsIgnoreCase("help")) {
					help.onCommand(sender, cmd, label, args);
					return true;
				}
			}
			
			if(args.length == 2) {
				if(args[0].equalsIgnoreCase("add")) {
					addBlock.onCommand(sender, cmd, label, args);
					return true;
				}
				
				if(args[0].equalsIgnoreCase("create")) {
					createFarm.onCommand(sender, cmd, label, args);
					return true;
				}
			}
		
		}
		return false;
	}
}


