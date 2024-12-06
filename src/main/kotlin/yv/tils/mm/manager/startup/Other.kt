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
        PluginVersion().asyncUpdateChecker()
        PluginVersion().updateChecker(YVtils.instance.yvtilsVersion)
    }

    private fun permissions() {
        val pm = YVtils.instance.server.pluginManager
        pm.addPermission(Permission.loadPermission("yvtils.mm.multiMine", mapOf()))
        pm.addPermission(Permission.loadPermission("yvtils.mm.command.multiMine.toggle", mapOf()))
        pm.addPermission(Permission.loadPermission("yvtils.mm.command.multiMine.manage", mapOf()))
    }
}