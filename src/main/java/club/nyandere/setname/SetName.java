package club.nyandere.setname;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.command.*;

public final class SetName extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("setname").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            String displayName = args[0].replaceAll("\"","");
            player.setDisplayName(displayName);
            player.setPlayerListName(displayName);
            player.setCustomName(displayName);
            sender.sendMessage("名前を"+displayName+"に変更しました!!");
        }
        return true;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
