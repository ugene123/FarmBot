package me.armorofglory.listeners;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.InventoryType;

import me.armorofglory.Main;
import me.armorofglory.utils.ChatUtils;

public class BlockListener implements Listener {

	public Main plugin;
    
    public BlockListener(Main instance) {
    	plugin = instance;
    }

    @EventHandler
    public void onInventoryMoveItemEvent(InventoryMoveItemEvent e) {
    	
    	if(e.getSource().getType().equals(InventoryType.HOPPER) && e.getDestination().getType().equals(InventoryType.CHEST)) {
    		
    		Location hopperLocation = e.getSource().getLocation();
    		
    		
    		String materialName = e.getItem().getType().toString().toLowerCase();
    		ChatUtils.broadcast("Harvested " + materialName);
    	}
	    // 
        	
    }
    
}
