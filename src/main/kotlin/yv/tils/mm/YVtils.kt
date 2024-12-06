package yv.tils.mm

import dev.jorel.commandapi.CommandAPI
import dev.jorel.commandapi.CommandAPIBukkitConfig
import org.bukkit.NamespacedKey
import org.bukkit.plugin.java.JavaPlugin
import yv.tils.mm.manager.startup.Configs
import yv.tils.mm.utils.configs.language.LangStrings
import yv.tils.mm.utils.configs.language.Language
import yv.tils.mm.utils.internalAPI.Placeholder
import yv.tils.mm.utils.internalAPI.Vars
import yv.tils.mm.utils.logger.Debugger

class YVtils : JavaPlugin() {
    companion object {
        lateinit var instance: YVtils
        lateinit var key: NamespacedKey
    }

    val yvtilsVersion = pluginMeta.version

    override fun onLoad() {
        instance = this
        CommandAPI.onLoad(CommandAPIBukkitConfig(instance).silentLogs(true).verboseOutput(false))
        key = NamespacedKey(this, "yvtils")

        val configs = Configs()
        configs.register()
        configs.load()

        Debugger().log("Starting up", "Configs loaded", "yv.tils.mm.manager.startup.Summarizer")
    }

    override fun onEnable() {
        Debugger().log(
            "YVtils MM Start",
            Language().directFormat(
                "This is the first real action of the plugin!",
                "Dies ist die erste richtige Aktion des Plugins!"
            ),
            "yv.tils.mm.YVtils"
        )

        server.sendMessage(
            Placeholder().replacer(
                Language().getMessage(LangStrings.START_MESSAGE),
                listOf("prefix"),
                listOf(Vars().prefix)
            )
        )

        yv.tils.mm.manager.startup.Summarizer().startup()

        server.sendMessage(
            Placeholder().replacer(
                Language().getMessage(LangStrings.START_COMPLETED_MESSAGE),
                listOf("prefix"),
                listOf(Vars().prefix)
            )
        )
    }

    override fun onDisable() {
        server.consoleSender.sendMessage(
            Placeholder().replacer(
                Language().getMessage(LangStrings.STOP_MESSAGE),
                listOf("prefix"),
                listOf(Vars().prefix)
            )
        )

        yv.tils.mm.manager.shutdown.Summarizer().shutdown()

        server.consoleSender.sendMessage(
            Placeholder().replacer(
                Language().getMessage(LangStrings.STOP_COMPLETED_MESSAGE),
                listOf("prefix"),
                listOf(Vars().prefix)
            )
        )    }
}
