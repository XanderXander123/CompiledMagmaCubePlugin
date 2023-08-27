package org.ide.language.intel.manage.manager.untitled3;

package org.ide.language.intel.manage.manager.untitled3;

import java.util.UUID;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class COMPILED extends JavaPlugin implements Listener {

    @Override
    public void onEnable() { getServer().
    getPluginManager().
    registerEvents(this, this);
    getLogger().info
    ("Plugin has been STARTED!");
    }

    @Override
    public void onDisable() {
    getLogger().info("Plugin has been STOPPED!");
    }

    @EventHandler
    public void onEntityChangeBlock(EntityChangeBlockEvent event) { if (event.
    getEntity().getType() == EntityType.MAGMA_CUBE) {
    if (event.getTo() == EntityType.MAGMA_CUBE.
    getDefaultBlockHeight() && event.getFrom() == 10) {
    }
    }
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    if (cmd.getName().equalsIgnoreCase("addstrength") && sender instanceof Player) {
    Player player = (Player) sender; UUID modifierUUID = UUID.randomUUID();
    AttributeModifier strengthModifier = new AttributeModifier(modifierUUID, "Strength", 2.0, 
    AttributeModifier.Operation.ADD_NUMBER);
    player.getAttribute(Attribute.GENERIC_MAX_HEALTH).
    addModifier(strengthModifier);
    player.sendMessage("You now have increased strength!");
    return true; } return false;
    }
}
