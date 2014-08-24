package org.gamerpowered.fairies;

import static org.gamerpowered.fairies.Fairies.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;

@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION)
public class Fairies
{
    public static final String MOD_ID = "Fairies";
    public static final String MOD_NAME = "Fairies";
    public static final String MOD_VERSION = "0.0.1";

    @Mod.Instance(MOD_ID)
    public static Fairies instance;
}
