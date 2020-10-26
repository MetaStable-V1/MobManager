package fr.metastable.mobmanager.inventory;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import fr.metastable.mobmanager.MobManager;
import fr.metastable.mobmanager.mobs.MobsList;

public class IventoryMobManager {

	public MobManager main;
	public IventoryMobManager(MobManager main) {
		this.main = main;
	}
	
	public Inventory openInventory(Player p) {
		Inventory mob = Bukkit.createInventory(null, 5*9, main.msg.prefix().replace("[", "").replace("]", ""));
		
		mob.setItem(0, main.itemManager.skulls.skullCreator(MobsList.ENTITY_BAT, MobsList.BAT_NAME, "bat"));
		mob.setItem(1, main.itemManager.skulls.skullCreator(MobsList.ENTITY_BLAZE, MobsList.BLAZE_NAME, "Hiski"));
		mob.setItem(2, main.itemManager.skulls.skullCreator(MobsList.ENTITY_CAVESPIDER, MobsList.CAVESPIDER_NAME, "MHF_CaveSpider"));
		mob.setItem(3, main.itemManager.skulls.skullCreator(MobsList.ENTITY_CHICKEN, MobsList.CHICKEN_NAME, "Chicken"));
		mob.setItem(4, main.itemManager.skulls.skullCreator(MobsList.ENTITY_COW, MobsList.COW_NAME, "Cow"));
		mob.setItem(5, main.itemManager.skulls.skullCreator(MobsList.ENTITY_CREEPER, MobsList.CREEPER_NAME, "Creeper"));
		mob.setItem(6, main.itemManager.skulls.skullCreator(MobsList.ENTITY_ENDERDRAGON, MobsList.ENDERDRAGON_NAME, "1966z"));
		mob.setItem(7, main.itemManager.skulls.skullCreator(MobsList.ENTITY_ENDERMAN, MobsList.ENDERMAN_NAME, "16eh"));
		mob.setItem(8, main.itemManager.skulls.skullCreator(MobsList.ENTITY_ENDERMITE, MobsList.BLAZE_NAME, "Endermite"));
		mob.setItem(9, main.itemManager.skulls.skullCreator(MobsList.ENTITY_GHAST, MobsList.GHAST_NAME, "Ghast"));
		mob.setItem(10, main.itemManager.skulls.skullCreator(MobsList.ENTITY_GUARDIAN, MobsList.GUARDIAN_NAME, "Guardian"));
		mob.setItem(11, main.itemManager.skulls.skullCreator(MobsList.ENTITY_HORSE, MobsList.HORSE_NAME, "minecade5"));
		mob.setItem(12, main.itemManager.skulls.skullCreator(MobsList.ENTITY_IRONGOLEM, MobsList.IRONGOLEM_NAME, "Golem"));
		mob.setItem(13, main.itemManager.skulls.skullCreator(MobsList.ENTITY_MAGMACUBE, MobsList.MAGMACUBE_NAME, "MagmaCube"));
		mob.setItem(14, main.itemManager.skulls.skullCreator(MobsList.ENTITY_MUSHROOMCOW, MobsList.MUSHROOMCOW_NAME, "XxXSwagnemiteXxX"));
		mob.setItem(15, main.itemManager.skulls.skullCreator(MobsList.ENTITY_OCELOT, MobsList.OCELOT_NAME, "Ocelot"));
		mob.setItem(16, main.itemManager.skulls.skullCreator(MobsList.ENTITY_PIG, MobsList.PIG_NAME, "Pig"));
		mob.setItem(17, main.itemManager.skulls.skullCreator(MobsList.ENTITY_PIGZOMBIE, MobsList.PIGZOMBIE_NAME, "Brin"));
		mob.setItem(18, main.itemManager.skulls.skullCreator(MobsList.ENTITY_RABBIT, MobsList.RABBIT_NAME, "AgusGP"));
		mob.setItem(19, main.itemManager.skulls.skullCreator(MobsList.ENTITY_SHEEP, MobsList.SHEEP_NAME, "Kurz"));
		mob.setItem(20, main.itemManager.skulls.skullCreator(MobsList.ENTITY_SHULKER, MobsList.SHULKER_NAME, "null"));
		mob.setItem(21, main.itemManager.skulls.skullCreator(MobsList.ENTITY_SILVERFISH, MobsList.SILVERFISH_NAME, "null"));
		mob.setItem(22, main.itemManager.skulls.skullCreator(MobsList.ENTITY_SKELETON, MobsList.SKELETON_NAME, "Skeleton"));
		mob.setItem(23, main.itemManager.skulls.skullCreator(MobsList.ENTITY_SLIME, MobsList.SLIME_NAME, "md_5"));
		mob.setItem(24, main.itemManager.skulls.skullCreator(MobsList.ENTITY_SNOWMAN, MobsList.SNOWMAN_NAME, "Mulfi_Stars"));
		mob.setItem(25, main.itemManager.skulls.skullCreator(MobsList.ENTITY_SPIDER, MobsList.SPIDER_NAME, "MHF_Spider"));
		mob.setItem(26, main.itemManager.skulls.skullCreator(MobsList.ENTITY_SQUID, MobsList.SQUID_NAME, "Squid"));
		mob.setItem(27, main.itemManager.skulls.skullCreator(MobsList.ENTITY_VILLAGER, MobsList.VILLAGER_NAME, "Villager"));
		mob.setItem(28, main.itemManager.skulls.skullCreator(MobsList.ENTITY_WITCH, MobsList.WITCH_NAME, "koqel"));
		mob.setItem(29, main.itemManager.skulls.skullCreator(MobsList.ENTITY_WITHER, MobsList.WITHER_NAME, "WitherSkeleton"));
		mob.setItem(29, main.itemManager.skulls.skullCreator(MobsList.ENTITY_WOLF, MobsList.WOLF_NAME, "N5N"));
		p.openInventory(mob);
		return mob;
	}

}
