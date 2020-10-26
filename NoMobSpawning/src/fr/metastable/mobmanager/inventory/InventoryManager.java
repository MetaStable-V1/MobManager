package fr.metastable.mobmanager.inventory;

import fr.metastable.mobmanager.MobManager;

public class InventoryManager {
	
	public MobManager main;
	public InventoryManager(MobManager main) {
		this.main = main;
	}
	
	public IventoryMobManager mobManager;
	
	public void registerInventory() {
		this.mobManager = new IventoryMobManager(main);
	}

}
