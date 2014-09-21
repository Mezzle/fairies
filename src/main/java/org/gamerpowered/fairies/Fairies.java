package org.gamerpowered.fairies;

import com.sydiw.mclib.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.gamerpowered.fairies.init.InitEntities;
import org.gamerpowered.fairies.proxy.CommonProxy;

import static org.gamerpowered.fairies.Fairies.*;

@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION)
public class Fairies
{
    public static final String MOD_ID = "Fairies";
    public static final String MOD_NAME = "Fairies";
    public static final String MOD_VERSION = "0.0.1";
    public static final String CLIENT_PROXY_CLASS = "org.gamerpowered.fairies.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "org.gamerpowered.fairies.proxy.ServerProxy";
    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS, modId = MOD_ID)
    public static CommonProxy proxy;
    @Mod.Instance(MOD_ID)
    public static Fairies instance;
    protected static int modEntityID = 0;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.init(MOD_NAME);

        proxy.registerRenderers();

        InitEntities.init();
    }
}

