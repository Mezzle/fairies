package org.gamerpowered.fairies.renderer;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.gamerpowered.fairies.Fairies;
import org.gamerpowered.fairies.entity.EntityFairy;

public class RenderFairy extends RenderBiped
{
    protected ResourceLocation fairyTexture;

    public RenderFairy(ModelBiped model, float shadowSize)
    {
        super(model, shadowSize);
    }

    public static ResourceLocation texture = texture = new ResourceLocation(Fairies.MOD_ID.toLowerCase() + ":" + "textures/entity/fairy/basic.png");

    @Override
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return ((EntityFairy) entity).getTexture();
    }


}
