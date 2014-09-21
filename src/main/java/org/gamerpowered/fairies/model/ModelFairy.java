package org.gamerpowered.fairies.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelFairy extends ModelBiped
{
    //fields
    ModelRenderer Boobs;
    ModelRenderer bipedHead;
    ModelRenderer bipedBody;
    ModelRenderer bipedRightArm;
    ModelRenderer bipedLeftArm;
    ModelRenderer bipedRightLeg;
    ModelRenderer bipedLeftLeg;
    ModelRenderer HairB;
    ModelRenderer HairR;
    ModelRenderer HairL;
    ModelRenderer Roll;
    ModelRenderer WingL;
    ModelRenderer WingR;

    public ModelFairy()
    {
        textureWidth = 64;
        textureHeight = 128;

        Boobs = new ModelRenderer(this, 26, 70);
        Boobs.addBox(-4F, -2F, -2F, 8, 4, 2);
        Boobs.setRotationPoint(0F, 5F, -2F);
        Boobs.setTextureSize(64, 128);
        Boobs.mirror = true;
        setRotation(Boobs, 0F, 0F, 0F);
        WingL = new ModelRenderer(this, 20, 77);
        WingL.addBox(-10F, -5F, 0F, 10, 10, 0);
        WingL.setRotationPoint(0F, 7F, 2.5F);
        WingL.setTextureSize(64, 128);
        WingL.mirror = true;
        setRotation(WingL, 0F, 0F, 0F);
        WingR = new ModelRenderer(this, 0, 77);
        WingR.addBox(0F, -5F, 0F, 10, 10, 0);
        WingR.setRotationPoint(0F, 7F, 2.5F);
        WingR.setTextureSize(64, 128);
        WingR.mirror = true;
        setRotation(WingR, 0F, 0F, 0F);
        HairB = new ModelRenderer(this, 0, 70);
        HairB.addBox(-5.5F, -11F, 6F, 11, 5, 2);
        HairB.setRotationPoint(0F, 1F, 0F);
        HairB.setTextureSize(64, 128);
        HairB.mirror = true;
        setRotation(HairB, 0F, 0F, 0F);
        HairR = new ModelRenderer(this, 0, 52);
        HairR.addBox(6F, -10F, -6F, 2, 6, 12);
        HairR.setRotationPoint(0F, 1F, 0F);
        HairR.setTextureSize(64, 128);
        HairR.mirror = true;
        setRotation(HairR, 0F, 0F, 0F);
        HairL = new ModelRenderer(this, 28, 52);
        HairL.addBox(-8F, -10F, -6F, 2, 6, 12);
        HairL.setRotationPoint(0F, 1F, 0F);
        HairL.setTextureSize(64, 128);
        HairL.mirror = true;
        setRotation(HairL, 0F, 0F, 0F);
        Roll = new ModelRenderer(this, 0, 40);
        Roll.addBox(-10F, -6F, 3F, 20, 6, 6);
        Roll.setRotationPoint(0F, 1F, 0F);
        Roll.setTextureSize(64, 128);
        Roll.mirror = true;
        setRotation(Roll, 0F, 0F, 0F);
        bipedHead = new ModelRenderer(this, 0, 0);
        bipedHead.addBox(-6F, -11F, -6F, 12, 12, 12);
        bipedHead.setRotationPoint(0F, 1F, 0F);
        bipedHead.setTextureSize(64, 128);
        bipedHead.mirror = true;
        setRotation(bipedHead, 0F, 0F, 0F);
        bipedBody = new ModelRenderer(this, 16, 24);
        bipedBody.addBox(-4F, 0F, -2F, 8, 11, 4);
        bipedBody.setRotationPoint(0F, 1F, 0F);
        bipedBody.setTextureSize(64, 128);
        bipedBody.mirror = true;
        setRotation(bipedBody, 0F, 0F, 0F);
        bipedRightArm = new ModelRenderer(this, 40, 24);
        bipedRightArm.addBox(-3F, -2F, -2F, 4, 12, 4);
        bipedRightArm.setRotationPoint(-5F, 3F, 0F);
        bipedRightArm.setTextureSize(64, 128);
        bipedRightArm.mirror = true;
        setRotation(bipedRightArm, 0F, 0F, 0F);
        bipedLeftArm = new ModelRenderer(this, 40, 24);
        bipedLeftArm.addBox(-1F, -2F, -2F, 4, 12, 4);
        bipedLeftArm.setRotationPoint(5F, 3F, 0F);
        bipedLeftArm.setTextureSize(64, 128);
        bipedLeftArm.mirror = true;
        setRotation(bipedLeftArm, 0F, 0F, 0F);
        bipedRightLeg = new ModelRenderer(this, 0, 24);
        bipedRightLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
        bipedRightLeg.setRotationPoint(-2F, 12F, 0F);
        bipedRightLeg.setTextureSize(64, 128);
        bipedRightLeg.mirror = true;
        setRotation(bipedRightLeg, 0F, 0F, 0F);
        bipedLeftLeg = new ModelRenderer(this, 0, 24);
        bipedLeftLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
        bipedLeftLeg.setRotationPoint(2F, 12F, 0F);
        bipedLeftLeg.setTextureSize(64, 128);
        bipedLeftLeg.mirror = true;
        setRotation(bipedLeftLeg, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Boobs.render(f5);
        bipedHead.render(f5);
        bipedBody.render(f5);
        bipedRightArm.render(f5);
        bipedLeftArm.render(f5);
        bipedRightLeg.render(f5);
        bipedLeftLeg.render(f5);
        WingL.render(f5);
        WingR.render(f5);

        renderHair(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
    {
        bipedHead.rotateAngleY = p_78087_4_ / (180F / (float) Math.PI);
        bipedHead.rotateAngleX = p_78087_5_ / (180F / (float) Math.PI);
        bipedHeadwear.rotateAngleY = bipedHead.rotateAngleY;
        bipedHeadwear.rotateAngleX = bipedHead.rotateAngleX;
        bipedRightArm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float) Math.PI) * 2.0F * p_78087_2_ * 0.5F;
        bipedLeftArm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 2.0F * p_78087_2_ * 0.5F;
        bipedRightArm.rotateAngleZ = 0.0F;
        bipedLeftArm.rotateAngleZ = 0.0F;
        bipedRightLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        bipedLeftLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float) Math.PI) * 1.4F * p_78087_2_;
        bipedRightLeg.rotateAngleY = 0.0F;
        bipedLeftLeg.rotateAngleY = 0.0F;

        bipedRightArm.rotateAngleY = 0.0F;
        bipedLeftArm.rotateAngleY = 0.0F;
        float f6;
        float f7;

        if (onGround > -9990.0F) {
            f6 = onGround;
            bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float) Math.PI * 2.0F) * 0.2F;
            bipedRightArm.rotationPointZ = MathHelper.sin(bipedBody.rotateAngleY) * 5.0F;
            bipedRightArm.rotationPointX = -MathHelper.cos(bipedBody.rotateAngleY) * 5.0F;
            bipedLeftArm.rotationPointZ = -MathHelper.sin(bipedBody.rotateAngleY) * 5.0F;
            bipedLeftArm.rotationPointX = MathHelper.cos(bipedBody.rotateAngleY) * 5.0F;
            bipedRightArm.rotateAngleY += bipedBody.rotateAngleY;
            bipedLeftArm.rotateAngleY += bipedBody.rotateAngleY;
            bipedLeftArm.rotateAngleX += bipedBody.rotateAngleY;
            f6 = 1.0F - onGround;
            f6 *= f6;
            f6 *= f6;
            f6 = 1.0F - f6;
            f7 = MathHelper.sin(f6 * (float) Math.PI);
            float f8 = MathHelper.sin(onGround * (float) Math.PI) * -(bipedHead.rotateAngleX - 0.7F) * 0.75F;
            bipedRightArm.rotateAngleX = (float) ((double) bipedRightArm.rotateAngleX - ((double) f7 * 1.2D + (double) f8));
            bipedRightArm.rotateAngleY += bipedBody.rotateAngleY * 2.0F;
            bipedRightArm.rotateAngleZ = MathHelper.sin(onGround * (float) Math.PI) * -0.4F;
        }

        bipedBody.rotateAngleX = 0.0F;
        bipedRightLeg.rotationPointZ = 0.1F;
        bipedLeftLeg.rotationPointZ = 0.1F;
        bipedRightLeg.rotationPointY = 12.0F;
        bipedLeftLeg.rotationPointY = 12.0F;
        bipedHead.rotationPointY = 0.0F;
        bipedHeadwear.rotationPointY = 0.0F;

        bipedRightArm.rotateAngleZ += MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
        bipedLeftArm.rotateAngleZ -= MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
        bipedRightArm.rotateAngleX += MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
        bipedLeftArm.rotateAngleX -= MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;

        // I think it was the this :)

        WingL.rotateAngleY = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        WingR.rotateAngleY = -(MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
    }

    public void renderHair(float number_that_i_dont_undertand)
    {
        HairB.rotateAngleX = bipedHead.rotateAngleX;
        HairB.rotateAngleY = bipedHead.rotateAngleY;
        HairB.rotateAngleZ = bipedHead.rotateAngleZ;

        HairL.rotateAngleX = bipedHead.rotateAngleX;
        HairL.rotateAngleY = bipedHead.rotateAngleY;
        HairL.rotateAngleZ = bipedHead.rotateAngleZ;

        HairR.rotateAngleX = bipedHead.rotateAngleX;
        HairR.rotateAngleY = bipedHead.rotateAngleY;
        HairR.rotateAngleZ = bipedHead.rotateAngleZ;

        Roll.rotateAngleX = bipedHead.rotateAngleX;
        Roll.rotateAngleY = bipedHead.rotateAngleY;
        Roll.rotateAngleZ = bipedHead.rotateAngleZ;

        HairB.render(number_that_i_dont_undertand);
        HairR.render(number_that_i_dont_undertand);
        HairL.render(number_that_i_dont_undertand);
        Roll.render(number_that_i_dont_undertand);
    }
}
