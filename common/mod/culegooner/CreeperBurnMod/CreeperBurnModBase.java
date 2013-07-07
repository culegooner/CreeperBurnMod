package mod.culegooner.CreeperBurnMod;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = CreeperBurnModLib.MOD_ID, name = CreeperBurnModLib.MOD_NAME, version = CreeperBurnModLib.VERSION_NUMBER)
//, dependencies = CreeperBurnModLib.DEPENDENCIES, certificateFingerprint = CreeperBurnModLib.FINGERPRINT)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class CreeperBurnModBase {

	

	
	
	
	@EventHandler
    public void preModInit(FMLPreInitializationEvent event) {
    }
 
	@EventHandler
    public void modInit(FMLInitializationEvent event) {
    	
        EntityRegistry.registerGlobalEntityID(CreeperBurnModCreeper.class, "CreeperBurnModCreeper", EntityRegistry.findGlobalUniqueEntityId(), 6750105, 7859797);
        EntityRegistry.registerModEntity(CreeperBurnModCreeper.class, "CreeperBurnModCreeper", 3, this, 64, 3, true);
        
        MinecraftForge.EVENT_BUS.register(new EntityLivingHandler());
            	
    	LanguageRegistry.instance().addStringLocalization("entity."+CreeperBurnModLib.MOD_NAME +".CreeperBurnModCreeper.name", "CreeperBurnModCreeper");
    }
    
	@EventHandler
    public void modsLoaded(FMLPostInitializationEvent event) {
    	
    }
	
    
}
