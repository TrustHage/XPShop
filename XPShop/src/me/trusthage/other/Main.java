package me.trusthage.other;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.trusthage.commands.XPShopCommand;
import me.trusthage.handlers.BuyMenuHandler;
import me.trusthage.handlers.MainMenuHandler;

public class Main extends JavaPlugin{
	
	public static Main plugin;
	Logger logger = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable(){
		plugin = this;
		logger.info("XPShop plugin has been enabled.");
		getCommand("xpshop").setExecutor(new XPShopCommand());
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new MainMenuHandler(), this);
		pm.registerEvents(new BuyMenuHandler(), this);
	}
	
	@Override
	public void onDisable(){
		logger.info("XPShop plugin has been disabled");
	}

}
