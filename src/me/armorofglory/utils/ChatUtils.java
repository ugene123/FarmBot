package me.armorofglory.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.armorofglory.config.ConfigAccessor;

public class ChatUtils {
	
	private static String prefix() {
		return ConfigAccessor.getStringWithColor("Messages.PREFIX");
		
	}
	
	public static void broadcast(String string) {
		for (Player player : Bukkit.getOnlinePlayers()){
			player.sendMessage(prefix() + string);			
		}
	}
	
	public static void msgPlayer(Player player, String string) {
		player.sendMessage(prefix() + string);
	}
	
	public static void msgSender(CommandSender sender, String string) {
		sender.sendMessage(prefix() + string);
	}
	
	public static String convertToColor(String string) {
		return ChatColor.translateAlternateColorCodes('&', string);
	}
	
}
