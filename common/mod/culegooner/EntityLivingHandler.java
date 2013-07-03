package mod.culegooner;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;



public class EntityLivingHandler {

	@ForgeSubscribe
    public void onEntityLivingSpawn(LivingSpawnEvent event) {
    	 
    	if (!event.world.isRemote)
         {
    	     	 
    	 if (event.entityLiving instanceof EntityCreeper)
    	 {
    		 EntityCreeper b = (EntityCreeper) event.entityLiving;  
    		 if (b.getCanSpawnHere()){
    			 CreeperBurnModCreeper newCreeper = new CreeperBurnModCreeper(event.world);
        		 newCreeper.setLocationAndAngles(b.posX, b.posY, b.posZ, b.rotationYaw, b.rotationPitch);
        		 event.world.spawnEntityInWorld(newCreeper);
        		 b.setDead();
        		 //event.setCanceled(true);
    		 }
    		
    	 }
         }
    }
    
 
    
    
}
