package me.armorofglory.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;


public class help {
	
	public static boolean onCommand(CommandSender sender, Command cmd, String label, String args[]) {
	
		// Help menu for Plugin
		sender.sendMessage(" ");
		sender.sendMessage(ChatColor.GOLD + "--------------------< " + ChatColor.YELLOW + ChatColor.BOLD + "FARM BOT" + ChatColor.GOLD + " >--------------------");
		sender.sendMessage(ChatColor.YELLOW + " /farm create <farmName> " + ChatColor.GRAY + "- Create new farm");
		sender.sendMessage(ChatColor.YELLOW + " /farm add <farmName> " + ChatColor.GRAY + "- Add block to farm");
		sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");;
		
		return false;
	}
}
