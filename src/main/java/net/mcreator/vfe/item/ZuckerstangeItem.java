
package net.mcreator.vfe.item;

public class ZuckerstangeItem extends Item {

	public ZuckerstangeItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.4f)

						.build()));
		setRegistryName("zuckerstange");
	}

}
