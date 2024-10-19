package yv.tils.mm.manager.startup

import yv.tils.mm.YVtils
import yv.tils.mm.manager.listener.BlockBreak
import yv.tils.mm.manager.listener.PlayerJoinServer

class Listeners {
    fun register() {
        val plugin = YVtils.instance

        // Player-related events
        plugin.server.pluginManager.registerEvents(PlayerJoinServer(), plugin)

        // Block-related events
        plugin.server.pluginManager.registerEvents(BlockBreak(), plugin)
    }
}