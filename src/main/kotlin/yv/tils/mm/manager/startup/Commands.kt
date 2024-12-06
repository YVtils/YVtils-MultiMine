package yv.tils.mm.manager.startup

import yv.tils.mm.mods.multiMine.MultiMineCommand

class Commands {
    fun registerCommands() {
        modulesCommands()
    }

    private fun modulesCommands() {
        MultiMineCommand()
    }
}