package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class ModelSuperA17 extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer LLeg;
	private final ModelRenderer RLeg;
	private final ModelRenderer LArm;
	private final ModelRenderer RArm;
	private final ModelRenderer head;
	private final ModelRenderer Hair_r1;
	private final ModelRenderer Hair_r2;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelSuperA17(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LLeg.mirror = true;
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LArm.mirror = true;
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));
		head.cubeList.add(new ModelBox(head, 32, 0, -4.0F, 0.0F, -4.0F, 8, 8, 8, 0.0F));

		Hair_r1 = new ModelRenderer(this);
		Hair_r1.setRotationPoint(1.0F, -8.0F, -4.0F);
		Hair_r1.mirror = true;
		head.addChild(Hair_r1);
		setRotationAngle(Hair_r1, 0.0F, -0.2618F, -0.2182F);
		Hair_r1.cubeList.add(new ModelBox(Hair_r1, 24, -2, 0.0F, 0.0F, -1.9F, 0, 8, 2, 0.0F));

		Hair_r2 = new ModelRenderer(this);
		Hair_r2.setRotationPoint(-1.0F, -8.0F, -4.0F);
		head.addChild(Hair_r2);
		setRotationAngle(Hair_r2, 0.0F, 0.2618F, 0.2182F);
		Hair_r2.cubeList.add(new ModelBox(Hair_r2, 24, -2, 0.0F, 0.0F, -1.9F, 0, 8, 2, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scaleY/0.45F,1.88F)))), 0.0F);
		head.render(f5);
		Body.render(f5);
		GL11.glPopMatrix();
		this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
		this.RArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		this.LArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
		this.RArm.rotateAngleZ = 0.0F;
		this.LArm.rotateAngleZ = 0.0F;
		this.RLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.LLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		this.RLeg.rotateAngleY = 0.0F;
		this.LLeg.rotateAngleY = 0.0F;
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}