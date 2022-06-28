/**
 * The entry point for your mod.
 */
package plugin.myplugin;

import java.util.HashSet;
import java.util.List;

import com.lilithsthrone.game.character.fetishes.Fetish;
import com.lilithsthrone.game.character.npc.NPC;
import com.lilithsthrone.modding.BasePlugin;

/**
 * @author Anonymous-BCFED
 * @version 0.4.4.1
 */
public class MyExamplePlugin extends BasePlugin {

	@Override
	public void onStartup() {
		// This is called when your plugin is first loaded.
		//System.out.println("Hello world!");
	}
	
	// You can get rid of any of these you don't use.

	@Override
	public boolean isSatisfied(HashSet<String> loadedTags) {
		// Returns true if the plugin is ready to load.
		// The super returns true if all the tags are satisfied
		return super.isSatisfied(loadedTags);
	}
	
	@Override
	public void addFetishes(HashSet<Fetish> providedFetishes) {
		// Add new fetishes here.
		// Only called once.
		//providedFetishes.add(new MyWeirdFetish());
	}

	// Called after perks are all loaded.
	@Override
	public void onInitPerks() {
		//Perk.addPerk("PERK_ID", new MyCoolPerk());
	}

	@Override
	public void onInitUniqueNPCs(List<Class<? extends NPC>> addedNpcs) {
		// Add custom NPCs here.
		//if(!Main.game.NPCMap.containsKey(Main.game.getUniqueNPCId(HeadlessHorseman.class))) { 
		//	addNPC(new GaryBuseyNPC(), false); 
		//	addedNpcs.add(GaryBuseyNPC.class); 
		//}
	}

	@Override
	public void onMainMain() {
		// Called after Main.main()
	}

	@Override
	public void onMainStart() {
		// Called after Main.start()
	}

	@Override
	public void onPluginsLoaded() {
		// Called after all plugins are loaded.
	}

}
