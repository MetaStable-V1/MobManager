package fr.metastable.mobmanager.inventory;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import fr.metastable.mobmanager.MobManager;

public class SkullsItems {

	public MobManager main;
	public SkullsItems(MobManager main) {
		this.main = main;
	}
	
	public ItemStack skullCreator(String entity, String itemname, String skullowner) {
		String status;
		if(main.mobManager.getMobSpawnActive(entity) == true) {
			status = "§aEnable";
		} else {
			status = "§cDisable";
		}
		
		List<String> lore = new ArrayList<String>();
		lore.clear();
		lore.add("");
		lore.add(main.msg.getConfigMessage(main.msg.SKULL_STATUS_MESSAGE).replace("%status%",status));
		lore.add("");
		lore.add(main.msg.getConfigMessage(main.msg.SKULL_SWITCH_MESSAGE));
		
		ItemStack skullCreator = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		SkullMeta cs = (SkullMeta) skullCreator.getItemMeta();
		cs.setDisplayName(itemname);
		cs.setLore(lore);
		cs.setOwner(skullowner);
		cs.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		skullCreator.setItemMeta(cs);
		
		return skullCreator;
	}

}
