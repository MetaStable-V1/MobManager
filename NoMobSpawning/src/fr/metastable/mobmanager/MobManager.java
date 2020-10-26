package fr.metastable.mobmanager;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import fr.metastable.mobmanager.commands.CommandMobManager;
import fr.metastable.mobmanager.events.InventoryClick;
import fr.metastable.mobmanager.events.MobSpawning;
import fr.metastable.mobmanager.files.FilesManager;
import fr.metastable.mobmanager.files.MobsManager;
import fr.metastable.mobmanager.inventory.InventoryManager;
import fr.metastable.mobmanager.inventory.ItemsManager;
import fr.metastable.mobmanager.mobs.MobsList;
import fr.metastable.mobmanager.utils.MessagesList;

public class MobManager extends JavaPlugin {
	
	public FilesManager fm = new FilesManager(this);
	public MobsManager mobManager = new MobsManager(this);
	public MobsList mobList = new MobsList();
	
	public MessagesList msg = new MessagesList(this);
	
	public ItemsManager itemManager = new ItemsManager(this);
	public InventoryManager invManager = new InventoryManager(this);
	
	public File filemob = new File(getDataFolder() + File.separator + "mobs.yml");
	public FileConfiguration mob = YamlConfiguration.loadConfiguration(filemob);
	
	
	public static MobManager main;
	
	@Override
	public void onEnable() {
		fm.setupFolder();
		registerCommands();
		registerEvents();
		itemManager.registerItems();
		invManager.registerInventory();
		saveDefaultConfig();
	}
	
	public void registerCommands() {
		getCommand("mobmanager").setExecutor(new CommandMobManager(this));
	}
	
	public void registerEvents() {
		getServer().getPluginManager().registerEvents(new MobSpawning(this), this);
		getServer().getPluginManager().registerEvents(new InventoryClick(this), this);
	}
	

}
