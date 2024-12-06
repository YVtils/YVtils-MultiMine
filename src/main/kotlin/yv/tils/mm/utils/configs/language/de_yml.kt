package yv.tils.mm.utils.configs.language

import org.bukkit.configuration.file.YamlConfiguration
import yv.tils.mm.YVtils
import java.io.File

class de_yml {
    private var file = File(YVtils.instance.dataFolder.path + "/language", "de.yml")
    private var ymlFile: YamlConfiguration = YamlConfiguration.loadConfiguration(file)

    fun strings() {
        ymlFile.addDefault("documentation", "https://docs.yvtils.net/mm/language/de.yml")
        ymlFile.addDefault(
            "Language",
            "DE"
        )
        ymlFile.addDefault(
            "#1",
            "Bitte benutze immer alle bereits angegebenen Variablen, da ansonsten das Sprachen-System nicht korrekt funktioniert! - Variablen sind daran zu erkennen, dass sie mit kleiner/größer als Zeichen umhüllt sind (z.B. <prefix>)."
        )
        ymlFile.addDefault(
            "START_MESSAGE",
            "<prefix> <green>Plugin startet!"
        )
        ymlFile.addDefault(
            "START_COMPLETED_MESSAGE",
            "<prefix> <dark_green>YVtils-SMP Start ist abgeschlossen!"
        )
        ymlFile.addDefault(
            "STOP_MESSAGE",
            "<prefix> <red>Plugin wird gestoppt!"
        )
        ymlFile.addDefault(
            "STOP_COMPLETED_MESSAGE",
            "<prefix> <dark_red>YVtils-SMP wurde gestoppt!"
        )

        ymlFile.addDefault(
            "PLUGIN_UP_TO_DATE",
            "<prefix> <white>Das Plugin hat keine Updates zur Verfügung!"
        )
        ymlFile.addDefault(
            "PLUGIN_UPDATE_AVAILABLE",
            "<prefix> <yellow>Die Plugin Version <newversion> ist nun verfügbar. Der Server nutzt noch <oldversion>! Lade die neue Version über <link> herunter."
        )

        ymlFile.addDefault(
            "PLAYER_PLUGIN_UPDATE_AVAILABLE",
            "<prefix> <white>Update verfügbar:<newline><yellow>Verwendete Version: <gray><oldVersion><newline><yellow>Neueste Version: <gray><newVersion><newline><yellow>Download: <gray><link>"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_ADD_BLOCK",
            "<white>Der Block <yellow><block> <white>wurde zur MultiMine Liste hinzugefügt!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_REMOVE_BLOCK",
            "<white>Der Block <yellow><block> <white>wurde von der MultiMine Liste entfernt!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_ADD_MULTIPLE",
            "<white>Folgende Blöcke wurden zur MultiMine Liste hinzugefügt: <newline><yellow><blocks>"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_REMOVE_MULTIPLE",
            "<white>Folgende Blöcke wurden von der MultiMine Liste entfernt: <newline><yellow><blocks>"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_NO_BLOCK",
            "<white>Es wurde kein Block angegeben!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_NO_BLOCK_IN_HAND",
            "<white>Es wurde kein Block in der Hand gefunden!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_NO_CONTAINER_IN_HAND",
            "<white>Es wurde kein Container in der Hand gefunden!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_MULTIPLE_CONSOLE",
            "<white>Es können nicht mehrere Blöcke über die Konsole hinzugefügt werden!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_BLOCK_ALREADY_IN_LIST",
            "<white>Der Block <yellow><block> <white>ist bereits in der Liste!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_BLOCK_NOT_IN_LIST",
            "<white>Der Block <yellow><block> <white>ist nicht in der Liste!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_TOGGLE_ACTIVATE",
            "<white>MultiMine wurde <yellow>aktiviert<white>!"
        )

        ymlFile.addDefault(
            "MODULE_MULTIMINE_TOGGLE_DEACTIVATE",
            "<white>MultiMine wurde <yellow>deaktiviert<white>!"
        )

        ymlFile.options().copyDefaults(true)
        ymlFile.save(file)
    }
}