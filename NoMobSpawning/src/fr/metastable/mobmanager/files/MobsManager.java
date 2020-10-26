package fr.metastable.mobmanager.files;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Entity;

import fr.metastable.mobmanager.MobManager;
import fr.metastable.mobmanager.mobs.MobsList;

public class MobsManager {
	
	public MobManager main;
	public MobsManager(MobManager mobManager) {
		this.main = mobManager;
	}
	
	public void setupConfig() {
		setupMob(MobsList.ENTITY_BAT, "&ebat"); //1
		setupMob(MobsList.ENTITY_BLAZE, "&eblaze"); //2
		setupMob(MobsList.ENTITY_CAVESPIDER, "&ecavespider"); //3
		setupMob(MobsList.ENTITY_CHICKEN, "&echicken"); //4
		setupMob(MobsList.ENTITY_COW, "&ecow"); //5 
		setupMob(MobsList.ENTITY_CREEPER, "&ecreeper"); //6
		setupMob(MobsList.ENTITY_ENDERDRAGON, "&eenderdragon"); //7
		setupMob(MobsList.ENTITY_ENDERMAN, "&eenderman"); //8
		setupMob(MobsList.ENTITY_ENDERMITE, "&eendermite");
		setupMob(MobsList.ENTITY_GHAST, "&eghast");
		setupMob(MobsList.ENTITY_GUARDIAN, "&eguardian");
		setupMob(MobsList.ENTITY_HORSE, "&ehorse");
		setupMob(MobsList.ENTITY_IRONGOLEM, "&eirongolem");
		setupMob(MobsList.ENTITY_MAGMACUBE, "&emagmacube");
		setupMob(MobsList.ENTITY_MUSHROOMCOW, "&emushroomcow");
		setupMob(MobsList.ENTITY_OCELOT, "&eocelot");
		setupMob(MobsList.ENTITY_PIG, "&epig");
		setupMob(MobsList.ENTITY_PIGZOMBIE, "&epigzombie");
		setupMob(MobsList.ENTITY_RABBIT, "&erabbit");
		setupMob(MobsList.ENTITY_SHEEP, "&esheep");
		setupMob(MobsList.ENTITY_SHULKER, "&eshulker");
		setupMob(MobsList.ENTITY_SILVERFISH, "&esilverfish");
		setupMob(MobsList.ENTITY_SKELETON, "&eskeleton");
		setupMob(MobsList.ENTITY_SLIME, "&eslime");
		setupMob(MobsList.ENTITY_SNOWMAN, "&esnowman");
		setupMob(MobsList.ENTITY_SPIDER, "&espider");
		setupMob(MobsList.ENTITY_SQUID, "&esquid");
		setupMob(MobsList.ENTITY_VILLAGER, "&evillager");
		setupMob(MobsList.ENTITY_WITCH, "&ewitch");
		setupMob(MobsList.ENTITY_WITHER, "&ewither");
		setupMob(MobsList.ENTITY_WOLF, "&ewolf");
	}
	
	public void setupMob(String entity, String name) {
		main.mob.set(entity + ".active", true);
		main.mob.set(entity + ".customname", false);
		main.mob.set(entity + ".name", name);
	}
	
	public boolean getMobSpawnActive(String entity) {
		return main.mob.getBoolean(entity + ".active");
	}
	
	public void setMobActive(String entity, boolean value) {
		main.mob.set(entity + ".active", value);
		main.fm.saveFiles();
	}
	
	public void clearEntity(Entity entity) {
		for(World world : Bukkit.getWorlds()) {
			world.getEntities().remove(entity);
		}
	}
	
	public boolean getMobCustomNameActive(String entity) {
		return main.mob.getBoolean(entity + ".customname");
	}
	
	public String getMobCustomName(String entity) {
		return main.mob.getString(entity + ".name").replace("&", "§");
	}
	

}
