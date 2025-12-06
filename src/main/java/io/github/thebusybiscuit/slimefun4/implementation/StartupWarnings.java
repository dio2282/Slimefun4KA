package io.github.thebusybiscuit.slimefun4.implementation;

import io.github.thebusybiscuit.slimefun4.utils.NumberUtils;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * This class stores some startup warnings we occasionally need to print.
 * If you setup your server the recommended way, you are never going to see
 * any of these messages.
 *
 * @author TheBusyBiscuit
 *
 */
final class StartupWarnings {

    private static final String BORDER = "****************************************************";
    private static final String PREFIX = "* ";

    private StartupWarnings() {}

    @ParametersAreNonnullByDefault
    static void discourageCSCoreLib(Logger logger) {
        logger.log(Level.SEVERE, BORDER);
        logger.log(Level.SEVERE, PREFIX + "It seems you are still using CS-CoreLib.");
        logger.log(Level.SEVERE, PREFIX);
        logger.log(Level.SEVERE, PREFIX + "Since 2021/01/30, Slimefun");
        logger.log(Level.SEVERE, PREFIX + "no longer requires CS-CoreLib,");
        logger.log(Level.SEVERE, PREFIX + "You need to remove CS-CoreLib");
        logger.log(Level.SEVERE, PREFIX + "for Slimefun to work properly.");
        logger.log(Level.SEVERE, BORDER);
    }

    @ParametersAreNonnullByDefault
    static void invalidMinecraftVersion(Logger logger, int majorVersion, String slimefunVersion) {
        logger.log(Level.SEVERE, BORDER);
        logger.log(Level.SEVERE, PREFIX + "Slimefun was not installed correctly!");
        logger.log(Level.SEVERE, PREFIX + "You are using an unsupported Minecraft version!");
        logger.log(Level.SEVERE, PREFIX);
        logger.log(Level.SEVERE, PREFIX + "You are using Minecraft 1.{0}.x", majorVersion);
        logger.log(Level.SEVERE, PREFIX + "but Slimefun {0} only supports", slimefunVersion);
        logger.log(Level.SEVERE, PREFIX + "Minecraft {0}", String.join(" / ", Slimefun.getSupportedVersions()));
        logger.log(Level.SEVERE, BORDER);
    }

    @ParametersAreNonnullByDefault
    static void invalidServerSoftware(Logger logger) {
        logger.log(Level.SEVERE, BORDER);
        logger.log(Level.SEVERE, PREFIX + "Slimefun was not installed correctly!");
        logger.log(Level.SEVERE, PREFIX + "We no longer support CraftBukkit servers!");
        logger.log(Level.SEVERE, PREFIX);
        logger.log(Level.SEVERE, PREFIX + "Slimefun requires you to use Spigot, Paper");
        logger.log(Level.SEVERE, PREFIX + "or any server software based on Spigot/Paper.");
        logger.log(Level.SEVERE, PREFIX + "(We recommend Paper)");
        logger.log(Level.SEVERE, BORDER);
    }

    @ParametersAreNonnullByDefault
    static void oldJavaVersion(Logger logger, int recommendedJavaVersion) {
        int javaVersion = NumberUtils.getJavaVersion();

        logger.log(Level.WARNING, BORDER);
        logger.log(Level.WARNING, PREFIX + "The Java version you are using (Java {0}) is outdated.", javaVersion);
        logger.log(Level.WARNING, PREFIX);
        logger.log(Level.WARNING, PREFIX + "Due to newer Minecraft versions requiring Java {0},", recommendedJavaVersion);
        logger.log(Level.WARNING, PREFIX + "we recommend upgrading to Java {0} as soon as possible.", recommendedJavaVersion);
        logger.log(Level.WARNING, PREFIX + "Also, to take advantage of new Java features,");
        logger.log(Level.WARNING, PREFIX + "Slimefun will also require Java {0} in the near future.", recommendedJavaVersion);
        logger.log(Level.WARNING, PREFIX + "To avoid affecting your future usage, please update as soon as possible!");
        logger.log(Level.WARNING, BORDER);
    }
}
