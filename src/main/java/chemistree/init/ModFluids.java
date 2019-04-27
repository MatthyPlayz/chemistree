package chemistree.init;

import chemistree.Reference;
import chemistree.fluids.FluidBasic;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid=chemistree.Reference.MODID)
public class ModFluids {
	
	public static final Fluid acid_hcl_fluid = new FluidBasic("acid_hcl", new ResourceLocation(Reference.MODID + ":fluids/hydrocloric_acid_still"), new ResourceLocation(Reference.MODID + ":fluids/hydrocloric_acid_flowing"));
	
	public static void init() {
		registerFluids();
	}
	public static void registerFluids() {
		registerFluid(acid_hcl_fluid);
	}
		
		public static void registerFluid(Fluid fluid)
		{
			FluidRegistry.registerFluid(fluid);
			FluidRegistry.addBucketForFluid(fluid);
		}
}
