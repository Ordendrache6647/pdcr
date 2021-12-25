
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vfe.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.vfe.item.ZuckerstangeItem;
import net.mcreator.vfe.item.StgemuesesuppeItem;
import net.mcreator.vfe.item.SchneidebrettItem;
import net.mcreator.vfe.item.RbsuppengemuseItem;
import net.mcreator.vfe.item.MesserItem;
import net.mcreator.vfe.item.MarmeldenpresseItem;
import net.mcreator.vfe.item.MarmeladenbrotfoodItem;
import net.mcreator.vfe.item.KurbisscheibeItem;
import net.mcreator.vfe.item.JoghurtItem;
import net.mcreator.vfe.item.GemuesesuppeItem;
import net.mcreator.vfe.item.GebackenerKurbisItem;
import net.mcreator.vfe.item.GebackeneSamenItem;
import net.mcreator.vfe.item.BrotchenItem;
import net.mcreator.vfe.item.BeerensaftItem;
import net.mcreator.vfe.item.BeerenmarmeladeItem;
import net.mcreator.vfe.item.ApfelsaftItem;
import net.mcreator.vfe.item.ApfelmarmeladenbrotItem;
import net.mcreator.vfe.item.ApfelmarmeladeItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VfeModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item MARMELDENPRESSE = register(new MarmeldenpresseItem());
	public static final Item JOGHURT = register(new JoghurtItem());
	public static final Item APFELMARMELADE = register(new ApfelmarmeladeItem());
	public static final Item ZUCKERSTANGE = register(new ZuckerstangeItem());
	public static final Item BEERENMARMELADE = register(new BeerenmarmeladeItem());
	public static final Item BEERENMARMELADEBROT = register(new MarmeladenbrotfoodItem());
	public static final Item APFELMARMELADENBROT = register(new ApfelmarmeladenbrotItem());
	public static final Item BROTCHEN = register(new BrotchenItem());
	public static final Item SCHNEIDEBRETT = register(new SchneidebrettItem());
	public static final Item MESSER = register(new MesserItem());
	public static final Item RBSUPPENGEMUSE = register(new RbsuppengemuseItem());
	public static final Item GEMUESESUPPE = register(new GemuesesuppeItem());
	public static final Item STGEMUESESUPPE = register(new StgemuesesuppeItem());
	public static final Item APFELSAFT = register(new ApfelsaftItem());
	public static final Item SALAT = register(VfeModBlocks.SALAT, CreativeModeTab.TAB_FOOD);
	public static final Item BEERENSAFT = register(new BeerensaftItem());
	public static final Item KURBISSCHEIBE = register(new KurbisscheibeItem());
	public static final Item GEBACKENER_KURBIS = register(new GebackenerKurbisItem());
	public static final Item GEBACKENE_SAMEN = register(new GebackeneSamenItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
