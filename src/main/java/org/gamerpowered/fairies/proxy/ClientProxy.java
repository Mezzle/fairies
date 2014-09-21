package org.gamerpowered.fairies.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import org.gamerpowered.fairies.entity.EntityFairy;
import org.gamerpowered.fairies.model.ModelFairy;
import org.gamerpowered.fairies.renderer.RenderFairy;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityFairy.class, new RenderFairy(new ModelFairy(), 0.5F));
    }
}
