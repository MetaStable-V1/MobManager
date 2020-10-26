package fr.metastable.mobmanager.inventory;

import fr.metastable.mobmanager.MobManager;

public class ItemsManager {
	
	public MobManager main;
	public ItemsManager(MobManager main) {
		this.main = main;
	}
	
	public SkullsItems skulls;
	
	public void registerItems() {
		this.skulls = new SkullsItems(main);
	}

}
