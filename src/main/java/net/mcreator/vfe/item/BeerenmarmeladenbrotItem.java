
package net.mcreator.vfe.item;

public class BeerenmarmeladenbrotItem extends Item {

	public BeerenmarmeladenbrotItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

						.build()));
		setRegistryName("beerenmarmeladenbrot");
	}

}
