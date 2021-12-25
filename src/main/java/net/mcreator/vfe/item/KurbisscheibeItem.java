
package net.mcreator.vfe.item;

public class KurbisscheibeItem extends Item {

	public KurbisscheibeItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.3f)

						.build()));
		setRegistryName("kurbisscheibe");
	}

}
