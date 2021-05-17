package live.mufin.pingchecker;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PingCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(label.equalsIgnoreCase("ping")) {
            if(args.length > 1) {
                try {
                    Player target = Bukkit.getPlayer(args[0]);
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&bPC&8] &7Ping of &b" + target.getName() + "&7is &b " + target.getPing() + "&7."));
                } catch (NullPointerException e) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&bPC&8] &cInvalid user."));
                }
            } else {
                Player p = (Player) sender;
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&bPC&8] &7Your ping is &b" + p.getPing() + "&7."));
            }
        }
        return true;
    }
}
