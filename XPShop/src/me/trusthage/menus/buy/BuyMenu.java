package me.trusthage.menus.buy;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BuyMenu {

	public void openBuyMenu(Player player){
		
		
		Inventory buymenu = Bukkit.createInventory(null, 45, "Buy Menu");
		
		/*
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		
		menu.setItem(, );
		*/
		
		ItemStack building = new ItemStack(Material.BRICK);
		ItemMeta buildingMeta = building.getItemMeta();
		ItemStack decoration  = new ItemStack(Material.DOUBLE_PLANT, 1, (short)5);
		ItemMeta decorationMeta = decoration.getItemMeta();
		ItemStack redstone = new ItemStack(Material.REDSTONE);
		ItemMeta redstoneMeta = redstone.getItemMeta();
		ItemStack transportation = new ItemStack(Material.POWERED_RAIL);
		ItemMeta transportationMeta = transportation.getItemMeta();
		ItemStack misc = new ItemStack(Material.LAVA_BUCKET);
		ItemMeta miscMeta = misc.getItemMeta();
		ItemStack food = new ItemStack(Material.APPLE);
		ItemMeta foodMeta = food.getItemMeta();
		ItemStack tools = new ItemStack(Material.IRON_AXE);
		ItemMeta toolsMeta = tools.getItemMeta();
		ItemStack combat = new ItemStack(Material.GOLD_SWORD);
		ItemMeta combatMeta = combat.getItemMeta();
		ItemStack brewing = new ItemStack(Material.POTION);
		ItemMeta brewingMeta = brewing.getItemMeta();
		ItemStack materials = new ItemStack(Material.STICK);
		ItemMeta materialsMeta = materials.getItemMeta();
		ItemStack quit = new ItemStack(Material.BARRIER);
		ItemMeta quitMeta = quit.getItemMeta();
		
		buildingMeta.setDisplayName("Building Blocks");
		building.setItemMeta(buildingMeta);
		decorationMeta.setDisplayName("Decoration Blocks");
		decoration.setItemMeta(decorationMeta);
		redstoneMeta.setDisplayName("Redstone");
		redstone.setItemMeta(redstoneMeta);
		transportationMeta.setDisplayName("Transportation");
		transportation.setItemMeta(transportationMeta);
		miscMeta.setDisplayName("Miscellaneous");
		misc.setItemMeta(miscMeta);
		foodMeta.setDisplayName("Foodstuffs");
		food.setItemMeta(foodMeta);
		toolsMeta.setDisplayName("Tools");
		tools.setItemMeta(toolsMeta);
		combatMeta.setDisplayName("Combat");
		combat.setItemMeta(combatMeta);
		brewingMeta.setDisplayName("Brewing");
		brewing.setItemMeta(brewingMeta);
		materialsMeta.setDisplayName("Materials");
		materials.setItemMeta(materialsMeta);
		quitMeta.setDisplayName("Quit");
		quit.setItemMeta(quitMeta);
		
		buymenu.setItem(11, building);
		buymenu.setItem(12, decoration);
		buymenu.setItem(13, redstone);
		buymenu.setItem(14, transportation);
		buymenu.setItem(15, misc);
		buymenu.setItem(20, food);
		buymenu.setItem(21, tools);
		buymenu.setItem(22, combat);
		buymenu.setItem(23, brewing);
		buymenu.setItem(24, materials);
		buymenu.setItem(40, quit);
		
		player.openInventory(buymenu);
	}
	
}
