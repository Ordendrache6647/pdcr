
package net.mcreator.vfe.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class MarmeladenbrotItem extends Item {

	public MarmeladenbrotItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("marmeladenbrot");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
