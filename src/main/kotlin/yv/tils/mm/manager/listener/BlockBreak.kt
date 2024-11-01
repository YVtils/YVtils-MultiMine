package yv.tils.mm.manager.listener

import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import yv.tils.mm.mods.multiMine.MultiMineHandler

class BlockBreak : Listener {
    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGHEST)
    fun onBlockBreakHigh(e: BlockBreakEvent) {
        MultiMineHandler().trigger(e)
    }
}