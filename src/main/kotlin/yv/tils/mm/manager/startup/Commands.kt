package yv.tils.mm.manager.startup

import yv.tils.mm.mods.multiMine.BlockManage

class Commands {
    fun registerCommands() {
        modulesCommands()
    }

    private fun modulesCommands() {
        BlockManage()
    }
}