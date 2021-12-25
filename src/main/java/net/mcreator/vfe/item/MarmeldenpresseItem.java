
package net.mcreator.vfe.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class MarmeldenpresseItem extends Item {

	public MarmeldenpresseItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("marmeldenpresse");
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
