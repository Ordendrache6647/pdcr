
package net.mcreator.vfe.item;

public class ApfelmarmeladenbrotItem extends Item {

	public ApfelmarmeladenbrotItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(9).saturationMod(0.3f)

						.build()));
		setRegistryName("apfelmarmeladenbrot");
	}

}
