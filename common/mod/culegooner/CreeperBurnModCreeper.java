package mod.culegooner;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class CreeperBurnModCreeper extends EntityCreeper {

	public CreeperBurnModCreeper(World par1World) {
		super(par1World);
		// TODO Auto-generated constructor stub
	}

	   public void onLivingUpdate()
	    {
	        if (this.worldObj.isDaytime() && !this.worldObj.isRemote)
	        {
	            float f = this.getBrightness(1.0F);

	            if (f > 0.5F && this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)))
	            {
	               
	                 this.setFire(8); //BURN!
	                
	            }
	        }

	        super.onLivingUpdate();
	    }

	   
}
