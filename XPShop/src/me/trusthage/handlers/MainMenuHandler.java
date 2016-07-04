package me.trusthage.handlers;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MainMenuHandler implements Listener{

	@EventHandler
	public void onMainMenuClick(InventoryClickEvent e){
		if(!e.getInventory().getName().equalsIgnoreCase("Xp Shop")) return;
		
		Player player = (Player)e.getWhoClicked();
		e.setCancelled(true);
		
		if(e.getCurrentItem()==null || e.getCurrentItem().getType()==Material.AIR||!e.getCurrentItem().hasItemMeta())
		{
			return;
		}
		
		switch(e.getCurrentItem().getType())
		{
		case DIAMOND:
			//openBuyMenu(player.getPlayer());
			break;
		case EXP_BOTTLE:
			//openSellMenu(player.getPlayer());
			break;
		case BARRIER:
			player.closeInventory();
			break;
		default:
			player.closeInventory();
			break;
		}
	}
	
}
