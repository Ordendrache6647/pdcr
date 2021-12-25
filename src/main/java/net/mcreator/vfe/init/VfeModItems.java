
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vfe.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.vfe.item.ZuckerstangeItem;
import net.mcreator.vfe.item.TestItem;
import net.mcreator.vfe.item.MarmeldenpresseItem;
import net.mcreator.vfe.item.MarmeladenbrotneuItem;
import net.mcreator.vfe.item.MarmeladenbrotItem;
import net.mcreator.vfe.item.JoghurtItem;
import net.mcreator.vfe.item.BeerenmarmeladenbrotItem;
import net.mcreator.vfe.item.BeerenmarmeladeItem;
import net.mcreator.vfe.item.ApfelmarmeladeItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VfeModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item TEST = register(new TestItem());
	public static final Item MARMELDENPRESSE = register(new MarmeldenpresseItem());
	public static final Item JOGHURT = register(new JoghurtItem());
	public static final Item APFELMARMELADE = register(new ApfelmarmeladeItem());
	public static final Item MARMELADENBROT = register(new MarmeladenbrotItem());
	public static final Item ZUCKERSTANGE = register(new ZuckerstangeItem());
	public static final Item BEERENMARMELADE = register(new BeerenmarmeladeItem());
	public static final Item MARMELADENBROTNEU = register(new MarmeladenbrotneuItem());
	public static final Item BEERENMARMELADENBROT = register(new BeerenmarmeladenbrotItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
