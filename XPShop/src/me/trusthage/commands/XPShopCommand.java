package me.trusthage.commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
public class XPShopCommand implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player))return false;
		Player player = (Player)sender;
		
		if(player.hasPermission("trusthage.xpshop")){
			openGUI(player.getPlayer());
		}else{
			player.sendMessage(ChatColor.RED + "You don't have permission to use that command.");
		}
		
		return false;
	}
	
	public void openGUI(Player player){
		ArrayList<String> buyLore = new ArrayList<String>();
		ArrayList<String> sellLore = new ArrayList<String>();
		
		Inventory mainmenu = Bukkit.createInventory(null, 36, "Xp Shop");
		
		ItemStack buy = new ItemStack(Material.DIAMOND);
		ItemMeta buyMeta = buy.getItemMeta();
		buyLore.add("Buy items with your XP");
		buyMeta.setLore(buyLore);
		
		ItemStack sell = new ItemStack(Material.EXP_BOTTLE);
		ItemMeta sellMeta = sell.getItemMeta();
		sellLore.add("Sell items for XP");
		buyMeta.setLore(sellLore);
		
		ItemStack quit = new ItemStack(Material.BARRIER);
		ItemMeta quitMeta = quit.getItemMeta();

		buyMeta.setDisplayName("Buy");
		buy.setItemMeta(buyMeta);
		sellMeta.setDisplayName("Sell");
		sell.setItemMeta(sellMeta);
		quitMeta.setDisplayName("Quit");
		quit.setItemMeta(quitMeta);
		
		mainmenu.setItem(12, buy);
		mainmenu.setItem(14, sell);
		mainmenu.setItem(31, quit);
		
		player.openInventory(mainmenu);
	}

}
