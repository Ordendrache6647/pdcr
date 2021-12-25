
package net.mcreator.vfe.item;

public class GebackenerKurbisItem extends Item {

	public GebackenerKurbisItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

						.build()));
		setRegistryName("gebackener_kurbis");
	}

}
