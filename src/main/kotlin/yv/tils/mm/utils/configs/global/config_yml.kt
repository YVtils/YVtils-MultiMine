package yv.tils.mm.utils.configs.global

import org.bukkit.configuration.file.YamlConfiguration
import yv.tils.mm.YVtils
import java.io.File

class config_yml {
    private val file = File(YVtils.instance.dataFolder.path, "config.yml")
    private val ymlFile: YamlConfiguration = YamlConfiguration.loadConfiguration(file)

    fun strings() {
        ymlFile.addDefault("documentation", "https://docs.yvtils.net/mm/config.yml")
        ymlFile.addDefault("language", "en")
        ymlFile.addDefault("prefix", "<dark_gray>[<blue>YVtils-MM<dark_gray>]<white>")

        ymlFile.addDefault("playerUpdateMessage", true)

        ymlFile.addDefault("debug", false)

        ymlFile.options().copyDefaults(true)
        ymlFile.save(file)
    }
}