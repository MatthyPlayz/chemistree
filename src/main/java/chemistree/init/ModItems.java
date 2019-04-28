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
	static Item saltwater;
	static Item detergent;
	static Item sodiumHydroxide;
	static Item woodPulp;
	static Item amcoh;
	static Item magnetTemplate;
	static Item magnet;
	static Item wire;
	static Item motor;
	static Item crusher;
	static Item crushedSodiumHydroxide;
	static Item saltTemplate;
	static Item salt;
	static Item magnesiumPowder;
	public static void init() {
		//salt required items
		brine = new ItemBasic("brine");
		
		//flasks
		flaskItem = new ItemBasic("flask");
		flaskHclItem = new ItemBasic("flask_hcl");
		
		//machines
		electroMachine = new ItemBasic("electrolysis_machine");
		amcoh = new ItemBasic("amc_100");
		crusher = new ItemBasic("crusher");
		
		//parts to machines
		wire = new ItemBasic("wire");
		motor = new ItemBasic("motor");
		
		//elements
		hydrogenChloride = new ItemBasic("hydrogen_chloride");
		sodiumHydroxide = new ItemBasic("sodium_hydroxide");
		crushedSodiumHydroxide = new ItemBasic("crushed_sodium_hydroxide");
		salt = new ItemBasic("salt");
		magnesiumPowder = new ItemBasic("magnesium_powder");
		
		//misc
		saltwater = new ItemBasic("saltwater_flask");
		detergent = new ItemBasic("detergent");
		woodPulp = new ItemBasic("wood_pulp");
		
		// templates for AMC-100
		magnetTemplate = new ItemBasic("magnet_template");
		saltTemplate = new ItemBasic("salt_template");
		
	    // products of AMC-100
		magnet = new ItemBasic("magnet");
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				flaskItem, 
				electroMachine, 
				brine, 
				hydrogenChloride, 
				flaskHclItem, 
				saltwater, 
				detergent,
				sodiumHydroxide,
				woodPulp,
				amcoh,
				magnetTemplate,
				magnet,
				wire,
				motor,
				crusher,
				crushedSodiumHydroxide,
				saltTemplate,
				salt,
				magnesiumPowder
				);
	}
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(flaskItem);
		registerRender(electroMachine);
		registerRender(brine);
		registerRender(hydrogenChloride);
		registerRender(flaskHclItem);
		registerRender(saltwater);
		registerRender(detergent);
		registerRender(sodiumHydroxide);
		registerRender(woodPulp);
		registerRender(amcoh);
		registerRender(magnetTemplate);
		registerRender(magnet);
		registerRender(wire);
		registerRender(motor);
		registerRender(crusher);
		registerRender(crushedSodiumHydroxide);
		registerRender(saltTemplate);
		registerRender(salt);
		registerRender(magnesiumPowder);
	}
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}
