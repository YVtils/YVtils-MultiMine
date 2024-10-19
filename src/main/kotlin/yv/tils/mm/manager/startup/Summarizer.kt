package yv.tils.mm.manager.startup

import dev.jorel.commandapi.CommandAPI
import yv.tils.mm.utils.logger.Debugger

class Summarizer {
    fun startup() {
        Debugger().log("Starting up", "Listeners loading", "yv.tils.mm.manager.startup.Summarizer")

        val listeners = Listeners()
        listeners.register()

        Debugger().log("Starting up", "Commands loading", "yv.tils.mm.manager.startup.Summarizer")

        val commands = Commands()
        CommandAPI.onEnable()
        commands.registerCommands()

        Debugger().log("Starting up", "Other loading", "yv.tils.mm.manager.startup.Summarizer")

        val other = Other()
        other.register()
    }
}