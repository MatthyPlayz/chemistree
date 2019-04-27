package chemistree.init;

import chemistree.items.ItemBasic;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=chemistree.Reference.MODID)
public class ModItems {
	
	static Item flaskItem;
	static Item electroMachine;
	static Item brine;
	static Item hydrogenChloride;
	static Item flaskHclItem;
	
	public static void init() {
		brine = new ItemBasic("brine");
		flaskItem = new ItemBasic("flask");
		electroMachine = new ItemBasic("electrolysis_machine");
		hydrogenChloride = new ItemBasic("hydrogen_chloride");
		flaskHclItem = new ItemBasic("flask_hcl");
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(flaskItem, electroMachine, brine, hydrogenChloride, flaskHclItem);
	}
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(flaskItem);
		registerRender(electroMachine);
		registerRender(brine);
		registerRender(hydrogenChloride);
		registerRender(flaskHclItem);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}
