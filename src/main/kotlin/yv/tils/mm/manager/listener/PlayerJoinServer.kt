package yv.tils.mm.manager.listener

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import yv.tils.mm.mods.server.connect.PlayerJoin

class PlayerJoinServer : Listener {
    @EventHandler
    fun onEvent(e: PlayerJoinEvent) {
        PlayerJoin().eventReceiver(e)
    }
}