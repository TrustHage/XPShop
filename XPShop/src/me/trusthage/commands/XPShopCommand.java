package me.trusthage.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class XPShopCommand implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player))return false;
		Player player = (Player)sender;
		
		if(player.hasPermission("trusthage.xpshop")){
			
		}
		
		return false;
	}

}
