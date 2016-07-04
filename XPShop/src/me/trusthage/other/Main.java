package me.trusthage.other;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public static Main plugin;
	Logger logger = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable(){
		plugin = this;
		logger.info("XPShop plugin has been enabled.");
	}
	
	@Override
	public void onDisable(){
		logger.info("XPShop plugin has been disabled");
	}

}
