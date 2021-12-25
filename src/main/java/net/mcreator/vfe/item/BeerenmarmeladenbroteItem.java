
package net.mcreator.vfe.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class BeerenmarmeladenbroteItem extends Item {
	public BeerenmarmeladenbroteItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("beerenmarmeladenbrote");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
