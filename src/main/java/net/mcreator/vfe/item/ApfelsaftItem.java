
package net.mcreator.vfe.item;

public class ApfelsaftItem extends Item {

	public ApfelsaftItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.3f)

						.build()));
		setRegistryName("apfelsaft");
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

}
