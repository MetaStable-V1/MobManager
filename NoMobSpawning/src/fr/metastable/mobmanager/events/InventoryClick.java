package fr.metastable.mobmanager.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.metastable.mobmanager.MobManager;
import fr.metastable.mobmanager.mobs.MobsList;

public class InventoryClick implements Listener {
	
	public MobManager main;
	public InventoryClick(MobManager mobManager) {
		this.main = mobManager;
	}

	@EventHandler
	public void onClick(InventoryClickEvent e) {
		if(e.getWhoClicked() == null || e.getCurrentItem() == null) return;
		
		Player p = (Player) e.getWhoClicked();
		
		switch(e.getCurrentItem().getType()) {
		
		case SKULL_ITEM:
			//BAT
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.BAT_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_BAT, MobsList.BAT_NAME);
			}
			
			//BLAZE
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.BLAZE_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_BLAZE, MobsList.BLAZE_NAME);
			}
			
			//CAVESPIDER
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.CAVESPIDER_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_CAVESPIDER, MobsList.CAVESPIDER_NAME);
			}
			
			//CHICKEN
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.CHICKEN_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_CHICKEN, MobsList.CHICKEN_NAME);
			}
			
			//COW
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.COW_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_COW, MobsList.COW_NAME);
			}
			
			//CREEPER
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.CREEPER_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_CREEPER, MobsList.CREEPER_NAME);
			}
			
			//ENDERDRAGON
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.ENDERDRAGON_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_ENDERDRAGON, MobsList.ENDERDRAGON_NAME);
			}
			
			//ENDERMAN
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.ENDERMAN_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_ENDERMAN, MobsList.ENDERMAN_NAME);
			}
			
			//ENDERMITE
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.ENDERMITE_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_ENDERMITE, MobsList.ENDERMITE_NAME);
			}
			
			//GHAST
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.GHAST_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_GHAST, MobsList.GHAST_NAME);
			}
			
			//GUARDIAN
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.GUARDIAN_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_GUARDIAN, MobsList.GUARDIAN_NAME);
			}
			
			
			//IRONGOLEM
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.IRONGOLEM_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_IRONGOLEM, MobsList.IRONGOLEM_NAME);
			}
			
			//MAGMACUBE
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.MAGMACUBE_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_MAGMACUBE, MobsList.MAGMACUBE_NAME);
			}
			
			//HORSE
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.HORSE_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_HORSE, MobsList.HORSE_NAME);
			}
			
			//MUSHROOMCOW
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.MUSHROOMCOW_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_MUSHROOMCOW, MobsList.MUSHROOMCOW_NAME);
			}
			
			//OCELOT
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.OCELOT_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_OCELOT, MobsList.OCELOT_NAME);
			}
			
			//PIG
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.PIG_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_PIG, MobsList.PIG_NAME);
			}
			
			//PIGZOMBIE
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.PIGZOMBIE_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_PIGZOMBIE, MobsList.PIGZOMBIE_NAME);
			}
			
			//RABBIT
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.RABBIT_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_RABBIT, MobsList.RABBIT_NAME);
			}
			
			//SHEEP
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.SHEEP_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_SHEEP, MobsList.SHEEP_NAME);
			}
			
			//SHULKER
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.SHULKER_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_SHULKER, MobsList.SHULKER_NAME);
			}
			
			//SILVERFISH
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.SILVERFISH_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_SILVERFISH, MobsList.SILVERFISH_NAME);
			}
			
			//SKELETON
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.SKELETON_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_SKELETON, MobsList.SKELETON_NAME);
			}
			
			//SLIME
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.SLIME_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_SLIME, MobsList.SLIME_NAME);
			}
			
			//SNOWMAN
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.SNOWMAN_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_SNOWMAN, MobsList.SNOWMAN_NAME);
			}
			
			//SPIDER
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.SPIDER_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_SPIDER, MobsList.SPIDER_NAME);
			}
			
			//SQUID
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.SQUID_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_SQUID, MobsList.SQUID_NAME);
			}
			
			//VILLAGER
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.VILLAGER_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_VILLAGER, MobsList.VILLAGER_NAME);
			}
			
			//WITCH
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.WITCH_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_WITCH, MobsList.WITCH_NAME);
			}
			
			//WITHER
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.WITHER_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_WITHER, MobsList.WITHER_NAME);
			}
			
			//WOLF
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(MobsList.WOLF_NAME)) {
				e.setCancelled(true);
				switchMobStatus(p, MobsList.ENTITY_WOLF, MobsList.WOLF_NAME);
			}
			break;
		default:
			break;
		
		}
	}
	
	public void switchMobStatus(Player p, String entity, String mobname) {
		if(main.mobManager.getMobSpawnActive(entity) == true) {
			main.mobManager.setMobActive(entity, false);
			p.sendMessage(main.msg.prefix() + "§7You have §cdisable " + mobname + "§7.");
			broadcastMessageDisable(mobname);
		} else if(main.mobManager.getMobSpawnActive(entity) == false){
			main.mobManager.setMobActive(entity, true);
			p.sendMessage(main.msg.prefix() + "§7You have §aenable " + mobname + "§7.");
			broadcastMessageActive(mobname);
		}
		
		main.invManager.mobManager.openInventory(p);
	}
	
	public void broadcastMessageActive(String mobname) {
		if(main.getConfig().getBoolean("broadcast.active") == true) {
			String message = main.getConfig().getString("broadcast.mobactive").replace("&", "§").replace("%prefix%", main.msg.prefix()).replace("%entity%", mobname);
			Bukkit.broadcastMessage(message);
		}
	}
	
	public void broadcastMessageDisable(String mobname) {
		if(main.getConfig().getBoolean("broadcast.active") == true) {
			String message = main.getConfig().getString("broadcast.mobdisable").replace("&", "§").replace("%prefix%", main.msg.prefix()).replace("%entity%", mobname);
			Bukkit.broadcastMessage(message);
		}
	}

}
