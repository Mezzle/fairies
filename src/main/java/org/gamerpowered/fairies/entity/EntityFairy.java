package org.gamerpowered.fairies.entity;

import com.sydiw.mclib.utility.LogHelper;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.gamerpowered.fairies.Fairies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntityFairy extends EntityTameable
{
    public static Map<String, ResourceLocation> textureLocations = new HashMap<String, ResourceLocation>();

    protected ResourceLocation texture;

    public EntityFairy(World world)
    {
        super(world);
        pickRandomSkin();
        this.setSize(0.6F, 2.0F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
        //this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
        //        this.tasks.addTask(3, new EntityAITempt(this, 0.9D, Items.sugar, false));
        //this.tasks.addTask(3, new EntityAILeapAtTarget(this, 0.4F));
        //      this.tasks.addTask(4, new EntityAIAttackOnCollide(this, 1.0D, true));
        this.tasks.addTask(5, new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
    }

    protected void pickRandomSkin()
    {
        List<String> list = new ArrayList<String>();

        list.add("basic.png");
        list.add("redblue.png");

        String random = list.get(this.rand.nextInt(list.size()));

        if (!textureLocations.containsKey(random)) {
            textureLocations.put(random, new ResourceLocation(Fairies.MOD_ID + ":textures/entity/fairy/" + random));
        }

        LogHelper.warn("Texture: " + random);

        this.texture = textureLocations.get(random);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable p_90011_1_)
    {
        return null;
    }

    //This is required. If it's false, none of the above takes effect.
    public boolean isAIEnabled()
    {
        return true;
    }

    @Override
    public boolean interact(EntityPlayer player)
    {
        ItemStack itemStack = player.inventory.getCurrentItem();

        if (!this.isTamed()) {
            if (itemStack != null) {
                if (itemStack.getItem() == Items.speckled_melon) {
                    if (!this.worldObj.isRemote) {
                        if (this.rand.nextInt(3) == 0) {
                            this.setTamed(true);
                            this.setPathToEntity((PathEntity) null);
                            this.setAttackTarget((EntityLivingBase) null);
                            this.aiSit.setSitting(true);
                            this.setHealth(20.0F);
                            this.func_152115_b(player.getUniqueID().toString());
                            this.setCustomNameTag(player.getDisplayName() + "'s Fairy");
                            LogHelper.warn("Foo:" + player.getUniqueID().toString());
                            this.playTameEffect(true);
                            this.worldObj.setEntityState(this, (byte) 7);
                        }
                    }
                }
            }
        }

        return super.interact(player);
    }

    public ResourceLocation getTexture()
    {
        return this.texture;
    }
}
