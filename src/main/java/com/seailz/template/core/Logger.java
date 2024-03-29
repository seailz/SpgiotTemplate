package com.seailz.template.core;

import com.seailz.template.TemplatePlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Logger {

    /**
     * Log something to the console
     *
     * @param level   The level of the logged message
     * @param message What message to log
     */
    public static void log(LogLevel level, String message) {
        if (message == null) return;

        switch (level) {
            case ERROR:
                Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&e[SPIGOTPLUGIN] &8[&c&lERROR&r&8] &f" + message));
                break;
            case WARNING:
                Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&e[SPIGOTPLUGIN] &8[&6&lWARNING&r&8] &f" + message));
                break;
            case INFO:
                Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&e[SPIGOTPLUGIN] &8[&e&lINFO&r&8] &f" + message));
                break;
            case SUCCESS:
                Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&e[SPIGOTPLUGIN] &8[&a&lSUCCESS&r&8] &f" + message));
                break;
            case DEBUG:
                Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&e[SPIGOTPLUGIN] &8[&c&lDEBUG&r&8] &c" + message));
                if (TemplatePlugin.getInstance().isDebug())  TemplatePlugin.getInstance().getDebugLog().add(message);
                break;
            case OUTLINE:
                Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&e[SPIGOTPLUGIN] &7" + message));
                break;
        }
    }

    public enum LogLevel {ERROR, WARNING, INFO, SUCCESS, OUTLINE, DEBUG}
}
