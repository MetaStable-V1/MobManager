package fr.metastable.mobmanager.files;

import java.io.IOException;

import fr.metastable.mobmanager.MobManager;

public class FilesManager {
	
	public MobManager main;
	public FilesManager(MobManager mobManager) {
		this.main = mobManager;
	}
	
	public void setupFolder() {
		if(!(isSetup())) {
			main.getDataFolder().mkdir();
			setupFiles();
		} else {
			setupFiles();
		}
		
	}
	
	public boolean isSetup() {
		return main.getDataFolder().exists();
	}
	
	public void setupFiles() {
		if(!(main.filemob.exists())) {
			try {
				main.filemob.createNewFile();
				main.mobManager.setupConfig();
				saveFiles();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void saveFiles() {
		try {
			main.mob.save(main.filemob);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
