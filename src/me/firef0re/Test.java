package me.firef0re;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin implements Listener {
	
	public void onEnable() {
		System.out.println("[Test] Plugin aktiviert!");
	}
	
	public void onDisable() {
		System.out.println("[Test] Plugin deaktiviert!");
	}
}
