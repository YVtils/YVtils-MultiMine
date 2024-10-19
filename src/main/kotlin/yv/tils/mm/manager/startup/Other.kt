package yv.tils.mm.manager.startup

import org.bukkit.permissions.Permission
import yv.tils.mm.YVtils
import yv.tils.mm.utils.updater.PluginVersion

class Other {
    fun register() {
        pluginVersion()
        permissions()
    }

    private fun pluginVersion() {
        PluginVersion().updateChecker(YVtils.instance.pluginVersion)
    }

    private fun permissions() {
        val pm = YVtils.instance.server.pluginManager
        pm.addPermission(Permission.loadPermission("yvtils.mm.multiMine", mapOf()))
    }
}