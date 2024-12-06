package yv.tils.mm.manager.startup

import yv.tils.mm.utils.configs.global.Config
import yv.tils.mm.utils.configs.global.config_yml
import yv.tils.mm.utils.configs.language.Language
import yv.tils.mm.utils.configs.language.de_yml
import yv.tils.mm.utils.configs.language.en_yml
import yv.tils.mm.utils.configs.multiMine.MultiMineConfig
import yv.tils.mm.utils.configs.multiMine.config_yml_multiMine
import yv.tils.mm.utils.configs.multiMine.save_yml_multiMine

class Configs {
    fun register() {
        de_yml().strings()
        en_yml().strings()

        config_yml().strings()
        config_yml_multiMine().strings()

        save_yml_multiMine().strings()
    }

    fun load() {
        Language().getLanguageFiles()
        Config().loadConfig()
        MultiMineConfig().loadConfig()
    }
}