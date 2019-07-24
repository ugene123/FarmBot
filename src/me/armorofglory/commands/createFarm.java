package me.armorofglory.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.armorofglory.config.ConfigAccessor;
import me.armorofglory.utils.ChatUtils;

public class createFarm {
	
	public static boolean onCommand(CommandSender sender, Command cmd, String label, String args[]) {
		
		if(sender instanceof Player) {
			String farmName = args[1].toLowerCase();
			ConfigAccessor.storeBoolean("Farms" + farmName, true);
			ChatUtils.msgSender(sender, "Created " +  farmName + " farm!");
		
		} else {
			// Sender is not a player
			ChatUtils.msgSender(sender, "You can only use this command in-game!");
		}

		return false;
	}
}
