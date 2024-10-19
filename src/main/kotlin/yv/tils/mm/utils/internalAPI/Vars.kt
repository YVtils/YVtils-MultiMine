package yv.tils.mm.utils.internalAPI

import yv.tils.mm.utils.configs.global.Config

class Vars {
    var prefix = "<dark_gray>[<blue>YVtils-MM<dark_gray>]<white>"
    var prefixCustom = " ${Config.config["prefix"]}"
}