package yv.tils.mm.utils.updater

import org.bukkit.Bukkit
import org.bukkit.entity.Player
import yv.tils.mm.YVtils
import yv.tils.mm.utils.configs.global.Config
import yv.tils.mm.utils.configs.language.LangStrings
import yv.tils.mm.utils.configs.language.Language
import yv.tils.mm.utils.internalAPI.Placeholder
import yv.tils.mm.utils.internalAPI.Vars
import yv.tils.mm.utils.logger.Debugger
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URI

class PluginVersion {
    companion object {
        var version = "x.x.x"
        var plVersion = "x.x.x"
    }

    fun onPlayerJoin(player: Player) {
        if (!(Config.config["playerUpdateMessage"] as Boolean)) {
            return
        }

        if ((player.hasPermission("yvtils.mm.update") || player.isOp) && plVersion != version) {
            player.sendMessage(
                Placeholder().replacer(
                    Language().getMessage(player.uniqueId, LangStrings.PLAYER_PLUGIN_UPDATE_AVAILABLE),
                    listOf("newVersion", "oldVersion", "prefix", "link"),
                    listOf(
                        version,
                        plVersion,
                        Vars().prefix,
                        "<click:open_url:https://yvtils.net/yvtils/modrinth/mm>https://yvtils.net/yvtils/modrinth/mm</click>"
                    )
                )
            )
        }
    }

    fun updateChecker(serverPluginVersion: String) {
        plVersion = serverPluginVersion
        webRequest()

        if (plVersion != version) {
            YVtils.instance.server.sendMessage(
                Placeholder().replacer(
                    Language().getMessage(LangStrings.PLUGIN_UPDATE_AVAILABLE),
                    listOf("newversion", "oldversion", "prefix", "link"),
                    listOf(
                        version,
                        plVersion,
                        Vars().prefix,
                        "<click:open_url:https://yvtils.net/yvtils/modrinth/mm>https://yvtils.net/yvtils/modrinth/mm</click>"
                    )
                )
            )
        } else {
            YVtils.instance.server.sendMessage(
                Placeholder().replacer(
                    Language().getMessage(LangStrings.PLUGIN_UP_TO_DATE),
                    listOf("prefix"),
                    listOf(Vars().prefix)
                )
            )
        }
    }

    private fun webRequest() {
        try {
            val url = "https://yvtils.net/yvtils/version/mm.txt"
            val connection = URI(url).toURL().openConnection() as HttpURLConnection
            connection.requestMethod = "GET"

            val responseCode = connection.responseCode
            if (responseCode == HttpURLConnection.HTTP_OK) {
                val reader = BufferedReader(InputStreamReader(connection.inputStream))
                val content = StringBuilder()

                reader.use {
                    it.lines().forEach { line ->
                        content.append(line)
                    }
                }

                reader.close()
                connection.disconnect()

                version = content.toString()
            } else {
                YVtils.instance.server.sendMessage(
                    Language().directFormat(
                        "There occurred an error while searching for an update! Please contact the support!",
                        "Auf der Suche nach einem Plugin Update ist ein Fehler aufgetreten! Bitte kontaktiere den Support!"
                    )
                )
                Debugger().log(
                    "Update Check Error",
                    "Response Code: $responseCode",
                    "yv.tils.mm.utils.updater.PluginVersion.webRequest()"
                )
            }
        } catch (e: Exception) {
            YVtils.instance.logger.warning("Update Check Error: ${e.message}")
        }
    }
}