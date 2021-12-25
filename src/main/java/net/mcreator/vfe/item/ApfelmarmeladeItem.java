
package net.mcreator.vfe.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class ApfelmarmeladeItem extends Item {

	public ApfelmarmeladeItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("apfelmarmelade");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
