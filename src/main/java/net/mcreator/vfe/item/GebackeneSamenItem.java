
package net.mcreator.vfe.item;

public class GebackeneSamenItem extends Item {

	public GebackeneSamenItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.3f)

						.build()));
		setRegistryName("gebackene_samen");
	}

}
