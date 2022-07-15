/**
 * The entry point for your mod.
 */
package plugin.myplugin;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.lilithsthrone.game.character.GameCharacter;
import com.lilithsthrone.game.character.fetishes.AbstractFetish;
import com.lilithsthrone.game.character.npc.NPC;
import com.lilithsthrone.game.inventory.enchanting.PossibleItemEffect;
import com.lilithsthrone.game.sex.SexType;
import com.lilithsthrone.modding.BasePlugin;

/**
 * @author Anonymous-BCFED
 * @version 0.4.4.1
 */
public class MyExamplePlugin extends BasePlugin {

	@Override
	public void onStartup() {
		// This is called when your plugin is first loaded.
		// System.out.println("Hello world!");
	}

	// You can get rid of any of these you don't use.

	@Override
	public boolean isSatisfied(HashSet<String> loadedTags) {
		// Returns true if the plugin is ready to load.
		// The super returns true if all the tags are satisfied
		return super.isSatisfied(loadedTags);
	}

	@Override
	public void onNPCGenerateTransformativePotion(NPC npc, GameCharacter target,
			List<PossibleItemEffect> possibleEffects) {
		// TODO Auto-generated method stub
		super.onNPCGenerateTransformativePotion(npc, target, possibleEffects);
	}

	// Called after perks are all loaded.
	@Override
	public void onInitPerks() {
		// Perk.addPerk("PERK_ID", new MyCoolPerk());
		// You will also have to do things to the perk table.
		// See com.lilithsthrone.game.character.effects.PerkManager
	}

	@Override
	public void onInitUniqueNPCs(List<Class<? extends NPC>> addedNpcs) {
		// Add custom NPCs here.
		// if(!Main.game.NPCMap.containsKey(Main.game.getUniqueNPCId(HeadlessHorseman.class)))
		// {
		// addNPC(new GaryBuseyNPC(), false);
		// addedNpcs.add(GaryBuseyNPC.class);
		// }
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

	@Override
	public Collection<? extends String> getProvidedTags() {
		// TODO Auto-generated method stub
		return super.getProvidedTags();
	}

	@Override
	public void getRelatedFetishes(List<AbstractFetish> fetishes, GameCharacter characterPerforming,
			GameCharacter characterTargeted, boolean isPenetration, boolean isOrgasm) {
		// TODO Auto-generated method stub
		super.getRelatedFetishes(fetishes, characterPerforming, characterTargeted, isPenetration, isOrgasm);
	}

	@Override
	public void onAfterGenerateDesires(GameCharacter character, List<AbstractFetish> availableFetishes,
			Map<AbstractFetish, Integer> desireMap, Map<AbstractFetish, Integer> negativeMap, int desiresAssigned) {
		// TODO Auto-generated method stub
		super.onAfterGenerateDesires(character, availableFetishes, desireMap, negativeMap, desiresAssigned);
	}

	@Override
	public void onGenerateDesiresAvailableFetishesFixup(GameCharacter character,
			List<AbstractFetish> availableFetishes) {
		// TODO Auto-generated method stub
		super.onGenerateDesiresAvailableFetishesFixup(character, availableFetishes);
	}

	@Override
	public void onGenerateSexChoicesAddSexTypes(GameCharacter ctx, boolean resetPositioningBan, GameCharacter target,
			List<SexType> request, Map<SexType, Integer> foreplaySexTypes, Map<SexType, Integer> mainSexTypes) {
		// Adds SexTypes for generating SexChoices.
		//addSexTypeWeighting(ctx, new SexType(SexParticipantType.NORMAL, SexAreaPenetration.FINGER, SexAreaOrifice.ANUS), target, request, foreplaySexTypes, 1);
		//addSexTypeWeighting(ctx, new SexType(SexParticipantType.NORMAL, SexAreaPenetration.TONGUE, SexAreaOrifice.ANUS), target, request, foreplaySexTypes, 1);
	}

}
