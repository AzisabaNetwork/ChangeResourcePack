package net.azisaba.yukitexture.command

import net.azisaba.yukitexture.YukiTexture
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class TextureCommand(private val plugin: YukiTexture) : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) return true
        plugin.applyTexAsync(sender)
        return true
    }
}
