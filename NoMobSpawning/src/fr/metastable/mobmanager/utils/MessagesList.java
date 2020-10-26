package fr.metastable.mobmanager.utils;

import fr.metastable.mobmanager.MobManager;

public class MessagesList {
	
	public MobManager main;
	public MessagesList(MobManager main) {
		this.main = main;
	}
	
	public String PREFIX = "prefix";
	public String SKULL_STATUS_MESSAGE = "item.skulls.description.status";
	public String SKULL_SWITCH_MESSAGE = "item.skulls.description.switch";
	
	public String prefix() {
		return main.getConfig().getString(PREFIX).replace("&", "§");
	}
	
	public String getConfigMessage(String path) {
		return main.getConfig().getString(path).replace("&", "§");
	}
	
	public String getFileMessage(String path) {
		return "";
	}

}
