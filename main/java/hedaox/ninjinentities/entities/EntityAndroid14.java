package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityAndroid14 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityAndroid14(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, true, new byte[]{6, 5}, new byte[]{2, 2});
		this.experienceValue = 80;
		this.setSize(0.66F,1.98F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				8500.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				850.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/android14.png";
	}
}
