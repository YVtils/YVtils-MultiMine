package yv.tils.mm.utils.configs.language

import org.bukkit.configuration.file.YamlConfiguration
import yv.tils.mm.YVtils
import java.io.File

class en_yml {
    private var file = File(YVtils.instance.dataFolder.path + "/language", "en.yml")
    private var ymlFile: YamlConfiguration = YamlConfiguration.loadConfiguration(file)

    fun strings() {
        ymlFile.addDefault("documentation", "https://docs.yvtils.net/mm/language/en.yml")
        ymlFile.addDefault(
            "Language",
            "EN"
        )
        ymlFile.addDefault(
            "#1",
            "Please always use given variables! You can recognize them by looking for words in '<' and '>' (i.e. <prefix>)"
        )
        ymlFile.addDefault(
            "START_MESSAGE",
            "<prefix> <green>Plugin is starting!"
        )
        ymlFile.addDefault(
            "START_COMPLETED_MESSAGE",
            "<prefix> <dark_green>Plugin has started successfully!"
        )
        ymlFile.addDefault(
            "STOP_MESSAGE",
            "<prefix> <red>Plugin is getting stopped!"
        )
        ymlFile.addDefault(
            "STOP_COMPLETED_MESSAGE",
            "<prefix> <dark_red>Plugin got stopped!"
        )
        ymlFile.addDefault(
            "PLUGIN_UP_TO_DATE",
            "<prefix> <white>The Plugin has no Updates available!"
        )
        ymlFile.addDefault(
            "PLUGIN_UPDATE_AVAILABLE",
            "<prefix> <yellow>The Plugin Version <newversion> is now available. The Server is using <oldversion>. Download the newest version here <link>"
        )

        ymlFile.addDefault(
            "PLAYER_PLUGIN_UPDATE_AVAILABLE",
            "<prefix> <white>Update available:<newline><yellow>Running Version: <gray><oldVersion><newline><yellow>Newest Version: <gray><newVersion><newline><yellow>Download: <gray><link>"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_ADD_BLOCK",
            "<white>The block <yellow><block> <white>was added to the MultiMine list!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_REMOVE_BLOCK",
            "<white>The block <yellow><block> <white>was removed from the MultiMine list!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_ADD_MULTIPLE",
            "<white>The following blocks were added to the MultiMine list: <newline><yellow><blocks>"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_REMOVE_MULTIPLE",
            "<white>The following blocks were removed from the MultiMine list: <newline><yellow><blocks>"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_NO_BLOCK",
            "<white>No block was specified!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_NO_BLOCK_IN_HAND",
            "<white>No block was found in your hand!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_NO_CONTAINER_IN_HAND",
            "<white>No container was found in your hand!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_MULTIPLE_CONSOLE",
            "<white>Multiple blocks can't be added via console!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_BLOCK_ALREADY_IN_LIST",
            "<white>The block <yellow><block> <white>is already in the list!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_BLOCK_NOT_IN_LIST",
            "<white>The block <yellow><block> <white>is not in the list!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_TOGGLE_ACTIVATE",
            "<white>MultiMine is now <yellow>activated<white>!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_TOGGLE_DEACTIVATE",
            "<white>MultiMine is now <yellow>deactivated<white>!"
        )

        ymlFile.options().copyDefaults(true)
        ymlFile.save(file)
    }
}