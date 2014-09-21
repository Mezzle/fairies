package org.gamerpowered.fairies.config;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler extends com.sydiw.mclib.config.ConfigHandler
{
    protected static boolean testValue;

    public static void loadConfiguration()
    {
        testValue = configuration.getBoolean("Test", Configuration.CATEGORY_GENERAL, false, "Test Value");
    }
}
