package fr.metastable.mobmanager.commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.metastable.mobmanager.MobManager;

public class CommandMobManager implements CommandExecutor {

	public MobManager main;
	public CommandMobManager(MobManager mobManager) {
		this.main = mobManager;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			
			switch(args.length) {
			case 0:
				if(p.hasPermission("mobmanager.manage")) {
					main.invManager.mobManager.openInventory(p);
					p.sendMessage(main.msg.prefix() + " §eOther commands");
					p.sendMessage("§r- §b/mm reload §r| §rReload §econfig.yml");
					p.sendMessage("§r- §b/mm world list §r| §rSee list of worlds");
				} else {
					p.sendMessage("§cYou need permission §rmobmanager.manage");
				}
				break;
				
			case 1:
				if(p.hasPermission("mobmanager.manage")) {
					if(args[0].equalsIgnoreCase("reload")) {
						main.reloadConfig();
						p.sendMessage("§aYou have reloaded the §econfig.yml");
					} else if(args[0].equalsIgnoreCase("world")) {
						p.sendMessage("§cUsages§r:");
						p.sendMessage("§r- §b/mm world list §r| §rSee list of worlds");
					} else {
						p.sendMessage(main.msg.prefix() + " §cUsages§r:");
						p.sendMessage("§r- §b/mm reload §r| §rReload §econfig.yml");
						p.sendMessage("§r- §b/mm world list §r| §rSee list of worlds");
					}
				} else {
					p.sendMessage("§cYou need permission §rmobmanager.manage");
				}
				break;
				
			case 2:
				if(p.hasPermission("mobmanager.world")) {
					if(args[0].equalsIgnoreCase("world") && args[1].equalsIgnoreCase("list")) {
						p.sendMessage("§dLoading your worlds...");
						p.sendMessage("§r§m-----------------------------");
						p.sendMessage("§cWorld in config.yml§r:");
						for(String d : main.getConfig().getStringList("worlds")) {
							p.sendMessage("§r- §e" + d);
						}
						p.sendMessage("§6World loaded in your server§r:");
						for(World worlds : main.getServer().getWorlds()) {
							p.sendMessage("§r- §e" + worlds.getName());
						}
						p.sendMessage("§r(§7Add this in config.yml if you want disable mob)");
						p.sendMessage("§r§m-----------------------------");
					} else {
						p.sendMessage(main.msg.prefix() + " §cUsages§r:");
						p.sendMessage("§r- §b/mm reload §r| §rReload §econfig.yml");
						p.sendMessage("§r- §b/mm world list §r| §rSee list of worlds");
					}
				} else {
					p.sendMessage("§cYou need permission §rmobmanager.world");
				}
				
				break;
				
			case 3: case 4: case 5:
				p.sendMessage("§cNo commands use /mm");
				break;
			}
		}
		return true;
	}

}
