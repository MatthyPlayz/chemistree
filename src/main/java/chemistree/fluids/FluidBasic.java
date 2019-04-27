package chemistree.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidBasic extends Fluid 
{
	public FluidBasic(String name, ResourceLocation still, ResourceLocation flow) 
	{
		super(name, still, flow);
		this.setUnlocalizedName(name);
	}
}