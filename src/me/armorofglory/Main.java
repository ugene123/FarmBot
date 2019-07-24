package me.armorofglory;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.armorofglory.commands.PluginCommandExecutor;
import me.armorofglory.config.ConfigAccessor;
import me.armorofglory.listeners.BlockListener;

public final class Main extends JavaPlugin {
	
	private static Plugin plugin; 
	
	public static Plugin getPlugin() {
		return plugin;
	}

	
	@Override
    public void onEnable() {
        // TODO Insert logic to be performed when the plugin is enabled
		getLogger().info("[FarmBot] Enabled!");
		
		this.registerEvents();
		this.registerCommands();
		
		plugin = this;
		ConfigAccessor.plugin = this;
		ConfigAccessor.loadConfiguration();
		
    }
    
    @Override
    public void onDisable() {
        // TODO Insert logic to be performed when the plugin is disabled
    	getLogger().info("[FarmBot] Disabled!");
    }
    
    public void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new BlockListener(this), this);
	} 
    
    public void registerCommands() {
		this.getCommand("farm").setExecutor(new PluginCommandExecutor(this));
	}
    
}