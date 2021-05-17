package live.mufin.pingchecker;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public void onEnable() {
        CommandSender sender = Bukkit.getConsoleSender();
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&bPC&8] &8============================="));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&bPC&8] &bPingChecker &7v&b1.0 &7by &bmufinlive&7."));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&bPC&8] &7GitHub repository: &bhttps://github.com/mufinlive/pingchecker"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&bPC&8] &8============================="));

        this.getCommand("ping").setExecutor(new PingCommand());
    }
    public void onDisable() {

    }
}
