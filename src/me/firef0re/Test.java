package me.firef0re;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin implements Listener {
	
	public void onEnable() {
		System.out.println("[Test] Plugin aktiviert!");
	}
	
	public void onDisable() {
		System.out.println("[Test] Plugin deaktiviert!");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String cmdlabel, String[] args) {
		Player p = (Player) Bukkit.getOnlinePlayers();
		
		if (cmd.getName().equalsIgnoreCase("ton")) {
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 30, 30);
			
			return false;
		}
		return false;
	}
}
