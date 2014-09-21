package org.gamerpowered.fairies.init;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import org.gamerpowered.fairies.Fairies;
import org.gamerpowered.fairies.entity.EntityFairy;
import org.gamerpowered.fairies.item.ThingSpawner;

public class InitEntities
{
    protected static int entityID = 0;

    public static void init()
    {
        registerMobAndEgg(EntityFairy.class, "Fairy", 0xffaec9, 0xe6e6e6);
    }

    protected static void registerMobAndEgg(Class<? extends Entity> entityClass, String name, int primaryColor, int secondaryColor)
    {
        EntityRegistry.registerModEntity(entityClass, name, ++entityID, Fairies.instance, 80, 3, true);
        registerEgg(name, primaryColor, secondaryColor);

    }

    protected static void registerEgg(String name, int primaryColor, int secondaryColor)
    {
        Item itemSpawnEgg = new ThingSpawner(name, primaryColor, secondaryColor)
                .setUnlocalizedName("spawn_egg_" + name.toLowerCase())
                .setTextureName(Fairies.MOD_ID.toLowerCase() + ":spawn_egg");
        GameRegistry.registerItem(itemSpawnEgg, "spawnEgg" + name);
    }
}
