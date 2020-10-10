package net.skaerf.beatcraft;

import org.bukkit.plugin.java.JavaPlugin;

public final class BeatCraft extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("[BeatCraft] Starting...");
		this.getServer().getPluginManager().registerEvents(new Events(), this);
	}

}
