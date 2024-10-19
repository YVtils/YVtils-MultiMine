package yv.tils.mm.manager.shutdown

import dev.jorel.commandapi.CommandAPI

class Summarizer {
    fun shutdown() {
        CommandAPI.onDisable()
    }
}