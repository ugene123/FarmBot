package me.armorofglory.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class LocationUtils {
	
	
	public static Location stringToLocation(String string) {
        
		// Converts the string in config to a useable bukkit location
		try {
				
			String[] split = string.split(", ");
		
			// Location must include 6 args: world, x, y, z, yaw, pitch
			if(split.length == 6){
	        	
				// Create a new loc by splitting up the args with ', '
				Location loc = new Location(Bukkit.getWorld(split[0]), 
	        			Double.parseDouble(split[1]), Double.parseDouble(split[2]), 
	        			Double.parseDouble(split[3]), Float.parseFloat(split[4]), 
	        			Float.parseFloat(split[5]));
	        	
				return loc;
				
			} else if(split.length == 4){
				
				// Create a new loc by splitting up the args with ', '
				Location loc = new Location(Bukkit.getWorld(split[0]), 
	        			Double.parseDouble(split[1]), Double.parseDouble(split[2]), 
	        			Double.parseDouble(split[3]));
				return loc;
		
			} else {
				
				return null;
			}
				
		} catch (Exception e) {

			return null;
		}
	}
}
