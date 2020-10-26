package fr.metastable.mobmanager.events;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

import fr.metastable.mobmanager.MobManager;
import fr.metastable.mobmanager.mobs.MobsList;

public class MobSpawning implements Listener {
	
	public MobManager main;
	public MobSpawning(MobManager mobManager) {
		this.main = mobManager;
	}
	
	@EventHandler
	public void onMobSpawn(EntitySpawnEvent e) {
		
		EntityType d = e.getEntityType();
		
		//BAT
		if(d == EntityType.BAT && getSpawnActive(MobsList.ENTITY_BAT) == false) {
			e.setCancelled(true);
			if(getNameActive(MobsList.ENTITY_BAT) == true) {
				e.getEntity().setCustomName(getCustomName(MobsList.BAT_NAME));
			}
		}
		
		//BLAZE
		if(d == EntityType.BLAZE && getSpawnActive(MobsList.ENTITY_BLAZE) == false) {
			e.setCancelled(true);
			if(getNameActive(MobsList.ENTITY_BLAZE) == true) {
				e.getEntity().setCustomName(getCustomName(MobsList.BLAZE_NAME));
			}
		}
		
		// CAVESPIDER
		if(d == EntityType.CAVE_SPIDER && getSpawnActive(MobsList.ENTITY_CAVESPIDER) == false) {
			e.setCancelled(true);
			if(getNameActive(MobsList.ENTITY_CAVESPIDER) == true) {
				e.getEntity().setCustomName(getCustomName(MobsList.CAVESPIDER_NAME));
			}
		}
		
		//CHICKEN
		if(d == EntityType.CHICKEN && getSpawnActive(MobsList.ENTITY_CHICKEN) == false) {
			e.setCancelled(true);
			if(getNameActive(MobsList.ENTITY_CHICKEN) == true) {
				e.getEntity().setCustomName(getCustomName(MobsList.CHICKEN_NAME));
			}
		}
	}
	
	
	public boolean getSpawnActive(String entity) {
		return main.mobManager.getMobSpawnActive(entity);
	}
	
	public boolean getNameActive(String entity) {
		return main.mobManager.getMobCustomNameActive(entity);
	}
	
	public String getCustomName(String name) {
		return main.mobManager.getMobCustomName(name);
	}

}
