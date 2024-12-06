package yv.tils.mm.utils.configs.multiMine

import org.bukkit.configuration.file.YamlConfiguration
import yv.tils.mm.YVtils
import java.io.File

class save_yml_multiMine {
    private var file = File(YVtils.instance.dataFolder.path, "multiMine/" + "save.yml")
    private var ymlFile: YamlConfiguration = YamlConfiguration.loadConfiguration(file)

    fun strings() {
        ymlFile.addDefault("documentation", "https://docs.yvtils.net/mm/multiMine/save.yml")

        ymlFile.options().copyDefaults(true)
        ymlFile.save(file)
    }
}