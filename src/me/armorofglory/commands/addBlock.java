package me.armorofglory.commands;

import java.util.List;
import java.util.Set;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import me.armorofglory.config.ConfigAccessor;
import me.armorofglory.utils.ChatUtils;

public class addBlock {
	
	public static Plugin plugin;
	
	public static boolean onCommand(CommandSender sender, Command cmd, String label, String args[]) {
		
		if(sender instanceof Player) {
			// Get farm name user passes in command
			String farmName = args[1].toUpperCase();
			
			// Get target block that the player is looking at..
			Player player = (Player) sender;
			Block targetBlock = player.getTargetBlock((Set<Material>) null, 5);
			Location loc = targetBlock.getLocation();
			
			// Convert block location into string for config
			String world = loc.getWorld().getName();
			double x = loc.getX();
			double y = loc.getY();
			double z = loc.getZ();
			String blockLocation = world + ", " + x + ", " + y + ", " + z;
			
			// Get previous stored blocks in farm and add new block location into list for config
			List<String> blockList = ConfigAccessor.getList("Farms." + farmName);
			blockList.add(blockLocation);
			ConfigAccessor.storeList("Farms." + farmName, blockList);
						
			ChatUtils.msgSender(sender, "Added " + targetBlock.getType().toString() + " to farm " + farmName);
		
		} else {
			// Sender is not a player
			ChatUtils.msgSender(sender, "You can only use this command in-game!");
		}

		return false;
		
	}
}
