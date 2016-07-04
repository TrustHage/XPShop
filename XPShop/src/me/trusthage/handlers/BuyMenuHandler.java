package me.trusthage.handlers;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.trusthage.menus.buy.building.BuildingP1;

public class BuyMenuHandler implements Listener{
	
	BuildingP1 building = new BuildingP1();
	
	@EventHandler
	public void onBuyMenuClick(InventoryClickEvent e){
		if(!e.getInventory().getName().equalsIgnoreCase("Buy Menu")) return;
		
		Player player = (Player)e.getWhoClicked();
		e.setCancelled(true);
		
		if(e.getCurrentItem()==null || e.getCurrentItem().getType()==Material.AIR||!e.getCurrentItem().hasItemMeta())
		{
			return;
		}
		
		switch(e.getCurrentItem().getType()){
		case BRICK:
			building.openBuildMenuP1(player.getPlayer());
			break;
		default:
			player.closeInventory();
		}
	}

}
