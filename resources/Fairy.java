// Date: 21/09/2014 15:25:18
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelFairy extends ModelBase
{
  //fields
    ModelRenderer Boobs;
    ModelRenderer WingL;
    ModelRenderer WingR;
    ModelRenderer HairB;
    ModelRenderer HairR;
    ModelRenderer HairL;
    ModelRenderer Roll;
    ModelRenderer bipedHead;
    ModelRenderer bipedBody;
    ModelRenderer bipedRightArm;
    ModelRenderer bipedLeftArm;
    ModelRenderer bipedRightLeg;
    ModelRenderer bipedLeftLeg;
  
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
      bipedHead.addBox(-6F, -12F, -6F, 12, 12, 12);
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
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Boobs.render(f5);
    WingL.render(f5);
    WingR.render(f5);
    HairB.render(f5);
    HairR.render(f5);
    HairL.render(f5);
    Roll.render(f5);
    bipedHead.render(f5);
    bipedBody.render(f5);
    bipedRightArm.render(f5);
    bipedLeftArm.render(f5);
    bipedRightLeg.render(f5);
    bipedLeftLeg.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
